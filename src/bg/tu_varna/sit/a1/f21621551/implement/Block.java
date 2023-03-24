package bg.tu_varna.sit.a1.f21621551.implement;

import bg.tu_varna.sit.a1.f21621551.Architect;

public class Block extends Building{
    private final int numberApartments;

    public Block(int numberFloors, double price, double area, Architect architect, int numberApartments) {
        super(numberFloors, price, area, architect);
        this.numberApartments = numberApartments;
    }

    public int getNumberApartments() {
        return numberApartments;
    }

    @Override
    public String toString() {
        return super.toString() + "numberApartments: " + numberApartments + "\n\t";
    }
    
    
}
