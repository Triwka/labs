package lab8.homework.homework1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeleteFromXML {
    public static void main(String[] args) {
        try {
            File inputFile = new File("C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab8\\homework\\homework1\\movies.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

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

            NodeList nodeList = doc.getElementsByTagName("movie");
            List<Element> movies = IntStream.range(0, nodeList.getLength())
                    .mapToObj(nodeList::item)
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(element -> {
                        String title = element.getElementsByTagName("title").item(0).getTextContent();
                        int year = Integer.parseInt(element.getElementsByTagName("year").item(0).getTextContent());
                        return title.equalsIgnoreCase(titleToFind) && year == yearToFind;
                    })
                    .collect(Collectors.toList());

            for (Element movie : movies) {
                Node parentNode = movie.getParentNode();
                parentNode.removeChild(movie);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(inputFile);
                transformer.transform(source, result);
                System.out.println("Удален фильм " + titleToFind + " (" + yearToFind + ") из XML-файла");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
