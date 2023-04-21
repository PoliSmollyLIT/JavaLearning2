package bg.tu_varna.sit.a1.f21621551.command;

import java.nio.file.AccessDeniedException;
//import java.util.ArrayList;

public interface Command{
    String runCommand() throws AccessDeniedException;
    boolean canAcceptPipe();
}
