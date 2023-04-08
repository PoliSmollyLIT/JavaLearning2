package bg.tu_varna.sit.a1.f21621551;

import bg.tu_varna.sit.a1.f21621551.grill.GrillSausages;
import bg.tu_varna.sit.a1.f21621551.grill.GrillSteaks;
import bg.tu_varna.sit.a1.f21621551.pizza.PizzaBurger;
import bg.tu_varna.sit.a1.f21621551.pizza.PizzaFourSeasons;
import bg.tu_varna.sit.a1.f21621551.salad.SaladCesar;
import bg.tu_varna.sit.a1.f21621551.salad.SaladVitamina;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Използвайте Bridge и Decorator pattern, за да разработите система за управление на ресторант.
        Ресторанта има различни видове ястия - скара, пици, салати. 
        Направете два вида скара, два вида пица и два вида салата.
        Към всяко ястие може да се добавят множество екстри - сирене, бекон, маслини.
        Да се състави поръчка и да се изведе крайния резултат от поръчката, 
        като се включат всички добавени екстри за всички ястия. */


        MenuItem dish1 = new SaladCesar();
        MenuItem dish2 = new SaladVitamina();
        MenuItem dish3 = new GrillSausages();
        MenuItem dish4 = new GrillSteaks();
        MenuItem dish5 = new PizzaBurger();
        MenuItem dish6 = new PizzaFourSeasons();
        Order orderList = new Order();
        orderList.addDish(dish1);
        orderList.addDish(dish2);
        orderList.addDish(dish3);
        orderList.addDish(dish4);
        orderList.addDish(dish5);
        orderList.addDish(dish6);
        
        System.out.println(orderList.getOrder());
    }       

}
