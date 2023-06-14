package lab8.homework.homework2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonParser {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab8\\homework\\homework1\\movies.xml"));
            JSONObject storage = (JSONObject) obj;
            System.out.println("Корневой элемент: " + storage.keySet().iterator().next());
            JSONArray movies = (JSONArray) storage.get("movies");

            int place = 0;
            for (Object o : movies) {
                JSONObject movie = (JSONObject) o;
                System.out.println("\n" + ++place + ". " + movie.get("title"));
                System.out.println("Год производства: "+ movie.get("year"));
                System.out.println("Рейтинг на IMDB: "+ movie.get("rating"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
