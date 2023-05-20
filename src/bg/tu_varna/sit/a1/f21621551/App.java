package bg.tu_varna.sit.a1.f21621551;

import bg.tu_varna.sit.a1.f21621551.chain.ChocolateIceCreamChain;
import bg.tu_varna.sit.a1.f21621551.chain.CreamIceCreamChain;
import bg.tu_varna.sit.a1.f21621551.chain.IceCreamChain;
import bg.tu_varna.sit.a1.f21621551.chain.MelonIceCreamChain;
import bg.tu_varna.sit.a1.f21621551.chain.VanillaIcecCreamChain;
import bg.tu_varna.sit.a1.f21621551.command.AddBall;
import bg.tu_varna.sit.a1.f21621551.command.AddNext;
import bg.tu_varna.sit.a1.f21621551.command.IceCreamMaker;
import bg.tu_varna.sit.a1.f21621551.icecream.ConeTypes;
import bg.tu_varna.sit.a1.f21621551.icecream.IceCreamCone;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Използвайте Chain of Responsibility и Command моделите, за да съставите програма за създавае на сладолед.
        Подават се списък с команди за добавяне на топки сладолед, Ванилия, Шоколад, Пъпеш, Сметана,
        командите се подават към потока за съставяне на сладолед, всяка стъпка добавя вида сладолед, за който отговаря,
        към фунийка или предава фунийката към следващия етап.
        В края на потока се връща фунийка с избраните топки сладолед
        */
        IceCreamMaker maker = new IceCreamMaker();
        IceCreamCone chocolate = new IceCreamCone(ConeTypes.DARK_CHOCOLATE);
        IceCreamChain c1 = new VanillaIcecCreamChain();
        IceCreamChain c2 = new ChocolateIceCreamChain();
        IceCreamChain c3 = new MelonIceCreamChain();
        maker.addCommand(new AddNext(c2, c1));
        maker.addCommand(new AddNext(c3, c2));
        maker.addCommand(new AddBall(chocolate,c1));
        maker.execute();
        System.out.println(chocolate.toString());
        
        chocolate = new IceCreamCone(ConeTypes.NORMAL);
        c1 = new CreamIceCreamChain();
        c2 = new ChocolateIceCreamChain();
        c3 = new CreamIceCreamChain();
        maker.addCommand(new AddNext(c2, c1));
        maker.addCommand(new AddNext(c3, c2));
        maker.addCommand(new AddBall(chocolate,c1));
        maker.execute();
        System.out.println(chocolate.toString());
        
    }
}
