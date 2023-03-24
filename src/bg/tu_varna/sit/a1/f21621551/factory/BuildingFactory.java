package bg.tu_varna.sit.a1.f21621551.factory;

import bg.tu_varna.sit.a1.f21621551.implement.Building;

public class BuildingFactory  {
    
    public static Building getBuilding(AbstractBuildingFactory building){
      return building.createBuilding();
    }
}
