package Marcella.Zoo;

public class Enclosure {

    private String name;
    private Zoo zoo;

    public Enclosure(String name, Zoo zoo) {
        this.name = name;
        this.zoo = zoo;
        if (zoo != null) {
            zoo.addEnclosure(this);
        }
    }

    @Override
    public String toString() {
        return name;
    }

}
