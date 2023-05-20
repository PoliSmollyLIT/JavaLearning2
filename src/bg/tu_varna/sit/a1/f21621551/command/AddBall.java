package bg.tu_varna.sit.a1.f21621551.command;

import bg.tu_varna.sit.a1.f21621551.chain.IceCreamChain;
import bg.tu_varna.sit.a1.f21621551.icecream.IceCreamCone;

public class AddBall implements Commands{
    private IceCreamCone cone;
    private IceCreamChain chain;
    
    public AddBall(IceCreamCone cone, IceCreamChain chain) {
        this.cone = cone;
        this.chain = chain;
    }

    @Override
    public void execute() {
        chain.addIceCreamBall(cone);       
    }

}