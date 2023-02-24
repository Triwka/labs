package lab1;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше Имя");
        String name = scanner.nextLine() + " ";
        System.out.println("Введите ваше возраст");
        String age = " " + scanner.nextLine();
        System.out.println("Ваше имя " + name + ", а ваш возраст" + age);
    }
}