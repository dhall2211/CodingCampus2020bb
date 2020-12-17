package Sabrina.Zoo2;

public class Veterinary {
    private String name;

    public Veterinary(String name, Zoo zoo){
        this.name = name;
        zoo.addVeterinary(this);
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + "Tierarzt: " + name);
    }
}
