package Lesson15.by.rdcentre.javatr;

/**
 * Created by Denis on 25.04.2017.
 */
public class MultiplyArrays extends Thread {
    private int[][] m1, m2;
    private int begin, end;

    public MultiplyArrays(int[][] m1, int[][] m2, int begin, int end) {
        this.m1 = m1;
        this.m2 = m2;
        this.begin = begin;
        this.end = end;
    }

    public void run() {
        for (int i = begin; i < end; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                int sum = 0;
                for (int r = 0; r < m2.length; r++) {
                    sum = sum + m1[i][r] * m2[r][j];
                }
                MainClass.res[i][j] = sum;
            }
        }
    }
}