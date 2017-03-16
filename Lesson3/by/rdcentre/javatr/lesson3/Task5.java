package by.rdcentre.javatr.lesson3;

/**
 * Created by Denis on 24.02.2017.
 * —формировать квадратную матрицу пор€дка n по заданному образцу (n - четное):
 */
public class Task5 {

    public static void main(String[] args){
        final int n = 20;
        int[][] matrix = new int[n][n];

        for(int j = 0; j < matrix.length; j++){
            for(int i = 0; i < matrix[j].length; i++){
                if (j % 2 == 0){
                    matrix[j][i] = i + 1;
                }
                else {
                    matrix[j][i] = n - i;
                }
            }
        }

        for (int j = 0; j < matrix.length; j++){
            System.out.println();
            for(int i = 0; i < matrix[j].length; i++){
                System.out.print(matrix[j][i]+ "\t");
            }
        }
    }

}
