package Ali.ghanmi.com.Company3.Company;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name= name;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }
/*
    public Employee(String name) {
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


 */
    @Override
    public String toString() {
        return name;
    }
}


