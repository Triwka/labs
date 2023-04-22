package lab5;

import java.util.Arrays;
import java.util.concurrent.*;

public class Example6 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Исходный массив целых чисел
        int[] arr = {68, 29, 85, 15, 58, 73, 43, 99, 24, 47, 11, 97};

        // Получаем количество ядер процессора
        int numThreads = Runtime.getRuntime().availableProcessors();
        // Создаем ExecutorService с фиксированным количеством потоков (равным количеству ядер процессора)
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        // Вычисляем размер каждой части массива, которую будет обрабатывать каждый поток
        int chunkSize = arr.length / numThreads;
        // Задаем начальный и конечный индексы для каждой части массива
        int startIndex = 0;
        int endIndex = chunkSize;

        // Создаем массив Callable-объектов для суммирования каждой части массива
        Callable<Integer>[] tasks = new Callable[numThreads];
        for (int i = 0; i < numThreads; i++) {
            // Если это последний поток, то он будет обрабатывать оставшуюся часть массива
            if (i == numThreads - 1) {
                endIndex = arr.length;
            }
            // Создаем Callable-объект для текущей части массива
            tasks[i] = new SumTask(arr, startIndex, endIndex);
            // Обновляем начальный и конечный индексы для следующей части массива
            startIndex = endIndex;
            endIndex += chunkSize;
        }

        // Запускаем все задания и получаем Future-объекты для каждого задания
        int sum = 0;
        for (Future<Integer> future : executor.invokeAll(Arrays.asList(tasks))) {
            // Получаем результат выполнения задания и добавляем его к общей сумме
            sum += future.get();
        }

        // Завершаем работу ExecutorService
        executor.shutdown();
        // Выводим общую сумму элементов массива
        System.out.println("Sum: " + sum);
    }
}

// Callable-объект для суммирования элементов части массива
class SumTask implements Callable<Integer> {
    private final int[] arr;
    private final int startIndex;
    private final int endIndex;

    public SumTask(int[] arr, int startIndex, int endIndex) {
        this.arr = arr;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public Integer call() throws Exception {
        // Суммируем элементы части массива
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += arr[i];
        }
        // Возвращаем сумму
        return sum;
    }
}
