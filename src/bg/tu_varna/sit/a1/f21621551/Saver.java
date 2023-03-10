package bg.tu_varna.sit.a1.f21621551;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import bg.tu_varna.sit.a1.f21621551.implement.Code;

public class Saver {
    private FileWriter outputStream;
    private ArrayList<Code> codes;

    
    public Saver(ArrayList<Code> codes) {
        this.codes = codes;
    }

    public ArrayList<Code> getCode() {
        return codes;
    }

    public void saveCodes(ArrayList<Code> codes, Files filename) throws IOException {
        File fileName = new File(filename.getValue());
        outputStream = new FileWriter(fileName);
        for (Code code : codes) {
            outputStream.append(code.toString());    
        }
         outputStream.close();        
    }
}
