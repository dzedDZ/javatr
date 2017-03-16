package by.rdcentre.javatr.lesson3;

/**
 * Created by Denis on 24.02.2017.
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Task6 {
    public static void main(String[] args){
        final int n = 6;
        int[][] matrix = new int[n][n];

        for(int j=0; j < matrix.length; j++){
            for (int i=0; i < matrix[j].length; i++){
                if (j == 0 | (j - n + 1) == 0) {
                    matrix[j][i] = 1;
                }
                else{
                    if (i == 0 | (i - n + 1) == 0){
                        matrix[j][i] = 1;
                    }
                    else {
                        matrix[j][i] = 0;
                    }
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
