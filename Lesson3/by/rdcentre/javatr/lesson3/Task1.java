package by.rdcentre.javatr.lesson3;
import java.util.Scanner;
// task1
//
public class Task1 {
    public static void main(String[] args) {// всегда делим задачу на подзадачи и решаем их в отдельных методах
        int n = 5;

        int k, sum;
        int[] arInt = new int[n];
        Scanner sc = new Scanner(System.in);
        String str = "";
        for (int i = 0; i < n; i++) {
            System.out.print("> ");
            if (sc.hasNextLine()) {
                str = sc.nextLine();
                arInt[i] = Integer.parseInt(str);
            }
        }
        k = 0;
        System.out.print("k=");
        if (sc.hasNextLine()) {
            str = sc.nextLine();
            k = Integer.parseInt(str);
        }
        sum = 0;
        for (int i = 0; i < arInt.length; i++) {
            //    System.out.println("-> " + arStr[i] + " length=" +
            //            arStr[i].length());
            if (arInt[i] % k == 0) {
                sum = sum + arInt[i];
            }

        }
        System.out.println("Sum of array elements which mod " + k + " = " + sum);
    }
}
