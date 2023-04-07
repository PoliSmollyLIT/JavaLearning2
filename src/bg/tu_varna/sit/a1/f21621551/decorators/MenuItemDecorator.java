package bg.tu_varna.sit.a1.f21621551.decorators;

import bg.tu_varna.sit.a1.f21621551.Dish;

public class MenuItemDecorator implements Dish {
    protected Dish item;

    public MenuItemDecorator(Dish item) {
        this.item = item;
    }

    @Override
    public String cook(){
        return "Избрано ястие: ";
    }

    
    
}