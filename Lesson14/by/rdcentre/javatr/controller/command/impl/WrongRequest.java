package Lesson14.by.rdcentre.javatr.controller.command.impl;

import Lesson14.by.rdcentre.javatr.controller.command.Command;

/**
 * Created by Denis on 19.04.2017.
 */
public class WrongRequest implements Command {
    @Override
    public String execute(String request) {
        String response = null;
        response = "Request could not be recognised " + "\r\n" +
                "please use the following request:" + "\r\n" +
                "EXIT [without params] to exit the program" + "\r\n" +
                "Show_user [without params] to list all users" + "\r\n" +
                "Add_user [name] [address] [phonenumber] to add a user" + "\r\n" +
                "";
        ;
        return response;
    }
}
