package bg.tu_varna.sit.a1.f21621551.implement;

import java.security.SecureRandom;
import bg.tu_varna.sit.a1.f21621551.interfaces.CodeGenerator;

public class Code implements CodeGenerator {

    protected StringBuilder code;

    public StringBuilder getCode() {
        return this.code;
    }

    @Override
    public StringBuilder generate(String chars) {

        SecureRandom random = new SecureRandom();
        code = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(chars.length());
            code.append(chars.charAt(randomIndex));
        }

        return code;
    }

    @Override
    public String toString() {
        return "Code = " + this.code + "\n";
    }

}
