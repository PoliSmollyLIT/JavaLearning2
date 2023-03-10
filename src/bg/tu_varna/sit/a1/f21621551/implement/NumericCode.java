package bg.tu_varna.sit.a1.f21621551.implement;

import bg.tu_varna.sit.a1.f21621551.interfaces.NumericCodeGenerator;

public class NumericCode extends Code implements NumericCodeGenerator{

    public NumericCode() {
    }

    @Override
    public StringBuilder generate(String chars) {
        return super.generate(charsNumeric);
    } 
}
