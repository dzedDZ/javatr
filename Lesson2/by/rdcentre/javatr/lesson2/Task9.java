package by.rdcentre.javatr.lesson2;

import java.util.Scanner;

/**
 * Created by Denis on 19.02.2017.
 */
public class Task9 {
    public static void main(String[] args){
        int n = 0; // integers count
        int x = 0; // temp Sum

        int countEven = 0;
        int sumDivisible3 = 0;
        int countAbsLess3 = 0;

        n = readXFromConsole("n");

        for(int i = 0; i < n ; i++){
            x = readXFromConsole(i);
            if (x % 3 == 0){
                sumDivisible3 = sumDivisible3 + x;
            }
            if (Math.abs(x) < 3){
                countAbsLess3 = countAbsLess3 + 1;
            }
            if (x % 2 == 0){
                countEven = countEven + 1;
            }
//            System.out.println(i);
        }
        System.out.println("Количество четных = " + countEven);
        System.out.println("Сумма чисел кратных 3 = " + sumDivisible3);
        System.out.println("Количество чисел модуль которых < 3 = " + countAbsLess3);
    }



    public static int readXFromConsole(int VarName){
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите " + (VarName + 1) + " число: ");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.print("Введите " + (VarName + 1) + ": ");
        }
        x = sc.nextInt();
        return x;
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
