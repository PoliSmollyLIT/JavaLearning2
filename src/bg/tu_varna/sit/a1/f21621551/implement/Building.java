package bg.tu_varna.sit.a1.f21621551.implement;

import bg.tu_varna.sit.a1.f21621551.Architect;
import bg.tu_varna.sit.a1.f21621551.interfaces.SketchBuilding;

public abstract class Building implements SketchBuilding{
    private final int numberFloors;
    private final double price;
    private final double area;
    private final Architect architect;
    
    
    public Building(int numberFloors, double price, double area, Architect architect) {
        this.numberFloors = numberFloors;
        this.price = price;
        this.area = area;
        this.architect = architect;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public double getPrice() {
        return price;
    }

    public double getArea() {
        return area;
    }

    public Architect getArchitect() {
        return architect;
    }

    @Override
    public String sketch(){
        return this.getClass().getSimpleName() + " build by " + architect.toString() +  " with area of " + area + "m^2 and extended area of " + numberFloors*area + "m^2\n";
    }

    @Override
    public String toString() {
        return  this.getClass().getName() + " is build by: " + architect.toString() + "\n\tand has: " + numberFloors + "floors\n\tprice: " + price + "€\n\tarea: " + area + "m^2\n\t";
    }

    
    
    
}
