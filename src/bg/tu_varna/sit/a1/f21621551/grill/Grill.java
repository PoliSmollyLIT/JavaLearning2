package bg.tu_varna.sit.a1.f21621551.grill;

import bg.tu_varna.sit.a1.f21621551.MenuItem;

public class Grill extends MenuItem{

    
    @Override
    public String cook() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Мешана скара: ";
    }    
    
}