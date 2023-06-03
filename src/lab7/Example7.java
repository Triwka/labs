package lab7;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();

        System.out.print("Введите текст для записи в файл: ");
        String text = scanner.nextLine();

        try {
            File file = new File(System.getProperty("user.dir") + File.separator + fileName);
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } else {
                System.out.println("Файл уже существует: " + file.getAbsolutePath());
            }

            try (PrintWriter printWriter = new PrintWriter(new FileWriter(file))) {
                printWriter.println(text);
            }

            System.out.printf("Записано символов: %d", text.length());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
