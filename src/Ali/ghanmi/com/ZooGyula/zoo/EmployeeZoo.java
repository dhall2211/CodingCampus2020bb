package Ali.ghanmi.com.ZooGyula.zoo;

import Ali.ghanmi.com.OOP_Zoo.Animal;

import java.util.Vector;

public class EmployeeZoo {
    private String name;
    private Tier tier;
    private Vector<Gehege> gehegeList;


    public EmployeeZoo(Zoo zoo, String name, Tier tier, String[] gehege) {
        this.name = name;
        this.tier = tier;
        gehegeList = new Vector<>();
        for (String gehegename : gehege) {
            Gehege gehegezoo = zoo.searchAndCreateGehege(gehegename);
            gehegeList.add(gehegezoo);
        }


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printStruktur(String prefix) {
        for (Gehege gehege : gehegeList) {
            System.out.println(prefix + gehege.getName());
            System.out.println("    -"+ "Pfleger: "+ name + ", Liebligstier: " + tier.getName());

        }

    }
}

