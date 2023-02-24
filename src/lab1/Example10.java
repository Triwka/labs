package lab1;

import java.util.Scanner;

class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNum = scanner.nextInt();
        System.out.println("Сумма введеных чисел равна " + (firstNum + secondNum) + "\n" + "Разность введенных чисел равна " + (firstNum - secondNum));
    }


}
