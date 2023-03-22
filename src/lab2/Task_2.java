package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length = id.nextInt();
        System.out.println("Введите ширину массива");
        int width = id.nextInt();
        int[][] arr = new int[length][width];
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++){
                    arr[i][j] = cur;
                    cur++;
                }

            }
            else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    arr[i][j] = cur;
                    cur++;
                }
            }
        }
        for (int[] ars:arr) {
            System.out.println(Arrays.toString(ars));
        }
    }
}
