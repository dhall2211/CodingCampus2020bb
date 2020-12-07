package Ali.ghanmi.com.OOP_Zoo;

public class Zoo {
    private String name;

    public Zoo(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Regional: "+ name;
    }
    public void printZoo(String prefix){
        System.out.println(prefix + " " + name);

    }
}