package lab1;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш год рождения");
        int yearOfBirth = java.time.LocalDateTime.now().getYear() - scanner.nextInt();
        System.out.println("Вам " + yearOfBirth + " лет");
    }
}
