package leetCode;
// https://leetcode.com/problems/length-of-last-word/description/
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        return s.trim().split(" ")[s.trim().split(" ").length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println("   fly me   to   the moon  ".trim().split(" ")["   fly me   to   the moon  ".trim().split(" ").length - 1].length());
    }
}
