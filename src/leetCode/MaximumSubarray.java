package leetCode;

import java.util.Arrays;
import java.util.Collections;
//https://leetcode.com/problems/maximum-subarray/submissions/938835807/
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = -Integer.MAX_VALUE;
        for (int num : nums) {
            currSum += num;
            if (maxSum <= currSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
