package Lesson14.by.rdcentre.javatr.view;

import Lesson14.by.rdcentre.javatr.controller.Controller;
import Lesson14.by.rdcentre.javatr.controller.command.CommandName;

import java.util.Scanner;

/**
 * Created by Denis on 18.04.2017.
 * NOT Implemented:
 * MarkArchive
 * grouping
 *
 * *
 *
 */
public class View {
    public static void main(String[] args){
        Controller cl = new Controller();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter command");

        String request;
        String response;

        while( 1==1 ) {
            while (!sc.hasNextLine()) {
                sc.next();
                System.out.println("Enter command");
            }
            request = sc.nextLine();
            response = cl.executeTask(request);
            System.out.println(response);
            if (response == "Bye"){
                break;
            }
        }
    }
}
