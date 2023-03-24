package bg.tu_varna.sit.a1.f21621551;

import bg.tu_varna.sit.a1.f21621551.factory.BuildingFactory;
import bg.tu_varna.sit.a1.f21621551.factory.BlockFactory;
import bg.tu_varna.sit.a1.f21621551.factory.HouseFactory;
import bg.tu_varna.sit.a1.f21621551.implement.Building;

public class App {
    public static void main(String[] args) throws Exception {

    Architect arch1 = new Architect("Petar", "Petrov");
    Building build1 = BuildingFactory.getBuilding(
        new HouseFactory(2, 120000.0, 89.50, 3, 4, arch1));
    Building build2 = BuildingFactory.getBuilding(
        new BlockFactory(12, 1000000, 120.0, arch1, 120));

        System.out.println(build1.sketch());
        System.out.println(build2.sketch());
    }
}
