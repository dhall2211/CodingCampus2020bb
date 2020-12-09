package Irene.company;

import java.util.ArrayList;
import java.util.Vector;

public class Departement {
    private String manager;
    private String departement;
    private Departement parentDepartement;
    private Vector<Departement> childDepartement;
    private ArrayList employees;

    public Departement(String manager, String departement, Departement parentDepartement, ArrayList employees) {
        this.manager = manager;
        this.departement = departement;
        this.parentDepartement = parentDepartement;
        childDepartement = new Vector<>();
        this.employees = new ArrayList<>();

        if (parentDepartement != null) {
            parentDepartement.childDepartement.add(this);
        }

        if (employees != null) {
            for (Object employee : employees) {
                this.employees.add(employee);
            }
        }
    }

    public Departement(String manager, String departement) {
        this(manager, departement, null, null);
    }

    public Departement(String manager, String departement, Departement parentDepartement) {
        this(manager, departement, parentDepartement, null);
    }

    public void connectToDepartment(Departement parentDepartement) {
        if (parentDepartement != null) {
            System.out.println(departement + " is already a subdepartement of " + parentDepartement.departement);
            System.out.println();
        } else {
            parentDepartement = parentDepartement;
            parentDepartement.childDepartement.add(this);
        }
    }

    public void switchEmployees(String employee, Departement newDepartment) {
        this.employees.remove(employee);
        newDepartment.employees.add(employee);
    }

    public void switchDepartment(Departement department) {
        if (parentDepartement != null) {
            parentDepartement.childDepartement.remove(this);
        }
        parentDepartement = department;
        department.childDepartement.add(this);
    }

    public void removeDepartment() {
        if (parentDepartement != null) {
            parentDepartement.childDepartement.remove(this);
        }
        parentDepartement = null;
    }

    @Override
    public String toString() {
        return "_ " + departement + ", " + manager + ", " + employees.toString();
    }

    public void printCompanyOrganisation(String prefix) {
        System.out.println(prefix + "_ " + departement + ", " + manager + ", " + employees.toString());
        for (int i = 0; i < childDepartement.size(); i++) {
            childDepartement.get(i).printCompanyOrganisation("    " + prefix);
        }
    }
}
