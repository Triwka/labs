package lab6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Example10 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 5, 7, 10, 15, 20, 22, 25, 30);
            List<Integer> filteredNumbers = filterNumbersLessThan(numbers, 20);
            System.out.println(filteredNumbers);
        }

        public static List<Integer> filterNumbersLessThan(List<Integer> numbers, int max) {
            List<Integer> result = new ArrayList<>();
            for (Integer number : numbers) {
                if (number < max) {
                    result.add(number);
                }
            }
            return result;

    }
}
