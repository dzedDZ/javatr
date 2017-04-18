package Lesson14.by.rdcentre.javatr.controller.command.impl;

import Lesson14.by.rdcentre.javatr.controller.command.Command;

/**
 * Created by R80 Home on 18.04.2017.
 */
public class Exit implements Command {
    @Override
    public String execute(String request) {
        //    try {
        String response = null;
     response = "Bye";
        //  }
        //catch () {

        //}
        return response;
    }
}
