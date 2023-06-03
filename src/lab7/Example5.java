package lab7;

import java.io.File;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            long fileSize = file.length();
            System.out.printf("Размер файла %s составляет %d байт\n", fileName, fileSize);
        } else {
            System.out.printf("Файл %s не найден\n", fileName);
        }
    }
}
