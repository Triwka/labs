package lab8.homework.homework2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class FilterInJSON {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab8\\homework\\homework2\\movies.json"));
            JSONObject storage = (JSONObject) obj;
            JSONArray movies = (JSONArray) storage.get("movies");
            List<Object> moviesList = (List<Object>) movies;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название фильма (значение может быть пустым): ");
            String titleToFind = scanner.nextLine().strip();
            System.out.println("Введите год производства фильма (значение может быть пустым): ");
            String strYearToFind = scanner.nextLine().strip();
            int yearToFind;
            if (!strYearToFind.equals("")) {
                yearToFind = Integer.parseInt(strYearToFind);
            } else {
                yearToFind = Integer.MIN_VALUE;
            }
            System.out.println("Введите рейтинг фильма на IMDB (значение может быть пустым): ");
            String strRatingToFind = scanner.nextLine();
            double ratingToFind;
            if (!strRatingToFind.equals("")) {
                ratingToFind = Long.parseLong(strRatingToFind.replace(",","."));
            } else {
                ratingToFind = Double.MIN_VALUE;
            }
            moviesList.stream()
                    .filter(JSONObject.class::isInstance)
                    .map(JSONObject.class::cast)
                    .filter(book -> {
                        String title = (String) book.get("title");
                        double rating = (double) book.get("rating");
                        long year = (long) book.get("year");
                        return title.equalsIgnoreCase(titleToFind)
                                || rating == ratingToFind
                                || year == yearToFind;
                    })
                    .forEach(movie -> {
                        System.out.println("\nНазвание фильма: " + movie.get("title"));
                        System.out.println("Год производства: " + movie.get("year"));
                        System.out.println("Рейтинг на IMDB: " + movie.get("rating"));
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
