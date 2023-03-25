package lab3;

import java.util.*;

public class Task_9 {
    public static void main(String[] args) {
        //<10 * 1 000 000 = 10 000 000>
        List<Integer> arrayList = new ArrayList<>();
        long start;
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(hashSet));
        System.out.println("Время выполнения операции добавления linkedList = " + getRunningTime(linkedHashMap));

        start = System.currentTimeMillis();
        arrayList.get(7);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();

        //hashSet[10_000_000];
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        linkedHashMap.get(7);
        System.out.println(System.currentTimeMillis() - start);
    }
    private static long getRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 10_000_000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long getRunningTime(LinkedHashMap<Integer,String>
                                               list){
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 10_000_000; i++) {
            list.put(i,""+i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long getRunningTime(HashSet<Integer>
                                               list){
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 10_000_000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
