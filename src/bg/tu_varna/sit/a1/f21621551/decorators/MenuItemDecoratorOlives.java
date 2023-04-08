package bg.tu_varna.sit.a1.f21621551.decorators;

import bg.tu_varna.sit.a1.f21621551.Dish;

public class MenuItemDecoratorOlives extends MenuItemDecorator{

    public MenuItemDecoratorOlives(Dish item) {
        super(item);
    }

    @Override
    public String cook() {
        return item.cook() + addBecon();
    }
    
    private String addBecon(){
        return " с маслини ";
    }
}