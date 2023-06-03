package lab7;

import java.io.File;
import java.io.IOException;

public class Example1_1 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab7");
        if(!folder.exists()) {
            if (folder.mkdir()){
                System.out.println("Папка создана: " + folder.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать папку: " + folder.getAbsolutePath());
            }
        }
        File file = new File(folder.getAbsoluteFile() + File.separator + "example_file.txt");

        try {
            if (file.createNewFile()){
                System.out.println("Файл создан: " + file.getAbsolutePath());
            }else {
                System.out.println("Не удалось создать файл: " + file.getAbsolutePath());
            }
        }catch (IOException e){
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }

        if (file.delete()){
            System.out.println("файл удалён:" + file.getAbsolutePath());
        }else {
            System.out.println("Не удалось удалить файл: " + file.getAbsolutePath());
        }

        if (folder.delete()){
            System.out.println("папка удалён:" + file.getAbsolutePath());
        }else {
            System.out.println("Не удалось удалить папку: " + file.getAbsolutePath());
        }
    }
}
