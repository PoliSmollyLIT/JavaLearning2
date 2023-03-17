package bg.tu_varna.sit.a1.f21621551;

import java.util.ArrayList;

import bg.tu_varna.sit.a1.f21621551.property.Property;

public class PropertyListSingleton {

    private static ArrayList<Property> properties = new ArrayList<>();

    private PropertyListSingleton() { }

    private static class SingletonHelper {
        private static final PropertyListSingleton INSTANCE = new PropertyListSingleton();
    }

    public static PropertyListSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
    
    public static void addElement(Property property){
        properties.add(property);
    }

    public static void deleteElement(Property property){
        properties.remove(property);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Property property : properties) {
            output.append(property + "\n");
        }
        return output.toString();
    }
    
    
}