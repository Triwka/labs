package leetCode;

import java.util.Arrays;
//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == i){
                    continue;
                }
                if (nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}


