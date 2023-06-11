package leetCode;
//https://leetcode.com/problems/divide-two-integers/description/
public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        double divider = dividend;
        return (int)(divider/divisor);
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        System.out.println(divide(dividend, divisor));
    }
}
