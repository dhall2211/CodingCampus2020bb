package Ali.ghanmi.com.kinderGarten;

import java.util.Random;
import java.util.Vector;

public class KinderGäertner extends Person {
    private Random random = new Random();

    public KinderGäertner(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void printSimulation(Vector<ISimulation> friends) {
        ISimulation myFriend = friends.get(random.nextInt(friends.size()));
        if (myFriend instanceof Kind) {
            myFriend.interaction(this);
        }

    }


    @Override
    public void interaction(ISimulation friend) {
        System.out.println();
    }

    @Override
    public String getName() {
        return name;
    }

}
