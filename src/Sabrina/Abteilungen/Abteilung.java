package Sabrina.Abteilungen;

import java.util.Vector;

public class Abteilung {
    private String name;
    private String manager;

    private Abteilung parentAbteilung;
    private Vector<Abteilung> childDepartement;

    public Abteilung(String name, String manager, Abteilung parentAbteilung) {
        this.name = name;
        this.manager = manager;
        this.parentAbteilung = parentAbteilung;
        childDepartement = new Vector<>();

        if (parentAbteilung != null) {
            parentAbteilung.childDepartement.add(this);
        }
    }

    @Override
    public String toString() {
        return "_ " + name + ", " + manager + " toString";
    }

    public void printOrganisation(String prefix) {
        System.out.println(prefix + "_ " + name + ", " + manager);
        for (int i = 0; i < childDepartement.size(); i++) {
            childDepartement.get(i).printOrganisation("    " + prefix);
        }
    }
}







