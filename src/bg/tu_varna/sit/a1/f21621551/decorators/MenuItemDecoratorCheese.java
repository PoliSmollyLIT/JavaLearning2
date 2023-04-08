package bg.tu_varna.sit.a1.f21621551.decorators;

import bg.tu_varna.sit.a1.f21621551.Dish;

public class MenuItemDecoratorCheese extends MenuItemDecorator{

    public MenuItemDecoratorCheese(Dish item) {
        super(item);
    }

    @Override
    public String cook() {
        return item.cook() + addCheese();
    }
    
    private String addCheese(){
        return " с кашкавал ";
    }
    
}