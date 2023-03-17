package bg.tu_varna.sit.a1.f21621551.property;

import bg.tu_varna.sit.a1.f21621551.PropertyType;

public class Property {
    
    private final PropertyType propertyType;
    private final double area;
    private final double price;
    private final int numberRooms;
    private final Boolean hasFurniture;
    private final Boolean hasGarage;
    private final Boolean hasGarden;
    
    public PropertyType getPropertyType() {
        return propertyType;
    }
    public double getArea() {
        return area;
    }
    public double getPrice() {
        return price;
    }
    public int getNumberRooms() {
        return numberRooms;
    }
    public boolean isHasFurniture() {
        return hasFurniture;
    }
    public boolean isHasGarage() {
        return hasGarage;
    }
    public boolean isHasGarden() {
        return hasGarden;
    }

    protected Property(PropertyBuilder builder){
        this.propertyType = builder.getPropertyType();
        this.area = builder.getArea();
        this.price = builder.getPrice();
        this.numberRooms = builder.getNumberRooms();
        this.hasFurniture = builder.isHasFurniture();
        this.hasGarage = builder.isHasGarage();
        this.hasGarden = builder.isHasGarden();
    }
    @Override
    public String toString() {
        return "Property " + propertyType + "\n\t price " + price + "\n\t numberRooms "
         + numberRooms  +(hasFurniture!=null? "\n\t hasFurniture " + hasFurniture : "" )+
         (hasGarage!=null?  "\n\t hasGarage " + hasGarage : "" )+ (hasGarden!=null? "\n\t hasGarden " + hasGarden : "");
    }

    

}