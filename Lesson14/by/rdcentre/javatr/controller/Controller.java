package Lesson14.by.rdcentre.javatr.controller;

import Lesson14.by.rdcentre.javatr.controller.command.Command;

/**
 * Created by Denis on 18.04.2017.
 */
public final class Controller {
    private final CommandProvider provider = new CommandProvider();
    private final char paramDelimeter = ' ';

    public String executeTask(String request){
        String commandName;
        Command executionCommand;
        int paramDelimeterIndex;
//System.out.println(request);
//System.out.println(request.indexOf(paramDelimeter));
        if (request.indexOf(paramDelimeter)== -1) {paramDelimeterIndex = request.length();}
        else {paramDelimeterIndex = request.indexOf(paramDelimeter);}

        commandName = request.substring(0, paramDelimeterIndex);
        executionCommand = provider.getCommand(commandName);
//System.out.println(commandName);
        String response;
        response = executionCommand.execute(request);
        return response;
    }

}
