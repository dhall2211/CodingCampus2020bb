package Ali.ghanmi.com.kinderGarten;

public class Fisch extends Tiere{
    public Fisch(String name) {
        super(name);
    }

    @Override
    public void printSimulation() {
        System.out.println("Fisch: "+name+" Macht nicht");
    }
}
