package Ali.ghanmi.com.kinderGarten;

import java.util.Random;
import java.util.Vector;

public class Katze extends Tiere {
    private Random random = new Random();

    public Katze(String name) {
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
        System.out.println(name + " begegnet " + friend.getName()+" und Es macht ihn Glücklich");
    }


    @Override
    public String getName() {
        return name;
    }
}
