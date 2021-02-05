package Ali.ghanmi.com.kinderGarten;

public class Hund extends Tiere implements ISimulation{
    public Hund(String name) {
        super(name);
    }

    @Override
    public void printSimulation() {
        System.out.println("Hund: "+name+" Verschreckt die kinder");
    }
}
