package leetCode;
// https://leetcode.com/problems/powx-n/
public class MyPow {
    public double myPow(double x, int n) {

        if(n == 0) {
            return 1; // x в любой степени кроме 0 будет равен 1
        }

        double result = myPow(x, n/2); // Рекурсивный вызов метода с новым параметром степени
        if(n % 2 == 0) {
            return result * result; // Если степень четная, то возводим в квадрат результат предыдущего вызова
        } else if(n > 0) {
            return result * result * x; // Если степень нечетная и положительная, то домножаем результат на x
        } else {
            return result * result / x; // Если степень нечетная и отрицательная, то делим на x
        }
    }
}
