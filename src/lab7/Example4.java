package lab7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args) throws IOException {
        String sourceFilePath = "C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab7\\copyfrom.txt";
        String targetFilePath = "C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab7\\copyto.txt";

        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader(sourceFilePath);
            writer = new FileWriter(targetFilePath);

            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }
        } catch (Exception e) {
            System.out.println("Ошибка при копировании: " + e.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }

        System.out.println("Копирование завершено");
    }
}
