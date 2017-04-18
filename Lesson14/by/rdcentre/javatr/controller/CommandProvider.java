package Lesson14.by.rdcentre.javatr.controller;

import Lesson14.by.rdcentre.javatr.controller.command.Command;
import Lesson14.by.rdcentre.javatr.controller.command.CommandName;
import Lesson14.by.rdcentre.javatr.controller.command.impl.AddUser;
import Lesson14.by.rdcentre.javatr.controller.command.impl.Exit;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Denis on 18.04.2017.
 */
public final class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider(){
    //    repository.put(CommandName.SIGN_IN, new SingIn());
        repository.put(CommandName.REGISTRATION, new AddUser());
        repository.put(CommandName.EXIT, new Exit());
    //    repository.put(CommandName.ADD_BOOK, new AddBook());
        //repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
//...
    }

    public Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;
    try{
        commandName = CommandName.valueOf(name.toUpperCase());
    }catch (IllegalArgumentException | NullPointerException e){
        command = repository.get(CommandName.WRONG_REQUEST);
    }
        return command;
    }
}
