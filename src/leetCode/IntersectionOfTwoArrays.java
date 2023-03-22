package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> answer = new ArrayList<>();
        if (nums1.length > nums2.length){
            for (int num: nums2) {
                for (int num2:nums1) {
                    if (num == num2){
                        answer.add(num);
                        break;
                    }
                }
            }
        }
        else {
            for (int num: nums1) {
                for (int num2:nums2) {
                    if (num == num2){
                        answer.add(num);
                        break;
                    }
                }
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
