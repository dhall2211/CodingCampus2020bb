package Irene.company;

import java.util.Vector;

public class Departement {
    private String nameManager;
    private String nameDepartement;
    private Departement parentDepartement;
    private Vector<Departement> childDepartement;
    private Vector<Departement> persons;

    public Departement(String nameManager, String nameDepartement, Irene.company.Departement parentDepartement) {
        this.nameManager = nameManager;
        this.nameDepartement = nameDepartement;
        this.parentDepartement = parentDepartement;
        childDepartement = new Vector<>();
        persons = new Vector<>();

        if (parentDepartement != null) {
            parentDepartement.childDepartement.add(this);
        }
    }

    public Departement(String nameManager, String nameDepartement) {
        this(nameManager, nameDepartement, null);
    }

    public void connectToDepartment(Departement parent){
        if (parentDepartement != null) {
            System.out.println(nameDepartement + " ist schon eine Unterabeitlung von " + parentDepartement.nameDepartement);
        } else {
            parentDepartement = parent;
            parent.childDepartement.add(this);
        }
    }

    @Override
    public String toString() {
        return "_ " + nameDepartement + ", " + nameManager + "toString";
    }

    public void printCompanyOrganisation(String prefix) {
        System.out.println(prefix + "_ " + nameDepartement + ", " + nameManager);
        for (int i = 0; i < childDepartement.size(); i++) {
            childDepartement.get(i).printCompanyOrganisation("    " + prefix);
        }
    }
}
