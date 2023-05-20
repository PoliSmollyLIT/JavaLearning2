package bg.tu_varna.sit.a1.f21621551.chain;

import bg.tu_varna.sit.a1.f21621551.icecream.IceCreamCone;
import bg.tu_varna.sit.a1.f21621551.icecream.IceCreamFlavours;

public class ChocolateIceCreamChain implements IceCreamChain{
    private IceCreamChain chain;

    @Override
    public void addIceCreamBall(IceCreamCone cone) {
               cone.addBall(IceCreamFlavours.CHOCOLATE);
               if(this.chain!=null){
                this.chain.addIceCreamBall(cone);
               }       
    }

    @Override
    public void setNextStep(IceCreamChain next) {
        this.chain=next;        
    }
    
}