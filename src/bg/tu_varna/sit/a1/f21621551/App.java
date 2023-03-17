package bg.tu_varna.sit.a1.f21621551;

import bg.tu_varna.sit.a1.f21621551.property.Property;
import bg.tu_varna.sit.a1.f21621551.property.PropertyBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
         * Приложете Singleton и Builder, за да съставите програма за агенти на
         * недвижими имоти.
         * Всеки агент има собствени име, телефон за контакт и използват общ списък с
         * недвижими имоти,
         * като има възможност за добавяне и премахване на имоти от този списък.
         * - Всеки имот има характеристики за тип (къща, апартамент или офис), площ, цена,
         * - брой стаи, обзаведен или не, наличност на гараж/парково място и градина.
         */

        PropertyBuilder builder = new PropertyBuilder(PropertyType.APPARTMENT, 120.50, 1200.43, 4)
                                                        .setHasFurniture(false)
                                                        .setHasGarage(true)
                                                        .setHasGarden(false);
            
        Property property1 = builder.build();

        PropertyBuilder builder2 = new PropertyBuilder(PropertyType.APPARTMENT, 120.50, 1200.43, 4)
                                                        .setHasFurniture(false)
                                                        .setHasGarden(false);

        Property property2 = builder2.build();

        // Agent pesho = new Agent("Pesho", "0882923224");
        // Agent alex = new Agent("Alex", "0996655442");

        PropertyListSingleton propertyList = PropertyListSingleton.getInstance();
        System.out.println(propertyList);

        Agent.addProperty(property1);
        Agent.addProperty(property2);
        System.out.println(propertyList);
        Agent.deleteProperty(property1);
        System.out.println(propertyList);

    }
}
