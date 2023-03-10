package bg.tu_varna.sit.a1.f21621551;

import java.util.ArrayList;
import bg.tu_varna.sit.a1.f21621551.implement.Code;
import bg.tu_varna.sit.a1.f21621551.implement.MixedCode;
import bg.tu_varna.sit.a1.f21621551.implement.NumericCode;

public class Application {

    public static void main(String args[]) {

        CodeSaver saver;
        Code codesNum;
        ArrayList<Code> codes = new ArrayList<>();
        int i = 0;
       
        do {
            codesNum = new NumericCode();
            codesNum.generate(null);
            codes.add(i, codesNum);
            i++;
        } while (i <= 10);

        saver = new CodeSaver(codes);
        saver.save(Files.MIXED_CODES);

        System.out.println("\n\n");
        codes.clear();

        Code codesMixed;
        i = 0;        
        do {
            codesMixed = new MixedCode();
            codesMixed.generate(null);
            codes.add(i, codesMixed);
            i++;
        } while (i <= 10);

        saver = new CodeSaver(codes);
        saver.save(Files.MIXED_CODES);
    }

}
