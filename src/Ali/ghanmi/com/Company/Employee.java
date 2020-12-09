package Ali.ghanmi.com.Company;

public class Employee {
    private String name;
    private Departement aktuellDepartment;

    public Employee(String name, Departement aktuellDepartment) {
        this.name = name;
        this.aktuellDepartment = aktuellDepartment;

        if (aktuellDepartment != null) {
            aktuellDepartment.addCurrentEmployee(this);

        }
    }
        public void quit () {
            aktuellDepartment.removeCurrentEmployee(this);
            aktuellDepartment = null;
        }


        public void switchDepartment(Departement newDepartement) {
            aktuellDepartment.removeCurrentEmployee(this);
            if (newDepartement != null){
                newDepartement.addCurrentEmployee(this);
            }
        }

    @Override
    public String toString() {
        return name;
    }
}


