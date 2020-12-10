package Sabrina.zoo;

public class Zoo {
 private String name;

    public Zoo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "The name of our Zoo is "
                + name + ".";
    }
}
