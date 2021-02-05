package Ali.ghanmi.com.kinderGarten;

public class Kind extends Person {

    public Kind(String name) {
        super(name);
    }

    @Override
    public void printSimulation() {
        System.out.println("kind: "+name+" ist glücklich");
        System.out.println("kind: "+name+" ist nicht glücklich");
    }
}
