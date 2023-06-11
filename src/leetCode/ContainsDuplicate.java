package leetCode;
// https://leetcode.com/problems/contains-duplicate/
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]){
                return true;
            }
        }
        System.out.println(Arrays.toString(nums));
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,1};
        System.out.println(containsDuplicate(numbers));
    }
}
