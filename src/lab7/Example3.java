package lab7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example3 {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab7\\input.txt";

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            int numLines = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.trim().equals("")) { // убираем пробелы и проверяем, что строка не пустая
                    numLines++;
                }
            }

            System.out.println("Количество строк в файле " + filePath + ": " + numLines);

            reader.close();
            bufferedReader.close();

        } catch (Exception e) {
            System.out.println("Ошибка при чтении файла " + filePath + ": " + e.getMessage());
        }
    }

}
