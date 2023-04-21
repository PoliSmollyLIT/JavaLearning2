package bg.tu_varna.sit.a1.f21621551.command;

import java.nio.file.AccessDeniedException;

public class RealCommand implements Command{
    private boolean acceptPipe;
    private String commandName;   

    public RealCommand(String commandName, boolean acceptPipe) {
        this.acceptPipe = acceptPipe;
        this.commandName = commandName;
    }

    @Override
    public boolean canAcceptPipe() {
        return this.acceptPipe;
    }

    @Override
    public String runCommand() throws AccessDeniedException {
        return this.toString();
    }

    @Override
    public String toString() {
        return  this.commandName + " is running...\n";
    }

    public String getCommandName() {
        return commandName;
    }
    
    
}