package lab8.example5;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        // Открываем файл Excel для чтения
        String filePath = "C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab8\\example5\\example.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        // Создаем экземпляр книги Excel из файла
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // Получаем лист из книги по его имени
        XSSFSheet sheet = workbook.getSheet("Товары");

        // Перебираем строки и ячейки листа
        for (Row row : sheet) {
            for (Cell cell : row) {
                // Выводим значение ячейки на экран
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }

        // Закрываем файл и освобождаем ресурсы
        workbook.close();
        inputStream.close();
    }
}
