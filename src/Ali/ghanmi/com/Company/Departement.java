package Ali.ghanmi.com.Company;

import java.util.Vector;

public class Departement {

    private String nameManager;
    private String nameDepartement;
    private Departement parentDepartement;
    private Vector<Departement> childDepartement;
    private Vector<Employee> employees;

    public Departement(String nameManager, String nameDepartement, Departement parentDepartement) {
        this.nameManager = nameManager;
        this.nameDepartement = nameDepartement;
        this.parentDepartement = parentDepartement;
        employees = new Vector<>();
        childDepartement = new Vector<>();

        if (parentDepartement != null) {
            parentDepartement.childDepartement.add(this);
        }
    }

    public Departement(String nameManager, String nameDepartement) {
        this(nameManager, nameDepartement, null);
    }

    public void connectToDepartment(Departement parent) {
        if (parentDepartement != null) {
            System.out.println(nameDepartement + " ist schon eine Unterabeitlung von " + parentDepartement.nameDepartement);
        } else {
            parentDepartement = parent;
            parent.childDepartement.add(this);
        }
    }


    public void addCurrentEmployee(Employee mitarbeiter) {
        employees.add(mitarbeiter);
    }

    public void removeCurrentEmployee(Employee mitarbeiter) {
        employees.remove(mitarbeiter);
    }


    public void printOrganisation(String prefix) {
        System.out.println(prefix + "_ " + nameDepartement + ", " + nameManager);
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(prefix + "* " + employees.get(i));
        }
        for (int i = 0; i < childDepartement.size(); i++) {
            childDepartement.get(i).printOrganisation("  "+prefix);
        }
    }

}

