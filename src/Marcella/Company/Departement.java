package Marcella.Company;

public class Departement {

    private String nameManager;
    private String nameDepartement;
    private Departement parentDepartement;

    public Departement(String nameManager, String nameDepartement, Departement parentDepartement) {
        this.nameManager = nameManager;
        this.nameDepartement = nameDepartement;
        this.parentDepartement = parentDepartement;
    }

    public Departement(String nameManager, String nameDepartement) {
        this.nameManager = nameManager;
        this.nameDepartement = nameDepartement;
        this.parentDepartement = null;
    }

    @Override
    public String toString() {
        return "_ " + nameDepartement + ", " + nameManager + "toString";
    }

    public void printOrganisation(String prefix){
        if (parentDepartement != null) {
            parentDepartement.printOrganisation("   " + prefix);
        }
        System.out.println(prefix + "_ " + nameDepartement + ", " + nameManager);
    }

}

