package Lesson14.by.rdcentre.javatr.view;

import Lesson14.by.rdcentre.javatr.controller.Controller;
import java.util.Scanner;

/**
 * Created by R80 Home on 18.04.2017.
 */
public class View {
    public static void main(String[] args){
        Controller cl = new Controller();

        Scanner sc = new Scanner(System.in);
        System.out.println("1-Exit; 2-Add; 3-Search; 4-Show goods");
        String request;

        while( 1==1 ) {
            while (!sc.hasNextLine()) {
                sc.nextLine();
                // System.out.println("1-Exit; 2-Add; 3-Search; 4-Show goods");
            }
            request = sc.nextLine();
            System.out.println(cl.executeTask(request));
        }
    }
}
