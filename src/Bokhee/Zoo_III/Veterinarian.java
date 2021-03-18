package Bokhee.Zoo_III;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printStructure(String prefix){
        System.out.println(prefix + prefix + "  Veterinarian name is " + name);
    }
}
