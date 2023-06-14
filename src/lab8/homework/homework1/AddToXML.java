package lab8.homework.homework1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class AddToXML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            String fileName = "C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab8\\homework\\homework1\\movies.xml";
            Document doc = docBuilder.parse(new File(fileName));
            Element storage = doc.getDocumentElement();

            String title = getInput("название");
            int year = Integer.parseInt(getInput("год производства"));
            double rating = Double.parseDouble(getInput("рейтинг на IMDB").replace(",","."));

            storage.appendChild(createMovieInfo(doc, title, year, rating));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(fileName));
            transformer.transform(source, result);

            System.out.println("В XML-файл добавлен фильм: " + title + " (" + year + ") ★" + rating);
        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }

    private static Element createMovieInfo(Document doc, String title, int year, double rating) {
        Element movie = doc.createElement("movie");
        movie.appendChild(createAttribute(doc, "title", title));
        movie.appendChild(createAttribute(doc, "year", String.valueOf(year)));
        movie.appendChild(createAttribute(doc, "rating", String.valueOf(rating)));
        return movie;
    }

    private static Element createAttribute(Document doc, String tagName, String textContent) {
        Element element = doc.createElement(tagName);
        element.appendChild(doc.createTextNode(textContent));
        return element;
    }

    private static String getInput(String toInput) {
        System.out.println("Введите " + toInput + " фильма: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
