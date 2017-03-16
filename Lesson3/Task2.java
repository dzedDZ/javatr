/**
 * Created by Denis on 22.02.2017.
 * В целочисленной последовательности есть нулевые элементы. Создать массив из
 номеров этих элементов.
 */
public class Task2 {
    public static void main(String[] args){
        int[] arGiven = {1, 0, 3, 4, 5, 0, 4, 5, 0};
        int y = 0;
        for (int i = 0; i < arGiven.length; i++) {
            if (arGiven[i] == 0) {
                y = y + 1;
            }
        }
        int [] arr = new int[ y ];
        y = 0;
        for (int i = 0; i < arGiven.length; i++) {
            if (arGiven[i] == 0) {
                arr[y] = i;
                y = y + 1;
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    }

