package bg.tu_varna.sit.a1.f21621551.salad;

import bg.tu_varna.sit.a1.f21621551.MenuItem;

public class Salad extends MenuItem{

    @Override
    public String toString() {
        return "Свежа салата: ";
    }

    @Override
    public String cook() {
        return this.toString();
    }
    
    
}
