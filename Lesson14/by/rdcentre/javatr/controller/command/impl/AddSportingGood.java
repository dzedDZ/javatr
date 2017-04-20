package Lesson14.by.rdcentre.javatr.controller.command.impl;

import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.controller.command.Command;
import Lesson14.by.rdcentre.javatr.service.SportingGoodService;
import Lesson14.by.rdcentre.javatr.service.UserService;
import Lesson14.by.rdcentre.javatr.service.factory.ServiceFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Denis on 20.04.2017.
 */
public class AddSportingGood implements Command {
    @Override
    public String execute(String request) {
        String name;
        double price;
        boolean isLeased;
        boolean isArchive;
        String response;


        Pattern regex = Pattern.compile("([\\S\\d]+)"); //paramDelimeter should be ' '.
        Matcher matcher = regex.matcher(request);

        matcher.find(); // just to skip command name
        if(matcher.find())
        { name = matcher.group(1);}
        else
        {
            response = "Add_Good: name param missed";
            return response;
        }
        if (matcher.find())
        { price = Double.parseDouble(matcher.group(1));}
        else {
            response = "Add_Good: prive param missed";
            return response;
        }
       /*
        if (matcher.find())
        { isLeased = matcher.group(1);}
        else
        {
            response = "Add_Good: isLeased param missed";
            return response;
        }
        if (matcher.find())
        { isArchive = matcher.group(1);}
        else
        {
            response = "Add_Good: isArchive param missed";
            return response;
        }

        */
       isArchive = false;
       isLeased = false;

       ServiceFactory serviceFactory = ServiceFactory.getInstance();
       SportingGoodService sportingGoodService = serviceFactory.getSportingGoodService();

        //    try {
        sportingGoodService.addSportingGood(name,price,isArchive,isLeased);
        response = "The good " + name + " was added";
        //  }
        //catch () {

        //}
        return response;
    }
}
