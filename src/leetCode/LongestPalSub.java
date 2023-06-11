package leetCode;
// https://leetcode.com/problems/longest-palindromic-substring/
public class LongestPalSub {
    public static String longestPalindrome(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String palindromeOdd = getLongestPalindrome(s, i, i);
            //System.out.println("palindromeOdd: " + palindromeOdd + " i:" + i);
            String palindromeEven = getLongestPalindrome(s, i, i + 1);
            //System.out.println("palindromeEven: " + palindromeEven);
            longest = longest.length() > palindromeOdd.length() ? longest : palindromeOdd;
            longest = longest.length() > palindromeEven.length() ? longest : palindromeEven;
        }
        return longest;
    }

    public static String getLongestPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            System.out.println("s.charAt(left):" + left + " s.charAt(right):"  + right);
            left--;
            right++;
        }
        System.out.println("Конец итерации, найденная наибольшая подстрока: " + s.substring(left + 1, right));
        return s.substring(left + 1, right);
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
