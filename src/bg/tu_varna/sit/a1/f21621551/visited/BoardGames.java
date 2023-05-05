package bg.tu_varna.sit.a1.f21621551.visited;

import bg.tu_varna.sit.a1.f21621551.visitor.Visitable;
import bg.tu_varna.sit.a1.f21621551.visitor.Visitor;

public class BoardGames implements Visitable{
    private String title;
    private double price;    

    public BoardGames(String title, double price) {
        this.title = title;
        this.price = price;
    }    

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);    
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    
}
