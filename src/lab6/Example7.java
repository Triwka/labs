package lab6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Example7 {

        public static void main(String[] args) {
            List<String> strings = Arrays.asList("java", "laba", "senior", "300000000dollars", "1312");
            int minLength = 4;

            List<String> longStrings = filterStrings(strings, minLength);
            System.out.println(longStrings);
        }

        public static List<String> filterStrings(List<String> strings, int minLength) {
            List<String> result = new ArrayList<>();
            strings.stream()
                    .filter(s -> s.length() > minLength)
                    .forEach(result::add);
            return result;
        }
}
