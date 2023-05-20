package bg.tu_varna.sit.a1.f21621551.command;

import java.util.ArrayList;

public class IceCreamMaker {
    private ArrayList<Commands> commands = new ArrayList<>();

    public IceCreamMaker() {
    }

    public void addCommand(Commands command){
        commands.add(command);
    }

    public void execute(){
        for (Commands command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
