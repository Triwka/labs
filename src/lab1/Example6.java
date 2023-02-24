package lab1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя и год рождения");
        String s = scanner.nextLine();
        System.out.println("Ваc зовут " + s.split(" ")[0] + " и вам " + (java.time.LocalDateTime.now().getYear() - Integer.parseInt(s.split(" ")[1])) + " лет");
    }
}
