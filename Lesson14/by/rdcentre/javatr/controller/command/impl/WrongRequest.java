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
                "Show_user  to list all users" + "\r\n" +
                "Add_user [name] [address] [phonenumber] to add a user" + "\r\n" +
                "Add_good [name] [price] to add a sporting good" + "\r\n" +
                "Show_good to list all sporting goods" + "\r\n" +
                "Show_leas to list all leased goods" + "\r\n" +
                "Hire_out [userName] [goodName] [startDateYear] [startDateMonth] [startDateDay] [leasingDays] [endDateYear] [endDateMonth] [endDateDay] [leasingSum] to create leasing " + "\r\n" +
                "";
        ;
        return response;
    }
}
