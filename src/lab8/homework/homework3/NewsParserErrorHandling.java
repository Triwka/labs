package lab8.homework.homework3;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;

public class NewsParserErrorHandling {
    public static void main(String[] args) {
        while (true) {
            try {
                Connection connection = Jsoup.connect("http://fat.urfu.ru/index.html");
                Document doc = connection.get();
                Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                        "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                        "tr > td:nth-child(1)");

                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        System.out.println("Тема : " +
                                ((Element) nodes.get(i))
                                        .getElementsByClass("blocktitle")
                                        .get(0).childNodes().get(0));
                        System.out.println("Дата : " +
                                ((Element) nodes.get(i))
                                        .getElementsByClass("blockdate")
                                        .get(0).childNodes().get(0) +
                                "\n");
                    }
                }
                break;
            } catch (MalformedURLException e) {
                System.out.println("Неверный протокол: " + e.getMessage());
            } catch (HttpStatusException e) {
                System.out.println("Ошибка HTTP: " + e.getMessage());
            } catch (UnsupportedMimeTypeException e) {
                System.out.println("Ошибка MIME-типа: " + e.getMessage());
            } catch (SocketException e) {
                System.out.println("Ошибка сокета: " + e.getMessage());
            } catch (SocketTimeoutException e) {
                System.out.println("Ошибка тайм-аута сокета: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Ошибка при чтении страницы: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Произошла неизвестная ошибка: " + e.getMessage());
            }
        }
    }
}
