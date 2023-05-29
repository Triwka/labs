package lab6;

import java.util.*;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(777));
        }

        System.out.println(list);

        System.out.println(power(list));

    }
    public static List<Integer> power(List<Integer> list) {
        return list.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
    }
}
