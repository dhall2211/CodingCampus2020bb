package Marcella.Company2;

public class Employee {

    private String nameEmployee;
    private String departementEmployee;

    public Employee(String nameEmployee, String departementEmployee) {
        this.nameEmployee = nameEmployee;
        this.departementEmployee = departementEmployee;
    }

    @Override
    public String toString() {
        return nameEmployee + ", " + departementEmployee;
    }

    public String getDepartementEmployee() {
        return departementEmployee;
    }
}
