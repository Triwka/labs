package lab7;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter folder path: ");
        String folderPath = scanner.nextLine();

        File folder = new File(folderPath);
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Папка создана: " + folder.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать папку: " + folder.getAbsolutePath());
            }
        }

        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getAbsolutePath());

                System.out.print("Enter data to write: ");
                String data = scanner.nextLine();

                FileWriter writer = new FileWriter(file);
                writer.write(data);
                writer.close();

                System.out.println("Data has been written to the file.");

            } else {
                System.out.println("Не удалось создать файл: " + file.getAbsolutePath());
            }
        } catch (Exception e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }

        if (file.delete()) {
            System.out.println("Файл удалён:" + file.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить файл: " + file.getAbsolutePath());
        }

        if (folder.delete()) {
            System.out.println("Папка удалёна:" + folder.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить папку: " + folder.getAbsolutePath());
        }
    }
}

