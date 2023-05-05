package bg.tu_varna.sit.a1.f21621551.visitor;

import bg.tu_varna.sit.a1.f21621551.visited.BoardGames;
import bg.tu_varna.sit.a1.f21621551.visited.Books;
import bg.tu_varna.sit.a1.f21621551.visited.Toys;

public class VisitorImpl implements Visitor{
    private double orderPrice = 0.0;

    @Override
    public void visit(Books product) {
        //product.accept(this); 
        orderPrice += product.getPrice();
    }

    @Override
    public void visit(Toys product) {
        //product.accept(this); 
        orderPrice += product.getPrice();
    }

    @Override
    public void visit(BoardGames product) {
        //product.accept(this);
        orderPrice += product.getPrice();
    }

    private double getOrderPrice() {
        return orderPrice;
    }
    
    public String getOrderInfo(){
        return "Your purchases cost: " + String.format("%.2f", getOrderPrice());
    }
    
}