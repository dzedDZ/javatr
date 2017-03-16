package by.rdcentre.javatr.lesson2;

import java.util.Scanner;

/**
 * Created by Denis on 17.02.2017.
 */
public class Task6 {
    public static void main(String[] args){

        double x = 4;
        double a;
        double b;
        double c;

        a = readXFromConsole("a");
        b = readXFromConsole("b");
        c = readXFromConsole("c");

        x = a * a - ((b - c) * (b - c)) + Math.log1p(b*b);
        System.out.println(x);
    }

    public static double readXFromConsole(String VarName){
        double x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("¬ведите " + VarName + ": ");
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.print("¬ведите " + VarName + ": ");
        }
        x = sc.nextDouble();
        return x;
    }

}
