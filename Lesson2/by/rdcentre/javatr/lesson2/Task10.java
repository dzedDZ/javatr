package by.rdcentre.javatr.lesson2;

import java.util.Scanner;

/**
 * Created by Denis on 19.02.2017.
 */
public class Task10 {
    public static void main(String[] args){
        int n = 0; // double count
        double x; // double variable, entered by user
        int y; // cut double;

        int countEven = 0;

        n = readNFromConsole("n - количество вещественных чисел");

        for(int i = 0; i < n ; i++){

            x = readXFromConsole(Integer.toString(i + 1) + "е число"); //read double
            y = (int) x; // cut entered double
            if (y % 2 == 0 && y > 15){
                countEven = countEven + 1;
            }
         //   System.out.println(y);
        }
        System.out.println("Количество четных и больше 15 = " + countEven);

    }
    public static int readNFromConsole(String VarName){
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
    public static double readXFromConsole(String VarName){
        double x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите " + VarName + ": ");
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.print("Введите " + VarName + ": ");
        }
        x = sc.nextDouble();
        return x;
    }
}
