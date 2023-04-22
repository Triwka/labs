package leetCode;
//https://leetcode.com/problems/zigzag-conversion/
public class ZigzagConversion {
    public String convert(String s, int numRows) {
        boolean flag = true;
        int id = 0;
        int idfin = 0;
        StringBuilder finStr = new StringBuilder();
        char[] string = s.toCharArray();
        StringBuilder[] stringBuilders = new StringBuilder[numRows];

        if (numRows == 1) {
            return s;
        }

        for (int i = 0; i < numRows; i++) {
            stringBuilders[i] = new StringBuilder("");
        }

        for (char ch : s.toCharArray()) {
            stringBuilders[id].append(ch);
            if (id == 2) {
                flag = false;
            } else if (id == 0) {
                flag = true;
            }
            if (flag) {
                id++;
            } else {
                id--;
            }
        }

        for (StringBuilder st : stringBuilders) {
            for (int i = 0; i < st.length(); i++) {
                finStr.append(st.charAt(i));
            }
        }

        return finStr.toString();
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
