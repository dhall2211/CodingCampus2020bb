package Ali.ghanmi.com.oop.InterfaceNachbesprechung;

public class Dish implements IWashable {
    private String origin;

    public Dish(String origin){
        this.origin = origin;
    }

    @Override
    public void wash() {
        System.out.println(origin + " has been washed.");
    }

    public void sell(){
        System.out.println(origin + " has been sold.");
    }
}
