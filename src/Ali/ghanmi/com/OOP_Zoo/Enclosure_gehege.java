package Ali.ghanmi.com.OOP_Zoo;

import Gyula.Company.Departement;

import java.util.Vector;

public class Enclosure_gehege {
    private String name;
    private int creation;
    private int seiz;
    private int maxCapacity;
    private Enclosure_gehege zooSector;
    private Zoo zoo;
    private Vector<Enclosure_gehege> enclosure;

    public Enclosure_gehege(String name, int creation, int seiz, int maxCapacity, Enclosure_gehege zooSector, Zoo zoo) {
        this.name = name;
        this.creation = creation;
        this.seiz = seiz;
        this.maxCapacity = maxCapacity;
        this.zoo = zoo;
        this.zooSector= zooSector;
        this.enclosure = new Vector<>();

        if (zooSector != null) {
            zooSector.enclosure.add(this);

        }
    }

    public Enclosure_gehege(String name, int creation, int seiz,int maxCapacity) {
        this(name,creation,seiz,maxCapacity,null,null);
    }

    public void addRemoveSector(Enclosure_gehege sector){
            if (zooSector != null) {
                System.out.println(enclosure + " ist schon eine Unterabeitlung von " + zooSector.enclosure);
                zooSector.enclosure.remove(this);
            }
            zooSector = sector;
            sector.enclosure.add(this);
        }


    }

