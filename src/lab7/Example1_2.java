package lab7;

import java.io.*;

public class Example1_2 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab7\\example_file.txt";
        String data = "Это данные для записи в файл";
        try (FileOutputStream outputStream = new FileOutputStream(fileName)){
            outputStream.write(data.getBytes());
            System.out.println("Данные записаны в файл: " + fileName);
        }catch (IOException e){
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (FileInputStream inputStream = new FileInputStream(fileName)){
            byte[] buffer = new  byte[1024];
            int bytesRead = inputStream.read(buffer);
            String readData = new String(buffer, 0, bytesRead);
            System.out.println("Прочитанные данные: " + readData);
        }catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        if (new File(fileName).delete()){
            System.out.println("Файл удалён: " + fileName);
        }else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }
    }
}
