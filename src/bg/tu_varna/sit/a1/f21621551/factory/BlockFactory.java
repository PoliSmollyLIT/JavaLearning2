package bg.tu_varna.sit.a1.f21621551.factory;

import bg.tu_varna.sit.a1.f21621551.Architect;
import bg.tu_varna.sit.a1.f21621551.implement.Block;
import bg.tu_varna.sit.a1.f21621551.implement.Building;

public class BlockFactory implements AbstractBuildingFactory{
    private Block block;

    public BlockFactory(int numberFloors, double price, double area, Architect architect, int numberApartments) {
        this.block = new Block(numberFloors, price, area, architect, numberApartments);
    }

    @Override
    public Building createBuilding() {
        return block;
    }    
    
}
