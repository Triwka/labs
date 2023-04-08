package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 3;
        int col = 3;
        int [][] grid = new int [row][col];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = (int)(Math.random()*10);
            }
        }

        for (int i = 0; i < col; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }

        System.out.println("Введите, какой столбец хотите вывести:");
        while (true){
            try {
                String input = scanner.next();
                int value = Integer.parseInt(input);

                for(int j = 0; j < grid[value-1].length; j++){
                    System.out.print(grid[j][value-1]+"\n");
                }
                break;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Вы такого столбца не существует, введите номер столбца в пределах массива: 1 - " + row);
            }
            catch (NumberFormatException e){
                System.out.println("Вы ввели строку, введите целое число");
            }
        }
    }
}
