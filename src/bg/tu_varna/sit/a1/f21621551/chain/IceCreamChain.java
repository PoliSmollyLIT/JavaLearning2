package bg.tu_varna.sit.a1.f21621551.chain;

import bg.tu_varna.sit.a1.f21621551.icecream.IceCreamCone;

public interface IceCreamChain {
        void addIceCreamBall(IceCreamCone cone);
        void setNextStep(IceCreamChain next);
}