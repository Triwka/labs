package lab7;

import lab2.Task_4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example1_7 {
    public static void main(String[] args) {
        Task_4.Person person = new Task_4.Person("Ivan Ivanov", 30, "male");

        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\user\\Desktop\\study\\java\\labs\\src\\lab7\\person.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Person serialized");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
