package leetCode;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test_del {
    public static boolean isPalindromeReverseTheString(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }

    public static String longestPalindromeStart(String s) {
        int start = 0;
        int end = s.length()-1;
        while (true){
            if (s.charAt(start) == s.charAt(end)){
                if (isPalindromeReverseTheString(s.substring(start,end+1))){
                    return s.substring(start,end+1);
                }
            }
            start++;
            if (s.charAt(start) == s.charAt(end)){
                if (isPalindromeReverseTheString(s.substring(start,end+1))){
                    return s.substring(start,end+1);
                }
            }
            end--;
        }
    }
    public static String fromStartToEnd(String s){
        int start = 0;
        while (true){
            if (s.charAt(start) == s.charAt(s.length()-1)){
                if (isPalindromeReverseTheString(s.substring(start))){
                    return s.substring(start);
                }
            }
            start ++;
        }
    }


    public static void main(String[] args) {
        String s = "jcwwnkwiajicysmdueefqjnrokunucidhgkswbgjkkrujkxkxeanrpjvpliomxztalhmvcldnqmkslkprhgtwlnsnygbzdvtdbsdzsdjggzgmhogknpfhtgjmclrkgfqdbiagwrqqcnagosnqrnpapxfrtrhzlyhszdtgkqggmewqmwugrbufiwfvtjhczqgcwpcyjioeacggiwyinpkyxrpxhglrtojgjmmswxnvirfsrbhmpqgjyyagjqfwkqkjkumywvgfutmiwihwnnhbfxcijaoiyxbdnrckexqfhsmmxflaneccyaoqoxfbaylcvvpfafsikebzcdufvhluldguwsmrtjaljpcjestranfrvgvytozxpcvnwquhnsxlmzkehwopgxvifajmrlwqiqylgxibnypxwpkggxevyfoxywfsfpjbzfxxysgxgwxrzkwdqlkrpajlltzqfqshdokibakkhydizsgwbygqulljqmtxkwepitsukwjlrrmsjptwabtlqytprkkuxtqdmptctkfabxsohrfrqvrbjfbppfkpthosveoppiywkkuoasefviegormlqkqlbhnhblkmglxcbszblfipsyumcrjrkrnzplkveznbtdbtlcptgswhiqsjugqrvujkzuwvoxbjremyxqqzxkgerhgtidsefyemtmstsznvgohexdgetqbhrxaomzsamapxhjibfvtbquhowyrwyxthpwvmfyyqsyibemnfbwkddtyoijzwfxhossylygxmnznpegtgvlrsreepkrcdgbujkghrgtsxwlvxrgrqxnvgqkppbkrxjupjfjcsfzepdemaulfetn";
        int start = 0;
        int end = s.length();
        int maxLen = 0;
        String answer = "";
        do {
            end = s.length();
            //System.out.println("start is " + start + " end is " + end);
            while (end != start){
                if (s.charAt(start) == s.charAt(end-1)){
                    if (isPalindromeReverseTheString(s.substring(start, end)) && s.substring(start, end).length() >= maxLen) {
                        answer = s.substring(start, end);
                        maxLen = answer.length();
                        System.out.println("Check");
                        if (maxLen >= s.length()-2) break;
                    }
                }
                end--;
            }
            start++;
        }while (start != s.length() + 1);
        System.out.println(answer);
    }
}


// [[C@48140564]