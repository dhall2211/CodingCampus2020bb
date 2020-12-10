package Ali.ghanmi.com.Company3.Company;

import java.util.Vector;

public class EmplyeesDepartmentManagment {
    Employee employeeS;
    Departement departements;
    private Vector<Departement> childDepartement;
    private Vector<Employee> employees;
    private Vector<EmplyeesDepartmentManagment> list;

    public EmplyeesDepartmentManagment(Employee employeeS, Departement departements) {
        this.employeeS = employeeS;
        this.departements = departements;
        employees=new Vector<>();
        childDepartement=new Vector<>();
        list= new Vector<>();

        if(departements !=null){

        }
    }

    @Override
    public String toString() {
        return employeeS + " " + departements;
    }
}