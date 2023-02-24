package lab1;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца и количество дней в этом месяце");
        String[] date = scanner.nextLine().split(" ");
        System.out.println("В месяце " + date[0] + " " + date[1] + " дней");
    }
}
