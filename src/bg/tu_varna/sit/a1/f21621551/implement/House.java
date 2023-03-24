package bg.tu_varna.sit.a1.f21621551.implement;

import bg.tu_varna.sit.a1.f21621551.Architect;

public class House extends Building{
    private final int numberBedrooms;
    private final int numberBathrooms;
    public House(int numberFloors, double price, double area, int numberBedrooms, int numberBathrooms, Architect architect) {
        super(numberFloors, price, area, architect);
        this.numberBedrooms = numberBedrooms;
        this.numberBathrooms = numberBathrooms;
    }
    public int getNumberBedrooms() {
        return numberBedrooms;
    }
    public int getNumberBathrooms() {
        return numberBathrooms;
    }
    @Override
    public String toString() {
        return super.toString() + "number Bedrooms: " +  numberBedrooms + "\n\tnumberBathrooms: " + numberBathrooms + "\n\t";
    }  
    
}
