package lab6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();


        int[] arrOne = new int[size];
        int[] arrTwo = new int[size];
        Random random = new Random();

        
        for (int i = 0; i < size; i++) {
            arrOne[i] = random.nextInt(100);
            arrTwo[i] = random.nextInt(100);
        }

        System.out.println("Первый массив: ");
        System.out.println(Arrays.toString(arrOne));
        System.out.println("Второй массив: ");
        System.out.println(Arrays.toString(arrTwo));

        int[] arrResult = findCommonElements(arrOne, arrTwo);

        System.out.println("Массив arrResult :");
        System.out.println(Arrays.toString(arrResult));


    }

    public static int[] findCommonElements(int[] arrOne, int[] arrTwo){
        return Arrays.stream(arrOne)
                .filter(x -> Arrays.stream(arrTwo)
                        .anyMatch(y -> y == x))
                .toArray();

    }
}
