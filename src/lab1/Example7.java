package lab1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        System.out.println("Вы были рождены в " + (java.time.LocalDateTime.now().getYear() - age));
    }
}
