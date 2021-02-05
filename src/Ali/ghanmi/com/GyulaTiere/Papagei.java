package Ali.ghanmi.com.GyulaTiere;

public class Papagei extends Tier{
    public Papagei(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Papagei " + name + " fliegt herum.";
    }
}
