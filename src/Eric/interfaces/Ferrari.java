package Eric.interfaces;

public class Ferrari implements ICar {

    @Override
    public void start() {
        System.out.println("Ferrari starts");
    }

    @Override
    public void run() {
        System.out.println("Ferrari is driving");
    }

    @Override
    public void stop() {
        System.out.println("Ferrari stops");
    }
}
