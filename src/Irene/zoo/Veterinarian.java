package Irene.zoo;

public class Veterinarian {
    private String vetName;

    public Veterinarian(String vetName) {
        this.vetName = vetName;
    }

    public String getVetName() {
        return vetName;
    }

    public void printStructureVeterinarian(String prefix) {
        System.out.println(prefix + this.vetName);
    }
}
