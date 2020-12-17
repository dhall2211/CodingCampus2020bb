package Eric.zoo_simple;

public class Veterinary {
    // attributes
    private String name;

    // constructor
    public Veterinary(String name) {
        this.name = name;
    }

    // getter / setter
    public String getName() {
        return name;
    }

    // methods
    public void printStruktur(String prefix) {
        System.out.println(prefix + this.name);
    }
}
