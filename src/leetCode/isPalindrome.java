package leetCode;
// https://leetcode.com/problems/palindrome-number/
public class isPalindrome {
    public static boolean isPalindrome(String text) {
        String s1 = text;
        StringBuilder s2 = new StringBuilder(s1);
        return s1.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase()
                .equalsIgnoreCase(s2.reverse()
                        .toString()
                        .toLowerCase()
                        .replaceAll("[^a-zA-Z0-9]", "")) ; // your implementation here
    }

    public static void main(String[] args) {
        String str = "Madam, I'm Adam!";
        System.out.println(isPalindrome(str));
    }
}
