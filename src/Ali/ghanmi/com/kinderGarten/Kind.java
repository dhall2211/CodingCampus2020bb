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
        boolean isGlücklich;
        isGlücklich = false;
        ISimulation myFriend = friends.get(random.nextInt(friends.size()));
        if (myFriend instanceof Kind) {
            myFriend.interaction(this);
            isGlücklich =true;
        }
        if(myFriend instanceof Hund){
            myFriend.interaction(this);
        }if
            (myFriend instanceof Katze){
            myFriend.interaction(this);
            isGlücklich =true;

        }
       //System.out.println("kind: " + name + " ist glücklich");
      // System.out.println("kind: " + name + " ist nicht glücklich");

    }


    @Override
    public void interaction(ISimulation friend) {
        if (friend instanceof Kind) {
            System.out.println(name + " begegnet sein mitschüler " + friend.getName() + " und Spielen glücklich zusammen");
        }
        if (friend instanceof Hund) {
            System.out.println(name + " begegnet das Hund " + friend.getName() + " und ist erschrekt");
        }
        if (friend instanceof Katze) {
            System.out.println(name + " begegnet die Katze " + friend.getName() + " und Es macht ihn Glücklich");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}