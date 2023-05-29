package lab6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Example8 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 5, 7, 10, 15, 20);
            int minValue = 10;

            List<Integer> bigNumbers = filterIntegers(numbers, minValue);
            System.out.println(bigNumbers);
        }

        public static List<Integer> filterIntegers(List<Integer> numbers, int minValue) {
            List<Integer> result = new ArrayList<>();
            numbers.stream()
                    .filter(n -> n > minValue)
                    .forEach(result::add);
            return result;
        }
}
