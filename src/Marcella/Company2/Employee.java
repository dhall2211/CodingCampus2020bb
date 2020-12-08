package Marcella.Company2;

public class Employee {

    private String nameEmployee;
    private Departement departementEmployee;

    public Employee(String nameEmployee, Departement departementEmployee) {
        this.nameEmployee = nameEmployee;
        this.departementEmployee = departementEmployee;
        if (departementEmployee != null){
            departementEmployee.addCurrentEmployee(this);
        }
    }

    @Override
    public String toString() {
        return nameEmployee;
    }

    public void quit() {
        departementEmployee.removeCurrentEmployee(this);
        departementEmployee = null;
    }

    public void switchDepartment(Departement newDepartement) {
        departementEmployee.removeCurrentEmployee(this);
        if (newDepartement != null){
            newDepartement.addCurrentEmployee(this);
        }
    }

}
