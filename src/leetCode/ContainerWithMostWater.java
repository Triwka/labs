package leetCode;

import java.util.ArrayList;
// https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while(start < end){
            int w = end - start;
            int h = Math.min(height[start], height[end]);
            int area = h * w;
            max = Math.max(max, area);
            if(height[start] < height[end]) {
                start++;
            }
            else if(height[start] > height[end]) {
                end--;
            }
            else {
                start++;
                end--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] test = {4,4,2,11,0,11,5,11,13,8};
        System.out.println(ContainerWithMostWater.maxArea(test));
    }
}
