package lab4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        System.out.print("Введите размер массива: ");
        while (true){
            try {
                String input = scanner.next();
                int n = Integer.parseInt(input);
                byte[] arr = new byte[n];
                for (int i = 0; i < arr.length; i++) {
                    try {
                        System.out.print("Введите элемент массива c индексом " + i + ":");
                        arr[i] = scanner.nextByte();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Введено слишком большое или слишком маленькое для byte число. Либо введено не число.");
                        i--;
                        scanner.next(); // очистка сканнера
                    }
                }
                System.out.println("Получившийся массив : " + Arrays.toString(arr));
                break;
            } catch (NegativeArraySizeException e){
                System.out.println("Размер массива не может быть отрицательным числом, введите целое положительное число:");
            }catch (java.lang.NumberFormatException e){
                System.out.println("Размер массива не может быть строкой или нецелым числом, введите целое положительное число:");
            }
        }


    }
}
