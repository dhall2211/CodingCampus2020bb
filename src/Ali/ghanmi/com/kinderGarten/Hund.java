package Ali.ghanmi.com.kinderGarten;

import java.util.Random;
import java.util.Vector;

public class Hund extends Tiere {
    private Random random = new Random();


    public Hund(String name) {
        super(name);
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
            System.out.println(name + " begegnet " + friend.getName()+" und erschrekt ihn");
    }

    @Override
    public String getName() {
        return name;
    }
}