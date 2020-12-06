package Marcella.Company2;

import java.util.Vector;

public class Departement {

    private String nameDepartement;
    private String nameManager;
    private Vector<Employees> currentEmployees;
    private Departement parentDepartement;
    private Vector<Departement> childDepartement;

    public Departement(String nameManager, String nameDepartement, Departement parentDepartement) {
        this.nameManager = nameManager;
        this.nameDepartement = nameDepartement;
        this.parentDepartement = parentDepartement;
        childDepartement = new Vector<>();
        if (parentDepartement != null){
            parentDepartement.childDepartement.add(this);
        }
        currentEmployees = new Vector<>();
    }

    public Departement(String nameManager, String nameDepartement) {
        this(nameManager, nameDepartement, null);
    }

    public Vector<Employees> addCurrentEmployees(Employees E) {
        if (E.getDepartementEmployee() == this) {
            currentEmployees.add(E);
        }
        return currentEmployees;
    }

    public Vector<Employees> removeCurrentEmployees(Employees E) {
            currentEmployees.remove(E);
        return currentEmployees;
    }

    public void printOrganisation(String prefix){
        System.out.println(prefix + "_ " + nameDepartement + ", " + nameManager);
        for (int i = 0; i < currentEmployees.size(); i++) {
            System.out.println(prefix + "* " + currentEmployees.get(i));
        }
        for (int i = 0; i < childDepartement.size(); i++) {
            childDepartement.get(i).printOrganisation("    " + prefix);
        }
    }

    public void connectToDepartment(Departement parent){
        if (parentDepartement != null) {
            System.out.println(nameDepartement + " ist schon eine Unterabeitlung von " + parentDepartement.nameDepartement);
        } else {
            parentDepartement = parent;
            parent.childDepartement.add(this);
        }
    }

}
