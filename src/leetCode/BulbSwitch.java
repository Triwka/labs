package leetCode;
// https://leetcode.com/problems/bulb-switcher/
import java.util.Arrays;

public class BulbSwitch {
    public int bulbSwitch(int n) {
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        for (int i = 1; i <arr.length ; i++) {
            //System.out.println(Arrays.toString(arr));
            for (int j = i; j < arr.length; j = j + i + 1) {
                switchElOfArr(arr,j);
            }
            //System.out.println();
        }
        //System.out.println(Arrays.toString(arr));
        return Arrays.stream(arr).sum();
    }
    public static void switchElOfArr(int[] arr, int index){
        if (arr[index] == 1){
            arr[index] = 0;
        }else {
            arr[index] = 1;
        }
    }

    public static void main(String[] args) {
        BulbSwitch test = new BulbSwitch();
        for (int i = 0; i < 40; i++) {
            System.out.println("sqrt:" + (int)(Math.sqrt(i)) + " bulbSwitch: " + test.bulbSwitch(i));
        }
//        System.out.println((int)(Math.sqrt(4)));
//        System.out.println(test.bulbSwitch(4));
    }
}
