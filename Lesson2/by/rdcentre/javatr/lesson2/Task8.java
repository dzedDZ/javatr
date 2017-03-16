package by.rdcentre.javatr.lesson2;

import java.util.Scanner;

/**
 * Created by Denis on 19.02.2017.
 */
public class Task8 {
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        int c = 0;

        a = readXFromConsole("a");
        b = readXFromConsole("b");

        if(a == b){
            System.out.println("скоро Новый Год!");
        }
        else {
            c = readXFromConsole("c");
            System.out.println(a + b + c);
            System.out.println(a * a + b * b);
            System.out.println("Динамо");
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
