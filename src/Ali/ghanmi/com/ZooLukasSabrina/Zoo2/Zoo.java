package Ali.ghanmi.com.ZooLukasSabrina.Zoo2;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<Enclosure> enclosures;
    private Vector<Zookeeper> zookeepers;
    private Vector<Veterinary> veterinaries;

    public Zoo(String name) {
        this.name = name;
        this.enclosures = new Vector<>();
        this.zookeepers = new Vector<>();
        this.veterinaries = new Vector<>();
    }

    public void feedAnimals() {
        for (int i = 0; i<zookeepers.size(); i++) {
          zookeepers.get(i).feedAnimals();
            System.out.println(zookeepers.get(i).getName());
        }
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + name);
        for (Enclosure enclosure : enclosures) {
            enclosure.printStructure(prefix + "--");

       }
        for (Zookeeper zookeeper : zookeepers) {
            zookeeper.printStructure(prefix + "--");
        }
        for (Veterinary veterinary : veterinaries){
            veterinary.printStructure( prefix + "--");
        }

        }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void addZookeeper(Zookeeper zookeeper){
        zookeepers.add(zookeeper);
    }

    public void addVeterinary(Veterinary veterinary) {
        veterinaries.add(veterinary);
    }
}

