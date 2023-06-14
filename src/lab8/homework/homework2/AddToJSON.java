package lab8.homework.homework2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class AddToJSON {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab8\\homework\\homework2\\movies.json");
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(reader);
            JSONObject storage = (JSONObject) obj;
            JSONArray movies = (JSONArray) storage.get("movies");

            String title = getInput("название").strip();
            int year = Integer.parseInt(getInput("год производства"));
            double rating = Double.parseDouble(getInput("рейтинг на IMDB").replace(",","."));

            movies.add(createMovieInfo(title, year, rating));
            storage.put("movies", movies);
            FileWriter file = new FileWriter("C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab8\\homework\\homework2\\movies.json");
            file.write(storage.toJSONString());
            System.out.println("В JSON-файл добавлен фильм: " + title + " (" + year + ") ★ " + rating);
            reader.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static JSONObject createMovieInfo(String title, int year, double rating) {
        JSONObject movieInfo = new JSONObject();
        movieInfo.put("title", title);
        movieInfo.put("year", year);
        movieInfo.put("rating", rating);
        return movieInfo;
    }
    private static String getInput(String toInput) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите " + toInput + " фильма: ");
        return scanner.nextLine();
    }
}
