package bg.tu_varna.sit.a1.f21621551.command;

import bg.tu_varna.sit.a1.f21621551.chain.IceCreamChain;

public class AddNext implements Commands{
    private IceCreamChain chain;
    private IceCreamChain chainPrevious;
       

    public AddNext(IceCreamChain chain, IceCreamChain chainPrevious) {
        this.chain = chain;
        this.chainPrevious = chainPrevious;
    }

    @Override
    public void execute() {
        chainPrevious.setNextStep(chain);
        
    }
    
    
}