package Ali.ghanmi.com.Company3.Company;


public class Departement {


    private String nameDepartement;
    private Departement parentDepartement;

    public Departement(String nameDepartement, Departement parentDepartement) {
        this.nameDepartement = nameDepartement;
        this.parentDepartement = parentDepartement;

    }

    public Departement(String nameDepartement) {
        this.nameDepartement = nameDepartement;
    }

    @Override
    public String toString() {
        return "Departement " + nameDepartement + " " + parentDepartement;
    }
    }
