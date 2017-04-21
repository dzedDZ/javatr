package Lesson14.by.rdcentre.javatr.controller.command.impl;

import Lesson14.by.rdcentre.javatr.controller.command.Command;
import Lesson14.by.rdcentre.javatr.service.LeasingService;
import Lesson14.by.rdcentre.javatr.service.factory.ServiceFactory;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Denis on 21.04.2017.
 */
public class HireOut implements Command {
    @Override
    public String execute(String request) {
        String userName = "";
        String sportingGoodName = "";
        int startDateYear = 1900;
        int startDateMonth = 1;
        int startDateDay = 1;
        int leasingDays = 0;
        int endDateYear = 2900;
        int endDateMonth = 12;
        int endDateDay = 31;
        double leasingSum = -1.0;
        String response = "";

        Pattern regex = Pattern.compile("([\\S\\d]+)"); //paramDelimeter should be ' '.
        Matcher matcher = regex.matcher(request);
        matcher.find(); // just to skip command name

        if(matcher.find())
        { userName = matcher.group(1);}
        else
        {
            response = "Hire_Out: userName param missed";
            return response;
        }
        if(matcher.find())
        { sportingGoodName = matcher.group(1);}
        else
        {
            response = "Hire_Out: sportingGoodName param missed";
            return response;
        }
        if(matcher.find())
        { startDateYear = Integer.parseInt(matcher.group(1));}
        else
        {
            response = "Hire_Out: startDateYear param missed";
            return response;
        }
        if(matcher.find())
        { startDateMonth = Integer.parseInt(matcher.group(1));}
        else
        {
            response = "Hire_Out: startDateMonth param missed";
            return response;
        }
        if(matcher.find())
        { startDateDay = Integer.parseInt(matcher.group(1));}
        else
        {
            response = "Hire_Out: startDateDay param missed";
            return response;
        }
        if(matcher.find())
        { leasingDays = Integer.parseInt(matcher.group(1));}
        else
        {
            response = "Hire_Out: leasingDays param missed";
            return response;
        }
        if(matcher.find())
        { endDateYear = Integer.parseInt(matcher.group(1));}
        else
        {
            response = "Hire_Out: endDateYear param missed";
            return response;
        }
        if(matcher.find())
        { endDateMonth = Integer.parseInt(matcher.group(1));}
        else
        {
            response = "Hire_Out: endDateMonth param missed";
            return response;
        }
        if(matcher.find())
        { endDateDay = Integer.parseInt(matcher.group(1));}
        else
        {
            response = "Hire_Out: endDateDay  param missed";
            return response;
        }
        if(matcher.find())
        { leasingSum = Double.parseDouble(matcher.group(1));}
        else
        {
            response = "Hire_Out: LeasingSum  param missed";
            return response;
        }

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        LeasingService leasingService = serviceFactory.getLeasingService();

        response = leasingService.addLeasingObject(sportingGoodName, userName, startDateYear,
                startDateMonth, startDateDay, leasingDays, endDateYear, endDateMonth, endDateDay, leasingSum);
        return response;
    }
}
