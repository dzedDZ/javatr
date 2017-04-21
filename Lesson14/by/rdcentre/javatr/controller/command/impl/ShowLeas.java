package Lesson14.by.rdcentre.javatr.controller.command.impl;

import Lesson14.by.rdcentre.javatr.bean.Leasing;
import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.bean.User;
import Lesson14.by.rdcentre.javatr.controller.command.Command;
import Lesson14.by.rdcentre.javatr.service.LeasingService;
import Lesson14.by.rdcentre.javatr.service.factory.ServiceFactory;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by Denis on 21.04.2017.
 */
public class ShowLeas implements Command{
    @Override
    public String execute(String request) {
    String response = null;

    ServiceFactory serviceFactory = ServiceFactory.getInstance();
        LeasingService leasingService = serviceFactory.getLeasingService();

    //    try {
    ArrayList<Leasing> l = leasingService.showLeasingService ();
    response = "***End of Leasing list***";
    //  }


        System.out.println("user.name|good.name|startDate|leasingDays|endDate|sum");
        for (Leasing str : l) {
        System.out.println(str);
    }
        return response;
}
}
