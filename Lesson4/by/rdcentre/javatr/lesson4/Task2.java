package by.rdcentre.javatr.lesson4;

import java.util.Scanner;

/**
 * Created by Denis on 27.02.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int k = readNFromConsole("k");
        Fraction[] fraction = new Fraction[k];
        for (int i=0; i<k; i++) {
            fraction[i] = new Fraction(readNFromConsole("m"), readNFromConsole("n"));
        }

        for(int i=0; i<k; i++){
            fraction[i].showFraction();
        }



}
    public static int readNFromConsole(String VarName) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("¬ведите " + VarName + ": ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("¬ведите " + VarName + ": ");
        }
        x = sc.nextInt();
        return x;
    }
}
