package lab1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNum = scanner.nextInt();
        System.out.println("Сумма введенных вами чисел равна " + (firstNum + secondNum));
    }
}
