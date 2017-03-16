package by.rdcentre.javatr.lesson2;

import static by.rdcentre.javatr.lesson2.Task10.readXFromConsole;

/**
 * Created by Denis on 19.02.2017.
 */

public class Task15 {
    public static void main(String[] args){
    double a = 0;
    double b = 0;
    double h = 0;

    double x = 0;
    double y = 0;

    a = readXFromConsole("¬ведите a");
    b = readXFromConsole("¬ведите b");
    h = readXFromConsole("¬ведите шаг h");

    x = a;
        System.out.format("|" + "%10.3s" + "|" + "%10.3s" + "|%n", "x", "y");
    do {
        y = (2 * Math.tan(x/2)) + 1;
        System.out.format("|" + "%10.3f" + "|" + "%10.3f" + "|%n", x, y);
        x = x + h;
        if (Math.abs(x) > Math.abs(b)){
            x = b;
            y = (2 * Math.tan(x/2)) + 1;
            System.out.format("|" + "%10.3f" + "|" + "%10.3f" + "|%n", x, y);
            //System.out.println("__");
            break;
        }
    }
    while (x < b);

    }
}
