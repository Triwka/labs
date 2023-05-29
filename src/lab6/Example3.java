package lab6;

import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        List<String> list = List.of(new String[]{"Большая", "маленькая","Побольше","поменьше"});

        System.out.println(list);
        System.out.println(filterCapitalizedStrings(list));


    }
    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
