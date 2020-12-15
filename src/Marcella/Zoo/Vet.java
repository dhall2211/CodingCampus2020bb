package Marcella.Zoo;

public class Vet {
    private String name;

    public Vet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printStruktur(String prefix) {
        System.out.println(prefix + this.name);
    }
}
