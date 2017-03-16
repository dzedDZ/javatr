package by.rdcentre.javatr.lesson3;

/**
 * Created by Denis on 24.02.2017.
 * Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли
 она возрастающей.
 */
public class Task3 {
    public static void main(String[] args){
        //int[] arGiven = {1, 0, 3, 4, 5, 0, 4, 5, 0};
        int[] arGiven = {1, 2, 3, 4, 5, 10, 48, 50, 101};

        int prevValue = 0;

        boolean isSequenceAscending = true; //

        for (int i = 0; i < arGiven.length; i++ ){
            if (i == 0){
                prevValue = arGiven[i];
            }
            else {
                if (arGiven[i] <= prevValue) {
                    isSequenceAscending = false;
                }
            }
        }
        if (isSequenceAscending){
                System.out.println("Последовательность возрастающая");
        }
        else {
                System.out.println("Последовательность НЕ возрастающая");
        }

    }
}
