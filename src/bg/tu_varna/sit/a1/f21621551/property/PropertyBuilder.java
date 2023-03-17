package bg.tu_varna.sit.a1.f21621551.property;

import bg.tu_varna.sit.a1.f21621551.PropertyType;

public class PropertyBuilder {
    private PropertyType propertyType;
    private double area;
    private double price;
    private int numberRooms;
    private Boolean hasFurniture;
    private Boolean hasGarage;
    private Boolean hasGarden;

    public PropertyBuilder(PropertyType propertyType, double area, double price, int numberRooms) {
        this.propertyType = propertyType;
        this.area = area;
        this.price = price;
        this.numberRooms = numberRooms;
    }

    public PropertyBuilder setHasFurniture(Boolean furniture){
        this.hasFurniture = furniture;
        return this;
    }

    public PropertyBuilder setHasGarage(Boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public PropertyBuilder setHasGarden(Boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public Property build(){
        return new Property(this);
    }

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

    public Boolean isHasFurniture() {
        return hasFurniture;
    }

    public Boolean isHasGarage() {
        return hasGarage;
    }

    public Boolean isHasGarden() {
        return hasGarden;
    }
    
}