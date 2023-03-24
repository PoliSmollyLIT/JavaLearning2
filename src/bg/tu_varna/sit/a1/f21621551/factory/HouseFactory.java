package bg.tu_varna.sit.a1.f21621551.factory;

import bg.tu_varna.sit.a1.f21621551.Architect;
import bg.tu_varna.sit.a1.f21621551.implement.Building;
import bg.tu_varna.sit.a1.f21621551.implement.House;

public class HouseFactory implements AbstractBuildingFactory{

    private House house; 
   
    public HouseFactory(int numberFloors, double price, double area, int numberBedrooms, int numberBathrooms, Architect architect) {
        this.house = new House(numberFloors, price, area, numberBedrooms, numberBathrooms, architect);
    }

    @Override
    public Building createBuilding() {
        return house;
    }
    
    
}
