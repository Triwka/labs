package leetCode;

import java.util.Arrays;
import java.util.Collections;
/*
Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int currSum = 0;
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (maxSum <= currSum){
                maxSum = currSum;
            }
            if (currSum < 0){
                currSum = 0;
            }
        }
        System.out.println(Integer.MIN_VALUE);
    }
}
