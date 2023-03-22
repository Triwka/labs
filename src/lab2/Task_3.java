package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // кодировка мал. ру символов с 1072 - 1103
        System.out.println("Введите текст для шифрования");
        String s = sc.nextLine().toLowerCase();
        System.out.println("Введите ключ");
        int shift = sc.nextInt();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' '){
                continue;
            }
            charArray[i] = (char)((char)('а') + (charArray[i] - (char)('а') + shift) % 32);
        }
        System.out.println("Текст после преобразования: " + new String(charArray) +
                            "\nВыполнить обратное преобразование? (y/n)");
        String answer;
        while (true){
            answer = sc.next();
            if (answer.equals("y")){
                System.out.println(s);
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            }else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}
