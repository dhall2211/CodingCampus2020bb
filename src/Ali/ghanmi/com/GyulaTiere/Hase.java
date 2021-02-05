package Ali.ghanmi.com.GyulaTiere;

public class Hase extends Tier {
    public Hase(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Hase " + name + " frisst Karotten und deine Bücher.";
    }
}
