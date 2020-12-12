package Ali.ghanmi.com.ZooGyula.zoo;

public class EmployeeZoo {
    private String name;
    Tier tier;


    public EmployeeZoo(String name,Tier tier) {
        this.name = name;
        this.tier= tier;

    }

    public EmployeeZoo(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printStruktur(String prefix) {
            System.out.println(prefix + name+ tier.getName());

        }
    }
