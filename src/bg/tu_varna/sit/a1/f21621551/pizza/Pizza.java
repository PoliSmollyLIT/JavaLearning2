package bg.tu_varna.sit.a1.f21621551.pizza;

import bg.tu_varna.sit.a1.f21621551.MenuItem;

public class Pizza extends MenuItem{
    
    @Override
    public String cook() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Италианска пица: ";
    }    
    
}
