package by.rdcentre.javatr.lesson2;

/**
 * Created by Denis on 19.02.2017.
 */
public class Task12 {
    public static void main(String[] args){
        //int n = args.length;
        int sumArgs = 0;
        System.out.println("args.length: " + args.length );
        if (args.length <= 0){
            System.out.println("No arguments");
            return;
        }
        for(int i=0; i<args.length; i++) {
            sumArgs = sumArgs + Integer.parseInt(args[i]);
            System.out.println("args[" + i + "]=" + args[i]);
        }
        System.out.println("Sum of command line arguments :" + sumArgs);
    }
}
