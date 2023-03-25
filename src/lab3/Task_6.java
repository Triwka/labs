package lab3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_6 {
    public static void main(String[] args) {
        int n = 1337; // число людей в кругу
        // ArrayList
        double start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size(); // определяем индекс для удаления
            list.remove(index);
        }
        System.out.println("Оставшийся человек (ArrayList): " + list.get(0));
        System.out.println("Время работы (ArrayList):" + (System.currentTimeMillis() - start));

        // LinkedList
        start = System.currentTimeMillis();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            linkedList.add(i);
        }
        index = 0;
        while (linkedList.size() > 1) {
            index = (index + 1) % linkedList.size(); // определяем индекс для удаления
            linkedList.remove(index);
        }
        System.out.println("Оставшийся человек (LinkedList): " + linkedList.get(0));
        System.out.println("Время работы (LinkedList):" + (System.currentTimeMillis() - start));
    }
}
