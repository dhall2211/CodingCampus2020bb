package Bokhee.Abteilung;

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

        this.childDepartement = new Vector<>();

        if (parentAbteilung != null) {
            parentAbteilung.childDepartement.add(this);
        }
    }

    public Abteilung(String name, String manager) {
        this(name,manager,null);
    }

    public void connectToDepartment(Abteilung parent) {
       //
        if (parentAbteilung != null) {
            System.out.println(name+ " ist schon eine Unterabteilung von " + parentAbteilung.name);
            parentAbteilung.childDepartement.remove(this);
        }
        parentAbteilung = parent;
        parentAbteilung.childDepartement.add(this);
        // parent.childDepartment.add(this);
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

    public void setAktuelleAbteilung(Abteilung aktuelleAbteilung) {
       aktuelleAbteilung = aktuelleAbteilung;
    }
}







