package Irene.zoo2ndchance;

public class Vet {
    private String vetName;

    public Vet(String vetName) {
        this.vetName = vetName;
    }

    public String getVetName() {
        return vetName;
    }

    public void printStructureVet(String prefix) {
        System.out.println(prefix + vetName);
    }
}
