package leetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);

    }
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3,0,0,0};
        int m = 3;
        int[] numbers2 = {2,5,6};
        int n = 3;
        merge(numbers1,m,numbers2,n);
        System.out.println(Arrays.toString(numbers1));
    }
}
