package lab1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int number = scanner.nextInt();
        System.out.println((number - 1) + "\n" + number + "\n" + (number + 1) + "\n" + (((number - 1) + number + (number + 1)) * ((number - 1) + number + (number + 1))));
    }
}
