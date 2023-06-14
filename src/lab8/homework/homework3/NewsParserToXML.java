package lab8.homework.homework3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;

public class NewsParserToXML {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                    "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                    "tr > td:nth-child(1)");

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            org.w3c.dom.Document document = docBuilder.newDocument();
            org.w3c.dom.Element newsElement = document.createElement("news");
            document.appendChild(newsElement);

            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    newsElement.appendChild(createArticle(document,
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0).toString(),
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0).toString()));
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab8\\homework/homework3/news.xml"));
            transformer.transform(source, result);
            System.out.println("Новости записаны в XML-файл.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static org.w3c.dom.Element createArticle(org.w3c.dom.Document doc, String title, String date) {
        org.w3c.dom.Element article = doc.createElement("article");
        article.appendChild(createElementWithText(doc, "title", title));
        article.appendChild(createElementWithText(doc, "date", date));
        return article;
    }
    private static org.w3c.dom.Element createElementWithText(org.w3c.dom.Document doc, String tagName, String textContent) {
        org.w3c.dom.Element element = doc.createElement(tagName);
        element.appendChild(doc.createTextNode(textContent));
        return element;
    }
}
