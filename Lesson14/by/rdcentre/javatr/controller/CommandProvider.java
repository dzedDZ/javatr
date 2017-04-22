package Lesson14.by.rdcentre.javatr.controller;

import Lesson14.by.rdcentre.javatr.controller.command.Command;
import Lesson14.by.rdcentre.javatr.controller.command.CommandName;
import Lesson14.by.rdcentre.javatr.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Denis on 18.04.2017.
 */
public final class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider(){
    //    repository.put(CommandName.SIGN_IN, new SingIn());
        repository.put(CommandName.ADD_USER, new AddUser());
        repository.put(CommandName.SHOW_USER, new ShowUser());
        repository.put(CommandName.EXIT, new Exit());
        repository.put(CommandName.ADD_GOOD, new AddSportingGood());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
        repository.put(CommandName.SHOW_GOOD, new ShowGood());
        repository.put(CommandName.SHOW_LEAS, new ShowLeas());
        repository.put(CommandName.HIRE_OUT, new HireOut());
        repository.put(CommandName.RETURN, new Return());
//...
    }

    public Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;
    try{
        commandName = CommandName.valueOf(name.toUpperCase());
        command = repository.get(commandName);
    }catch (IllegalArgumentException | NullPointerException e){
        command = repository.get(CommandName.WRONG_REQUEST);
    }
        return command;
    }
}
