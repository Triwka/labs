package lab1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Example3 {
    public static boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день недели");
        String day = scanner.nextLine();
        System.out.println("Введите номер месяца");
        String month = scanner.nextLine();
        String date = day + "-" + month;

        if (isDateValid(date)){
            System.out.println("Сегодня" + " " +  (date.split("-")[0]) + " "
                    +  "день недели и " + date.split("-")[1]
                    + " " + "месяц");
        }
        else System.out.println("Такой даты быть не может");
    }
    final static String DATE_FORMAT = "dd-MM";
}


