package Lesson14.by.rdcentre.javatr.controller.command.impl;

import Lesson14.by.rdcentre.javatr.controller.command.Command;
import Lesson14.by.rdcentre.javatr.service.LeasingService;
import Lesson14.by.rdcentre.javatr.service.factory.ServiceFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by R80 Home on 21.04.2017.
 */
public class Return implements Command{
    @Override
    public String execute(String request) {
        String userName = "";
        String sportingGoodName = "";

        int endDateYear = 2900;
        int endDateMonth = 12;
        int endDateDay = 31;

        String response = "";

        Pattern regex = Pattern.compile("([\\S\\d]+)"); //paramDelimeter should be ' '.
        Matcher matcher = regex.matcher(request);
        matcher.find(); // just to skip command name

        if(matcher.find())
        { userName = matcher.group(1);}
        else
        {
            response = "Return: userName param missed";
            return response;
        }
        if(matcher.find())
        { sportingGoodName = matcher.group(1);}
        else
        {
            response = "Return: sportingGoodName param missed";
            return response;
        }
        if(matcher.find())
        { endDateYear = Integer.parseInt(matcher.group(1));}
        else
        {
            response = "Return: endDateYear param missed";
            return response;
        }
        if(matcher.find())
        { endDateMonth = Integer.parseInt(matcher.group(1));}
        else
        {
            response = "Return: endDateMonth param missed";
            return response;
        }
        if(matcher.find())
        { endDateDay = Integer.parseInt(matcher.group(1));}
        else
        {
            response = "Return: endDateDay param missed";
            return response;
        }

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        LeasingService leasingService = serviceFactory.getLeasingService();

        response = leasingService.returnLeasingObject(sportingGoodName, userName, endDateYear,
                endDateMonth, endDateDay);

        return response;
    }
}
