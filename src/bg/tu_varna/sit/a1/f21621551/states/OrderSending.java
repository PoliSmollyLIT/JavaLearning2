package bg.tu_varna.sit.a1.f21621551.states;

import bg.tu_varna.sit.a1.f21621551.visited.Order;

public class OrderSending implements State{

    @Override
    public String getCurrentState(Order order) {
        return "Your order has been sent!";
    }

    @Override
    public void next(Order order) throws Exception {
       throw new Exception("There is no more info for your order!");
    }

    @Override
    public void previous(Order order) throws Exception {
       order.setState(new OrderPreperation());
        
    }
    
    
}
