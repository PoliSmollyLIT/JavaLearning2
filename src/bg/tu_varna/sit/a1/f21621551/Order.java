package bg.tu_varna.sit.a1.f21621551;

import java.util.ArrayList;

import bg.tu_varna.sit.a1.f21621551.decorators.MenuItemDecorator;
import bg.tu_varna.sit.a1.f21621551.decorators.MenuItemDecoratorBecon;
import bg.tu_varna.sit.a1.f21621551.decorators.MenuItemDecoratorCheese;
import bg.tu_varna.sit.a1.f21621551.decorators.MenuItemDecoratorOlives;

public class Order {

    private ArrayList<Dish> dishes = new ArrayList<>();
    
    //public Order() { }

    public void addDish(Dish dish){
        dishes.add(dish);
    }

    public String getOrder(){
        StringBuilder finalOrder = new StringBuilder();
        for (Dish d : dishes) {
            finalOrder.append(decorateItem(d) + "\n");
        }
       return finalOrder.toString();
    }

    private String decorateItem(Dish dish){
        MenuItemDecorator decorator = new MenuItemDecorator(dish);
        MenuItemDecorator becon = new MenuItemDecoratorBecon(decorator);
        MenuItemDecorator cheese = new MenuItemDecoratorCheese(becon);
        MenuItemDecorator olives = new MenuItemDecoratorOlives(cheese);
        decorator.cook();
        becon.cook();
        cheese.cook();
        return olives.cook();
    }
    
}