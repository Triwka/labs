package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Example5 {
    public static int findMax(int[] arr) {
        // Определяем количество ядер процессора
        int numProcessors = Runtime.getRuntime().availableProcessors();

        // Создаем ExecutorService с количеством потоков, равным количеству ядер процессора
        ExecutorService executor = Executors.newFixedThreadPool(numProcessors);

        // Разбиваем массив на части и создаем Callable для каждой части
        List<Callable<Integer>> tasks = new ArrayList<>();
        int chunkSize = arr.length / numProcessors;

        for (int i = 0; i < numProcessors; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == numProcessors - 1) ? arr.length : (i + 1) * chunkSize;
            int[] chunk = new int[endIndex - startIndex];
            System.arraycopy(arr, startIndex, chunk, 0, endIndex - startIndex);
            tasks.add(() -> {
                int max = Integer.MIN_VALUE;
                for (int value : chunk) {
                    if (value > max) {
                        max = value;
                    }
                }
                return max;
            });
        }

        // Выполняем все задачи и получаем результаты
        int max = Integer.MIN_VALUE;
        try {
            List<Future<Integer>> results = executor.invokeAll(tasks);
            for (Future<Integer> result : results) {
                int value = result.get();
                if (value > max) {
                    max = value;
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Освобождаем ресурсы ExecutorService
        executor.shutdown();

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {68, 29, 85, 15, 58, 73, 43, 99, 24, 47, 11, 97};
        System.out.println(findMax(arr));
    }
}

