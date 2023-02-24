package lab1;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу Фамилию");
        String surname = scanner.nextLine() + " ";
        System.out.println("Введите ваше Имя");
        String name = scanner.nextLine() + " ";
        System.out.println("Введите ваше Отчество");
        String patronymic = scanner.nextLine();
        System.out.println("Hello " + surname + name + patronymic);
    }
}
