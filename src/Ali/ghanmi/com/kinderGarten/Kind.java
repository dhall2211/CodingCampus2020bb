package Ali.ghanmi.com.kinderGarten;

import java.util.Random;
import java.util.Vector;


public class Kind extends Person {
    private Random random = new Random();

    public Kind(String name) {
        super(name);
    }

    @Override
    public void printSimulation(Vector<ISimulation> friends) {
        ISimulation myFriend = friends.get(random.nextInt(friends.size()));
        if (myFriend instanceof Kind) {
            myFriend.interaction(this);
        }
//        System.out.println("kind: " + name + " ist glücklich");
//        System.out.println("kind: " + name + " ist nicht glücklich");
    }

    @Override
    public void interaction(ISimulation friend) {
        System.out.println(name + " begegnet " + friend.getName());
    }

    @Override
    public String getName() {
        return name;
    }
}