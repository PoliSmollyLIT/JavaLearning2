package bg.tu_varna.sit.a1.f21621551.states;

import bg.tu_varna.sit.a1.f21621551.visited.Order;

public interface State {
    void previous(Order order) throws Exception;
    void next(Order order) throws Exception;
    String getCurrentState(Order order);    
}