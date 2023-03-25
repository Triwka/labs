package lab3;

import java.util.HashMap;
import java.util.Map;

public class Task_5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Заполняем HashMap 10 объектами <Integer, String>
        map.put(0, "нулеваяРаз");
        map.put(0, "нулеваяДва");
        map.put(0, "нулеваяТри");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        System.out.println(map.values());
        System.out.println("Строки с ключом больше 5:");
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            if (entry.getKey() > 5){
                System.out.println(entry.getValue());
            }
        }
        int result = 1;

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5){
                System.out.println(entry.getValue());
                result *= entry.getKey();
            }
        }
        System.out.println("Результат перемножения ключей, длина строк которых > 5: " + result);
    }
}
