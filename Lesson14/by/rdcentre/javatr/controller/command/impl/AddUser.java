package Lesson14.by.rdcentre.javatr.controller.command.impl;

import Lesson14.by.rdcentre.javatr.controller.command.Command;
import Lesson14.by.rdcentre.javatr.service.UserService;
import Lesson14.by.rdcentre.javatr.service.factory.ServiceFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Denis on 18.04.2017.
 */
public class AddUser implements Command {
    @Override
    public String execute(String request) {
        //char paramDelimeter = ' ';
        String name = "";
        String address = "";
        String phoneNumber = "";
        String response;

        Pattern regex = Pattern.compile("([\\S\\d]+)"); //paramDelimeter should be ' '.
        Matcher matcher = regex.matcher(request);
        matcher.find(); // just to skip command name
        if(matcher.find())
            { name = matcher.group(1);}
        else
            {
                response = "Add_User: name param missed";
                return response;
            }
        if (matcher.find())
            { address = matcher.group(1);}
        else {
            response = "Add_user: address param missed";
            return response;
        }
        if (matcher.find())
            { phoneNumber = matcher.group(1);}
        else
        {
            response = "Add_User: phonenumber param missed";
            return response;
        }

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();

    //    try {
        userService.Registration(name,address,phoneNumber);
        response = "Welcome " + name;
      //  }
        //catch () {

        //}
        return response;
    }
}
