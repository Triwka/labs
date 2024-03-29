package leetCode;

import java.util.*;

/*
Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class LongestSubstringWORepeat {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1){
            return 1;
        }
        if (s.length() == 0){
            return 0;
        }
        s = s + "@";
        String str = "";
        List<Integer> lengths = new ArrayList<Integer>(List.of());
        char[] result = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++){
            str = "";
            for (int j = i; j < s.length() - 1; j++) {
                str = str + result[j];
                if (str.contains(String.valueOf(result[j+1])) || j == s.length() - 2){
                    System.out.println(str);
                    lengths.add(str.length());
                    break;
                }

            }
        }
        lengths.sort(Collections.reverseOrder());
        return lengths.get(0);
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("au"));
        System.out.println("".length());

    }


}
