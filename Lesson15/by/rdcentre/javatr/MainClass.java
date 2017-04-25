package Lesson15.by.rdcentre.javatr;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by R80 Home on 25.04.2017.
 */
public class MainClass {
    public static int[][] res;
    public static void main(String[] args) throws InterruptedException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\out_matrix.txt");
        System.setOut(new PrintStream(fileOutputStream));

        int threadCount = 300; //Runtime.getRuntime().availableProcessors();
        int n ;
        n = 300;

        int[][] m1 = new int[n][n];
        int[][] m2 = new int[n][n];
        res = new int[n][n];

        // fill in matrix #1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = i ;
            }
        }

        // fill in matrix #2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m2[i][j] = j;
            }
        }

        printMatrix(m1);
        printMatrix(m2);


            int area = m1.length / threadCount;

            res = new int[n][n];

            MultiplyArrays[] multiplyArrayses = new MultiplyArrays[threadCount];
            for (int i = 0; i < threadCount; i++) {
                multiplyArrayses[i] = new MultiplyArrays(m1, m2, i * area, (i + 1) * area);
                multiplyArrayses[i].start();
                System.out.println(i);
            }

            for (MultiplyArrays multiplyArrays : multiplyArrayses) {
                multiplyArrays.join();
                System.out.println("!");
            }

//        printMatrix(res);
        fileOutputStream.close();

        }



    public static void printMatrix(int[][] matrix) throws IOException {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
