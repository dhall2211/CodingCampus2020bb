package Ali.ghanmi.com.kinderGarten;

public class KinderGäertner extends Person {
    public KinderGäertner(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void printSimulation() {
        System.out.println("kindergärtner: "+ name+" Passt auf dem kind ");
    }
}
