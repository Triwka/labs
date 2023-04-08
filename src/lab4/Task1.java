package lab4;

import java.util.Scanner;

public class Task1 {
    public static boolean noPositives(int[] arr) {
        boolean noPositives = true;

        for (int j : arr) {
            if (j > 0) {
                noPositives = false;
                break;
            }
        }
        return noPositives;
    }
    public static double PosAvgArray(int[] arr){
        double sum = 0;
        int count = 0;
        for (int j : arr) {
            if (j > 0) {
                sum += j;
                count++;
            }
        }
        return  sum / count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Инициализация массива
        int[] array;
        int n;
        System.out.print("Введите размер массива: ");
        n = scanner.nextInt();
        array = new int[n];
        // Заполнение массива
        for (int i = 0; i < n; i++) {
            while (true){
                try {
                    System.out.print("Введите целое число: ");
                    String input = scanner.next();
                    int value = Integer.parseInt(input);
                    array[i] = value;
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Вы ввели строку или нецелое число");
                }
            }
        }
        if (noPositives(array)){ //проверка на то, есть ли хоть одно положительное число в массиве
            throw new RuntimeException("В массиве нет положительных чисел");
        }else {
            System.out.println("Среднее положительных чисел массива:" + PosAvgArray(array));
        }
    }
}