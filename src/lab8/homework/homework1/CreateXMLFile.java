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

public class CreateXMLFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element storage = doc.createElement("storage");
            doc.appendChild(storage);
            storage.appendChild(createMovieInfo(doc, "Побег из Шоушенка", 1994, 9.2));
            storage.appendChild(createMovieInfo(doc, "Крестный отец", 1972, 9.2));
            storage.appendChild(createMovieInfo(doc, "Тёмный рыцарь", 2008, 9.0));
            storage.appendChild(createMovieInfo(doc, "Крёстный отец 2", 1974, 9.0));
            storage.appendChild(createMovieInfo(doc, "12 разгневанных мужчин", 1957, 9.0));
            storage.appendChild(createMovieInfo(doc, "Список Шиндлера", 1993, 8.9));
            storage.appendChild(createMovieInfo(doc, "Властелин колец: Возвращение короля", 2003, 8.9));
            storage.appendChild(createMovieInfo(doc, "Криминальное чтиво", 1994, 8.8));
            storage.appendChild(createMovieInfo(doc, "Властелин колец: Братство кольца", 2001, 8.8));
            storage.appendChild(createMovieInfo(doc, "Хороший, плохой, злой", 1966, 8.8));
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            String fileName = "homework/homework1/movies.xml";
            StreamResult result = new StreamResult(new File(fileName));
            transformer.transform(source, result);

            System.out.println("Данные о фильмах записаны в XML-файл: " + fileName);
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
}
