package leetCode;

import java.util.Arrays;

public class TrapWater {
    public static void main(String[] args) {
        //0,1,0,2,1,0,1,3,2,1,2,1
        //5,5,6,1,3,9,5,9
        //5,4,1,2
        int[] arr = {5,4,1,2};
        int smallWall;
        int start = 0;
        int sum = 0;
        int end = 1;
        int[] foundedArr;

        while (arr[start] <= arr[end]){
            start++;
            end++;
        }
        //System.out.println("start: " + arr[start] + " end: " + arr[end]);
        while (arr[start] > arr[end]){
            end++;
            if (end == arr.length-1){
                break;
            }
        }
        System.out.println("start element: " + arr[start] + " end element: " + arr[end] + '\n' + "start index: " + start + " end index: " + end);
        foundedArr = Arrays.copyOfRange(arr,start,end + 1);
        System.out.println(Arrays.toString(foundedArr));
        smallWall = Math.min(arr[start], arr[end]);

        for (int i = foundedArr.length - 2; foundedArr[foundedArr.length - 1] > foundedArr[i]; i--) {
            sum = sum + smallWall - foundedArr[i];
        }
        System.out.println("sum: " + sum);
    }
}
