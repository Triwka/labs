package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Делитель");
        int divider = scanner.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();

        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(dividerFilter(arr, divider)));

    }
    public static int[] dividerFilter(int[] list, int divider){
        return Arrays.stream(list)
                .filter(s -> s % divider == 0)
                .toArray();
    }
}
