package bg.tu_varna.sit.a1.f21621551;

import java.io.IOException;
import java.util.ArrayList;

import bg.tu_varna.sit.a1.f21621551.implement.Code;

public class CodeSaver {
    private Saver saver;
    private ArrayList<Code> codes;

    public CodeSaver(ArrayList<Code> codes) {
        this.codes = codes;
    }

    public void save(Files fileName){
        saver = new Saver(codes);

        try{
            saver.saveCodes(codes, fileName);
        }catch (Exception e) {
               try {
                LoggingToFile.writeToFile(e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
    
    
    
}
