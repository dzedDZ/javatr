package by.rdcentre.javatr.lesson2;

import java.util.Scanner;

import static by.rdcentre.javatr.lesson2.Task10.readNFromConsole;

/**
 * Created by Denis on 19.02.2017.
 */
public class Task11 {
    public static void main(String[] args) {
        int n = 0; // integers count
        int x = 0; // temp Sum of dgigits which % 5 == 4
        int sumMod5_4 = 0;
        int countMoreThan15LessThan3 = 0;

        n = readNFromConsole(" ���������� ����� �����");

        for (int i = 0; i < n; i++) {
            x = readNFromConsole(Integer.toString(i + 1)+" �����");
            if (x > 15 || x < 2) {
                countMoreThan15LessThan3 = countMoreThan15LessThan3 + 1;
            }
            if (x % 5 == 4) {
                sumMod5_4 = sumMod5_4 + x;
            }

            System.out.println(i);
        }
        System.out.println("���������� ����� > 15 ��� < 2 = " + countMoreThan15LessThan3);
        System.out.println("����� �����, ������� ������� �� 5 � �������� 4 = " + sumMod5_4);
    }
}
