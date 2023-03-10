package bg.tu_varna.sit.a1.f21621551;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LoggingToFile {

    public static void writeToFile(Exception ex) throws IOException {
        Path logFile = Paths.get(Files.ERRORS.getValue());
        byte bytes[] = ("\r:" + ex.toString()).getBytes();
        java.nio.file.Files.write(logFile, bytes, StandardOpenOption.APPEND);
        System.out.println("Exception logged to your file");
    }
}
