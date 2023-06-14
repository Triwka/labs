package lab8.homework.homework4;

import org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadExcelFileWithErrors {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите путь к файлу в формате xls или xlsx: ");
            String fileName = scanner.nextLine();
            System.out.println();
            try (FileInputStream inputStream = new FileInputStream(fileName);
                 XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                    System.out.println("Лист \"" + workbook.getSheetName(i) + "\"");
                    for (Row row : workbook.getSheet(workbook.getSheetName(i))) {
                        for (Cell cell : row) {
                            System.out.print(cell.toString());
                            if (cell.getColumnIndex() != row.getLastCellNum() - 1) {
                                System.out.print("\t|\t");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("____\n");
                }
                break;
            } catch (IOException e) {
                System.out.println("Ошибка чтения файла: " + e.getMessage());
            } catch (NotOfficeXmlFileException e) {
                System.out.println("Неверный формат файла.");
            } catch (Exception e) {
                System.out.println("Произошла неизвестная ошибка: " + e.getMessage());
            }
        }
    }
}
