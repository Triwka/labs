package leetCode;

import java.util.function.DoubleUnaryOperator;

public class stepic_4 {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0 ,10));
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double epsilon=1e-7;
        double sum = 0;
        for (double i = a; i < b; i = i + epsilon){
            sum = sum + f.applyAsDouble(i);
        }
        return sum * epsilon;
    }
}
