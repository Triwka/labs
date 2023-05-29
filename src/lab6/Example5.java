package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        String substring = "er";
        System.out.println(filter(words, substring));
    }
    public static List<String> filter(List<String> words, String substring){
        return words.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
