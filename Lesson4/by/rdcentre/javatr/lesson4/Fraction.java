package by.rdcentre.javatr.lesson4;

/**
 * Created by Denis on 27.02.2017.
 */
public class Fraction {

    private int numerator; // числитель
    private int denominator; // знаменатель

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction() {
        numerator = denominator = 1;
        }

    public Fraction(int num, int den) {
        setNumerator(num);
        setDenominator(den);
    }

    public void showFraction(){
        System.out.println("Дробь:" + getNumerator() + "/" + getDenominator());
    }

}
