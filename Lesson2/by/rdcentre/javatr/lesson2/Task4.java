package by.rdcentre.javatr.lesson2;

/**
 * Created by Denis on 17.02.2017.
 */
public class Task4 {
    public static void main(String[] args){
        double a = 4; // катет 1
        double b = 5; // катет 2

        double s = 0; // площадь
        double h = 0; // гипотенуза

        s = 0.5 * a * b;
        h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("Площадь треугольника: " + s);
        System.out.println("Гипотенуза треугольника:" + h);

    }
}
