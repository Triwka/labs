package lab3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int decimal = scanner.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println(decimal + " в двоичной системе счисления: " + binary);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) { // базовый случай
            return "0";
        } else if (decimal == 1) { // базовый случай
            return "1";
        } else {
            return decimalToBinary(decimal / 2) + decimal % 2; // рекурсивный случай
        }
    }
}
