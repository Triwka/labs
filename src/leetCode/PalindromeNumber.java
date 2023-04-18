package leetCode;
// https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    static class Solution {
        public boolean isPalindrome(int x) {
            char[] ch = Integer.toString(x).toCharArray();
            int stop = ch.length / 2;
            int start = 0;
            int end = ch.length - 1;
            while(start != stop) {
                if(ch[start] != ch[end]){
                    return(false);
                }
                start++;
                end--;
            }
            return(true);
        }
    }
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.isPalindrome(1211));
    }
}


