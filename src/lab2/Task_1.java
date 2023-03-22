package lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int size = id.nextInt();
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(137);
        }
        System.out.println(Arrays.toString(nums));
        int[] numsSorted = nums.clone();
        Arrays.sort(nums);
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(numsSorted[i] == min){
                System.out.println("Минимальное число - " + numsSorted[i] + " его индекс - " + i);
            }
        }
    }
}
