package bg.tu_varna.sit.a1.f21621551;

import java.util.AbstractMap;
import java.util.Map.Entry;

public enum Files {
    NUMERIC_CODES ("Numeric", "src\\bg\\tu_varna\\sit\\a1\\f21621551\\numericCodes.txt"),
    MIXED_CODES ("Mixed", "src\\bg\\tu_varna\\sit\\a1\\f21621551\\mixedCodes.txt"),
    ERRORS ("Errors", "src\\bg\\tu_varna\\sit\\a1\\f21621551\\localErrors.txt");


    private String key;
    private String value;

    Files(String key, String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
    public Entry<String,String> getBoth() {
        return new AbstractMap.SimpleEntry<>(key, value);
    }   
    
}