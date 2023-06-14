package lab8.homework.homework2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class DeleteFromJson {
    public static void main(String[] args) {
        try {
            String fileName = "C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab8\\homework\\homework2\\movies.json";
            FileReader reader = new FileReader(fileName);
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(reader);
            JSONObject storage = (JSONObject) obj;
            JSONArray movies = (JSONArray) storage.get("movies");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название фильма (значение НЕ может быть пустым): ");
            String titleToFind = scanner.nextLine().strip();
            System.out.println("Введите год производства фильма (значение НЕ может быть пустым): ");
            String strYearToFind = scanner.nextLine().strip();
            int yearToFind;
            if (!strYearToFind.equals("")) {
                yearToFind = Integer.parseInt(strYearToFind);
            } else {
                yearToFind = Integer.MIN_VALUE;
            }

            for (int i = 0; i < movies.size(); i++) {
                JSONObject movie = (JSONObject) movies.get(i);
                if (titleToFind.equalsIgnoreCase((String) movie.get("title"))
                        && yearToFind == ((long) movie.get("year"))) {
                    movies.remove(i);
                    break;
                }
            }

            storage.put("movies", movies);
            FileWriter file = new FileWriter(fileName);
            file.write(storage.toJSONString());
            System.out.println("Удален фильм " + titleToFind + " (" + yearToFind + ") из JSON-файла");
            reader.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
