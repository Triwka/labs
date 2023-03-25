package lab3;

import java.util.Scanner;

public class Task_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = readArray();
        System.out.print("Массив: ");
        printArray(array);
    }

    private static int[] readArray() {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        readArray(array, 0);
        return array;
    }

    private static void readArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print("Введите элемент под номером " + index + ": ");
            array[index] = scanner.nextInt();
            readArray(array, index + 1);
        }
    }

    private static void printArray(int[] array) {
        printArray(array, 0);
        System.out.println();
    }

    private static void printArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            printArray(array, index + 1);
        }
    }
}
