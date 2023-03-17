package bg.tu_varna.sit.a1.f21621551;

import bg.tu_varna.sit.a1.f21621551.property.Property;

public class Agent {
    private String name;
    private String phoneNumber;
    private static PropertyListSingleton propertyList = PropertyListSingleton.getInstance();
    
    
    public Agent(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public PropertyListSingleton getPropertyList() {
        return propertyList;
    }

    public static void addProperty(Property property){
        PropertyListSingleton.addElement(property);
    }

    public static void deleteProperty(Property property){
        PropertyListSingleton.deleteElement(property);
    }
}