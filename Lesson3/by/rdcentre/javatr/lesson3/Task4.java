package by.rdcentre.javatr.lesson3;

/**
 * Created by Denis on 24.02.2017.
 * ���� ������������������ ����������� ����� �1 , �2 ,..., ��. ������� ������ ��
 ������ ����� ���� ������������������. ���� ����� ����� ���, �� �������
 ��������� �� ���� �����.
 */
public class Task4 {
    public static void main(String[] args){
        int[] arrGiven = {10, 250, 30, 410, 50, 1010, 4810, 5010, 1010};
        int countOfEvens = 0;
        int y = 0;
        for(int i = 0; i < arrGiven.length; i++){
            if (arrGiven[i] % 2 == 0) {
                countOfEvens = countOfEvens + 1;
            }
        }
        int[] arrResult = new int[countOfEvens];
        for(int i = 0; i < arrGiven.length; i++){
            if (arrGiven[i] % 2 == 0) {
                arrResult[y] = arrGiven[i];
                y = y + 1;
            }
        }

        if (countOfEvens == 0) {System.out.println("׸���� ����� � ������������������ ���.");}
       /*
        else {
            for (int i = 0; i < arrResult.length; i++){
                System.out.println(arrResult[i]);
            }
        }*/

    }
}
