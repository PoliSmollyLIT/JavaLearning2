package bg.tu_varna.sit.a1.f21621551.implement;

import bg.tu_varna.sit.a1.f21621551.interfaces.MixedCodeGenerator;

public class MixedCode extends Code implements MixedCodeGenerator{


    public MixedCode() {
    }

    @Override
    public StringBuilder generate(String chars) {
        return super.generate(charsMixed);
    }
    
}
