package Lesson14.by.rdcentre.javatr.controller.command.impl;

import Lesson14.by.rdcentre.javatr.bean.User;
import Lesson14.by.rdcentre.javatr.controller.command.Command;
import Lesson14.by.rdcentre.javatr.service.UserService;
import Lesson14.by.rdcentre.javatr.service.factory.ServiceFactory;

import java.util.ArrayList;

/**
 * Created by Denis on 18.04.2017.
 */
public class ShowUser implements Command {
    @Override
    public String execute(String request) {
        String response = null;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();

        //    try {
        ArrayList<User> u = userService.showUser();
        response = "***End of User list***";
        //  }
        System.out.println("name|address|phonenumber");
        for (User str : u) {
            System.out.println(str);
        }
        return response;
    }
}
