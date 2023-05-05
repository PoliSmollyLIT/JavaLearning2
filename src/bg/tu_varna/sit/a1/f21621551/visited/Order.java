package bg.tu_varna.sit.a1.f21621551.visited;

import java.util.ArrayList;

import bg.tu_varna.sit.a1.f21621551.states.State;
import bg.tu_varna.sit.a1.f21621551.visitor.Visitable;
import bg.tu_varna.sit.a1.f21621551.visitor.VisitorImpl;

public class Order {
    private ArrayList<Visitable> products = new ArrayList<>();
    private State state;

    public void addProduct(Visitable product){
        products.add(product);
    }

    public String getOrderInfo(){
        VisitorImpl visitor = new VisitorImpl();
        for (Visitable product : products) {
            product.accept(visitor);
        }
        return visitor.getOrderInfo();
    }
    
    public void setState(State state){
        this.state = state;
    }

    public void nextState() throws Exception{
        this.state.next(this);
    }

    public void previousState() throws Exception{
        this.state.previous(this);
    }

    public String getState() {
        return state.getCurrentState(this);
    }
    
}
