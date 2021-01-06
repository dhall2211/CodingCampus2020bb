package Marcella.Zoo2;

public class Vet {

    private String name;

    public Vet(Zoo zoo, String name) {
        this.name = name;
        zoo.addNewVet(this);
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + "Tierärztin: " + name);
    }

}
