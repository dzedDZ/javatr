package Lesson14.by.rdcentre.javatr.controller.command.impl;

import Lesson14.by.rdcentre.javatr.bean.User;
import Lesson14.by.rdcentre.javatr.controller.command.Command;
import Lesson14.by.rdcentre.javatr.service.SportingGoodService;
import Lesson14.by.rdcentre.javatr.service.UserService;
import Lesson14.by.rdcentre.javatr.service.factory.ServiceFactory;

import java.util.ArrayList;

/**
 * Created by Denis on 20.04.2017.
 */
public class ShowGood implements Command {
    @Override
    public String execute(String request) {
        String response = null;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        SportingGoodService sportingGoodService = serviceFactory.getSportingGoodService();

        //    try {
        ArrayList<User> sg = sport. showUser();
        response = "***End of Good list***";
        //  }
        System.out.println("name|price|isArchive|isLeased");
        for (User str : u) {
            System.out.println(str);
        }
        return response;
    }
}
