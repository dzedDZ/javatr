package by.rdcentre.javatr.lesson2;

import java.util.Scanner;

/**
 * Created by Denis on 19.02.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        int sumBandC = 0;

        a = readXFromConsole("a");
        b = readXFromConsole("b");

        if (a > b) {
            c = readXFromConsole("c");
            sumBandC = b + c;
        }
        else if (a == b) {
            System.out.println("Конец");
        }
        else if (a < b) {
            c = readXFromConsole("c");
            sumBandC = a + b + c;
            System.out.println(sumBandC);
            System.out.println("Новый год!");
        }
    }
    public static int readXFromConsole(String VarName){
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите " + VarName + ": ");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.print("Введите " + VarName + ": ");
        }
        x = sc.nextInt();
        return x;
    }
}
