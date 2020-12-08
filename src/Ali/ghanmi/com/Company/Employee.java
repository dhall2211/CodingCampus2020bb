package Ali.ghanmi.com.Company;

public class Employee {
    private String name;
    private Departement aktuellDepartment;

    public Employee(String name, Departement aktuellDepartment) {
        this.name = name;
        this.aktuellDepartment = aktuellDepartment;
        aktuellDepartment.SetNewEmployee(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departement getAktuellDepartment() {
        return aktuellDepartment;
    }

    public void setAktuellDepartment(Departement aktuellDepartment) {
        this.aktuellDepartment = aktuellDepartment;
    }
}
