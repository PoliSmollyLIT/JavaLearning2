package bg.tu_varna.sit.a1.f21621551.proxy;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;

import bg.tu_varna.sit.a1.f21621551.command.Command;

public class CommandProxy implements Command {

    private ArrayList<Command> systemCommands;
    private ArrayList<Command> restrictedCommands;

    public CommandProxy() {
        this.systemCommands = new ArrayList<>();
        this.restrictedCommands = new ArrayList<>();
    }

    @Override
    public String runCommand() throws AccessDeniedException {
        StringBuilder output = new StringBuilder();
        for (Command command2 : systemCommands) {
            if (restrictedCommands.contains(command2)) {
                throw new AccessDeniedException("You don't have permissions for this command!");
            } 
         if (command2.canAcceptPipe() == false) {
                throw new AccessDeniedException("You can't do the pipe with these commands!");
            }
                output.append(command2.runCommand());
            
        }
        return output.toString();
    }

    @Override
    public boolean canAcceptPipe() {
        return false;
    }

    public void addRestrictedCommand(Command commandToResctrict) {
        this.restrictedCommands.add(commandToResctrict);
    }

    public void addSystemCommands(Command commandToAdd){
        this.systemCommands.add(commandToAdd);
    }
}