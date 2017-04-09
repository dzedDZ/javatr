package Lesson13.by.rdcentre.javatr.lesson13;

import Lesson11.by.rdcentre.javatr.lesson11.Good;

import java.io.*;

/**
 * Created by Denis on 09.04.2017.
 */
public class SerializationExample {
    public static void main(String[] args){

        Good g1 = new Good("товар1", 1997, 11,01, "RTY", "категория1", "ноут1");
        Good g2 = new Good("товар2", 1979, 6,13, "TYR", "категория2", "ноут2");

        System.out.println("Good1 = " + g1);
        System.out.println("Good2 = " + g2);

        String fileName = "d:\\file";

        try {
            FileOutputStream os = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(g1);
            oos.writeObject(g2);

            oos.close();
            os.close();

            System.out.println("Read objects: ");
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() > 0){
                Good g = (Good) ois.readObject();
                System.out.println(g.toString());
            }

        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
