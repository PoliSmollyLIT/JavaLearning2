package bg.tu_varna.sit.a1.f21621551.decorators;

import bg.tu_varna.sit.a1.f21621551.Dish;

public class MenuItemDecoratorBecon extends MenuItemDecorator {
   
    public MenuItemDecoratorBecon(Dish item) {
        super(item);
    }

    @Override
    public String cook() {
        return super.cook() + addBecon();
    }
    
    private String addBecon(){
        return " + бекон ";
    }
}