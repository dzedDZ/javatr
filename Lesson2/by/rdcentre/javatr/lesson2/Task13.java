package by.rdcentre.javatr.lesson2;

/**
 * Created by Denis on 19.02.2017.
 */
public class Task13 {
    public static void main(String[] args){
        double a = 2;
        double b = 3;
        double c = 5;
        double d = 7;

        double expression1 = 0;
        double expression2 = 0;

        expression1 = ((b + Math.sqrt(b * b + 4 * a * c))/ (2 * a)) - (Math.pow(a, 3) * c) + b;
        System.out.println(expression1);

        expression2 = ( (a/c) * (b/d) ) - ( (a * b - c) / (c * d) );

        System.out.println(( (a * b - c) / (c * d) ));
        System.out.println(expression2);
    }

}
