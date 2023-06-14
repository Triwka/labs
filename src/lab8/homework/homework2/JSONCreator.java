package lab8.homework.homework2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;

public class JSONCreator {
    public static void main(String[] args) {
        JSONObject storage = new JSONObject();
        JSONArray movies = new JSONArray();

        movies.add(createMovieInfo("Побег из Шоушенка", 1994, 9.2));
        movies.add(createMovieInfo("Крестный отец", 1972, 9.2));
        movies.add(createMovieInfo("Тёмный рыцарь", 2008, 9.0));
        movies.add(createMovieInfo("Крёстный отец 2", 1974, 9.0));
        movies.add(createMovieInfo("12 разгневанных мужчин", 1957, 9.0));
        movies.add(createMovieInfo("Список Шиндлера", 1993, 8.9));
        movies.add(createMovieInfo("Властелин колец: Возвращение короля", 2003, 8.9));
        movies.add(createMovieInfo("Криминальное чтиво", 1994, 8.8));
        movies.add(createMovieInfo("Властелин колец: Братство кольца", 2001, 8.8));
        movies.add(createMovieInfo("Хороший, плохой, злой", 1966, 8.8));

        storage.put("movies", movies);
        String fileName = "C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab8\\homework\\homework2\\movies.json";
        try (FileWriter file = new FileWriter(fileName)) {
            file.write(storage.toJSONString());
            System.out.println("Данные о фильмах записаны в JSON-файл: " + fileName);
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
}
