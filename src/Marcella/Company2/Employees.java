package Marcella.Company2;

public class Employees {

    private String nameEmployee;
    private Departement departementEmployee;

    public Employees(String nameEmployee, Departement departementEmployee) {
        this.nameEmployee = nameEmployee;
        this.departementEmployee = departementEmployee;
    }

    @Override
    public String toString() {
        return nameEmployee + ", " + departementEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public Departement getDepartementEmployee() {
        return departementEmployee;
    }
}
