package bg.tu_varna.sit.a1.f21621551.states;

import bg.tu_varna.sit.a1.f21621551.visited.Order;

public class OrderPreperation implements State{

    @Override
    public String getCurrentState(Order order) {
        return "Your order is being prepared!";
    }

    @Override
    public void next(Order order) throws Exception {
        order.setState(new OrderSending());
    }

    @Override
    public void previous(Order order) throws Exception {
        order.setState(new OrderReceived());
        
    }
    
    
}
