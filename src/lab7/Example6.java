package lab7;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь до файла: ");
        String fileName = scanner.nextLine();

        System.out.print("Введите слово для поиска: ");
        String searchTerm = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            try (Scanner fileScanner = new Scanner(new FileReader(file))) {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.contains(searchTerm)) {
                        System.out.println(line);
                    }
                }
            } catch (Exception e) {
                System.out.println("Ошибка при чтении файла: " + e.getMessage());
            }
        } else {
            System.out.printf("Файл %s не найден\n", fileName);
        }
    }
}
