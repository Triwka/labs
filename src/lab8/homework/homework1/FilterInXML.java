package lab8.homework.homework1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterInXML {
    public static void main(String[] args) {
        try {
            File inputFile = new File("C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab8\\homework\\homework1\\movies.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

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

            NodeList nodeList = doc.getElementsByTagName("movie");
            List<Element> movies = IntStream.range(0, nodeList.getLength())
                    .mapToObj(nodeList::item)
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(element -> {
                        String title = element.getElementsByTagName("title").item(0).getTextContent();
                        int year = Integer.parseInt(element.getElementsByTagName("year").item(0).getTextContent());
                        double rating = Double.parseDouble(element.getElementsByTagName("rating").item(0).getTextContent());
                        return title.equalsIgnoreCase(titleToFind) && year == yearToFind && rating == ratingToFind;
                    })
                    .collect(Collectors.toList());
            for (Element movie : movies) {
                System.out.println("\nНазвание фильма: "
                        + movie.getElementsByTagName("title").item(0)
                        .getTextContent());
                System.out.println("Год производства: "
                        + movie.getElementsByTagName("year").item(0)
                        .getTextContent());
                System.out.println("Рейтинг фильма на IMDB: "
                        + movie.getElementsByTagName("rating").item(0)
                        .getTextContent());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
