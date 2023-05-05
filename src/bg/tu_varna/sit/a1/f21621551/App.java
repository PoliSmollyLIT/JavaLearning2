package bg.tu_varna.sit.a1.f21621551;

import bg.tu_varna.sit.a1.f21621551.states.OrderReceived;
import bg.tu_varna.sit.a1.f21621551.visited.BoardGames;
import bg.tu_varna.sit.a1.f21621551.visited.Books;
import bg.tu_varna.sit.a1.f21621551.visited.Order;
import bg.tu_varna.sit.a1.f21621551.visited.Toys;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Използвайте Visitor и State моделите, за да съставите програма за обработка на поръчка,
        която да поддържа три състояния - приемане на поръчка, подготовка на поръчка, изпратена поръчка. 
        Продуктите, който се продават са книги, играчки, настолни игри. 
        Трябва да може да се изчисли общата цена на всички стоки в поръчката. */
        
       
        Books book1 = new Books("book 1", 12.23);
        Books book2 = new Books("book 2", 20.34);
        Toys toys1 = new Toys("happy octo", 30.23);
        Toys toys2 = new Toys("hot wheels", 10.40);
        BoardGames bg1 = new BoardGames("Ticket to Ride", 90.50);
        BoardGames bg2 = new BoardGames("Unstable Unicorns", 50.32);

        Order order = new Order();
        order.addProduct(book1);
        order.addProduct(book2);
        order.addProduct(toys1);
        order.addProduct(toys2);
        order.addProduct(bg1);
        order.addProduct(bg2);

        System.out.println(order.getOrderInfo());

        order.setState(new OrderReceived());
        System.out.println(order.getState());
        order.nextState();
        System.out.println(order.getState());
        order.previousState();
        System.out.println(order.getState());
        order.nextState();
        System.out.println(order.getState());
        order.nextState();
        System.out.println(order.getState());
        order.nextState();
        System.out.println(order.getState());
    }
}
