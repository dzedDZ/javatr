package Lesson14.by.rdcentre.javatr.controller.command.impl;

import Lesson14.by.rdcentre.javatr.controller.command.Command;
import Lesson14.by.rdcentre.javatr.service.UserService;
import Lesson14.by.rdcentre.javatr.service.factory.ServiceFactory;

/**
 * Created by Denis on 18.04.2017.
 */
public class AddUser implements Command {
    @Override
    public String execute(String request) {

        String name = null;
        String address = null;
        String phoneNumber = null;
        String response = null;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();

    //    try {
        userService.Registration(name,address,phoneNumber);
        response = "Welcome";
      //  }
        //catch () {

        //}
        return response;
    }
}
