package bg.tu_varna.sit.a1.f21621551.icecream;

import java.util.ArrayList;

public class IceCreamCone {
    private ConeTypes cone;
    private ArrayList<IceCreamFlavours> balls;

    public IceCreamCone(ConeTypes cone) {
        this.cone = cone;
        balls = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Your ice cream is served in " + cone.getCone() + " cone with ");
        for (IceCreamFlavours iceCreamFlavours : balls) {
            output.append(iceCreamFlavours.getFlavour() + ", ");
        }
        output.delete(output.lastIndexOf(","), output.lastIndexOf(",")+2);
        output.append(" flavours! Enjoy you ice cream!\n");
        return output.toString();
    }
        
    public void addBall(IceCreamFlavours ball){
        balls.add(ball);
    }
}