package Ali.ghanmi.com.OOP_Zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<EnclosurePark> enclosureParks;

    public Zoo(String name) {
        this.name=name;
        this.enclosureParks = new Vector<>();

    }
public  void addEnclosure(EnclosurePark sector){
        enclosureParks.add(sector);
}

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Regional: "+ name;
    }
    public void printZoo(String prefix){
        System.out.println(prefix + " " + name);
        for (int i = 0; i <enclosureParks.size() ; i++) {
            enclosureParks.get(i).printZooPlan("*");

        }

    }
}