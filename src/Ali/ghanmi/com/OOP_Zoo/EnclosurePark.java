package Ali.ghanmi.com.OOP_Zoo;

import java.util.Vector;

public class EnclosurePark {
    private String name;
    private int creation;
    private int seiz;
    private int maxCapacity;
    private EnclosurePark zooSector;
    private Zoo zoo;
    private Vector<EnclosurePark> enclosure;

    public EnclosurePark(String name, int creation, int seiz, int maxCapacity, EnclosurePark zooSector, Zoo zoo) {
        this.name = name;
        this.creation = creation;
        this.seiz = seiz;
        this.maxCapacity = maxCapacity;
        this.zoo = zoo;
        this.zooSector = zooSector;
        this.enclosure = new Vector<>();

        if (zooSector != null) {
            zooSector.enclosure.add(this);

        }
    }

    public EnclosurePark(String name, int creation, int seiz, int maxCapacity) {
        this(name, creation, seiz, maxCapacity, null, null);
    }

    public void addRemoveSector(EnclosurePark sector) {
        if (zooSector != null) {
            System.out.println(enclosure + " ist schon eine Unterabeitlung von " + zooSector.enclosure);
            zooSector.enclosure.remove(this);
        }
        zooSector = sector;
        sector.enclosure.add(this);
    }

   @Override
      public String toString() { return "Enclosure:" + name + "BauJahr: " + creation + "Fläche: " + seiz + "m3" + "Maximal tiere anzahl: " + maxCapacity +
    "Sector: " + zooSector + ", enclosure: " + enclosure + "Einrichtung: " + zoo;}


    public void printZooPlan(String prefix) {
        System.out.println(prefix + "" + name + " BauJahr: " + creation + ", Fläche: " + seiz + " m3," + " Maximal tiere anzahl: " + maxCapacity +
                ", Sector: " + zooSector + ", enclosure=" + enclosure + " " + zoo);
        for (int i = 0; i < enclosure.size(); i++) {
            enclosure.get(i).printZooPlan("    " + prefix);
        }
    }

    public Vector<EnclosurePark> getEnclosure() {
        return enclosure;
    }
}