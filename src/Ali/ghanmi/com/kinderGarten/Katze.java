package Ali.ghanmi.com.kinderGarten;

public class Katze extends Tiere implements ISimulation{
    public Katze(String name) {
        super(name);
    }

    @Override
    public void printSimulation() {
        System.out.println("katze: " +name+" springt hin und her");
    }
}
