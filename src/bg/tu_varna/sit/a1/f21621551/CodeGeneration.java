package bg.tu_varna.sit.a1.f21621551;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

import bg.tu_varna.sit.a1.f21621551.implement.Code;

public class CodeGeneration {

    private Code codesNum;
    private ArrayList<Code> codes = new ArrayList<>();

    public void generateCodes(String className) {

        int i = 0;
        do {
            // codesNum = new NumericCode();
            codesNum = codesNum.generate(null);
            codes.add(i, codesNum);
            i++;
        } while (i <= 10);
    }

    public ArrayList<Code> getCodes() {
        return codes;
    }

}
