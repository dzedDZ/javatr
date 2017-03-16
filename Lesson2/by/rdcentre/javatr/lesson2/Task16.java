package by.rdcentre.javatr.lesson2;

/**
 * Created by Denis on 19.02.2017.
 */
public class Task16 {
    public static void main(String[] args){
        double r = 3.2;
        double s = 0;
        double l = 0;

        l = r * 2 * Math.PI;
        System.out.format("%17s%10.3f%n", "Длина окружности:",l);
        s = Math.PI * r * r;
        System.out.format("%17s%10.3f%n", "Площадь круга:",s);
    }
}
