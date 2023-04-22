package leetCode;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = Integer.MIN_VALUE;
        int value = 0;

        while (true){
            System.out.println(start + " " + end);
            value = (end - start) * Math.min(height[start],height[end]);
            if (value > max){
                max = value;
            }
            start++;
            if (start == end){
                break;
            }
            System.out.println(start + " " + end);
            value = (end - start) * Math.min(height[start],height[end]);
            if (value > max){
                max = value;
            }
            end--;
            if (start == end){
                break;
            }
        }
        System.out.println();
        start = 0;
        end = height.length - 1;

        while (true){
            System.out.println(start + " " + end);
            value = (end - start) * Math.min(height[start],height[end]);
            if (value > max){
                max = value;
            }
            end--;
            if (start == end){
                break;
            }
            System.out.println(start + " " + end);
            value = (end - start) * Math.min(height[start],height[end]);
            if (value > max){
                max = value;
            }
            start++;
            if (start == end){
                break;
            }
        }

        for (int i = 0; i <height.length ; i++) {
            value = Math.min(height[i],height[height.length - 1]) * (height.length - i - 1);
            if (value > max){
                max = value;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] test = {2,3,4,5,18,17,6};
        System.out.println(ContainerWithMostWater.maxArea(test));
    }
}
