package by.rdcentre.javatr.lesson2;

import static by.rdcentre.javatr.lesson2.Task10.readXFromConsole;

/**
 * Created by Denis on 20.02.2017.
 */
public class Task17 {
    public static void main(String[] args){
        double x = 0;
        double y = 0;
        x = readXFromConsole("x");

        if(x <= -3){
            y = 9;
        }
        else {
            y = 1 / (x*x + 1);
        }

        System.out.format("%7s : %10.3f","F(x) = ", y);
    }
}
