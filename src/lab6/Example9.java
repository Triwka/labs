package lab6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Example9 {

        public static void main(String[] args) {
            List<String> strings = Arrays.asList("abc123", "def456", "ghijkl", "mno pqr stuv");
            List<String> lettersOnlyStrings = filterLettersOnly(strings);
            System.out.println(lettersOnlyStrings);
        }

        public static List<String> filterLettersOnly(List<String> strings) {
            List<String> result = new ArrayList<>();
            for (String s : strings) {
                if (s.chars().allMatch(Character::isLetter)) {
                    result.add(s);
                }
            }
            return result;

    }
}
