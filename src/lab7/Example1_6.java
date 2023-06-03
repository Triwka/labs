package lab7;

import java.io.*;

public class Example1_6 {
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab7\\input.txt";
        String outputFileName = "C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab7\\output.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении или записи файла: " + e.getMessage());
        }
    }
}
