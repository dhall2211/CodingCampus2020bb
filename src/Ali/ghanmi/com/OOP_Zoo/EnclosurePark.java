package Ali.ghanmi.com.OOP_Zoo;

import java.util.Vector;

public class EnclosurePark {
    private String name;
    private int creation;
    private int size;
    private int maxCapacity;
    private Zoo zoo;
    //private EnclosurePark zooSector;
  //  private Vector<EnclosurePark> enclosure;

    public EnclosurePark(String name, int creation, int size, int maxCapacity, Zoo zoo) {
        this.name = name;
        this.creation = creation;
        this.size = size;
        this.maxCapacity = maxCapacity;
        this.zoo = zoo;
       // this.zooSector=zooSector;
       zoo.addEnclosure(this);



        }


    public EnclosurePark(String name, int creation, int size, int maxCapacity) {
        this(name, creation, size, maxCapacity, null);
    }

/*


   @Override
      public String toString() { return "Enclosure:" + name + "BauJahr: "
           + creation + "Fläche: " + size + "m3" + "Maximal tiere anzahl: "
           + maxCapacity + " Einrichtung: " + zoo;}



 */

    public void printZooPlan(String prefix) {
        System.out.println(prefix + zoo +", Sectror: "+ name + " BauJahr: " + creation
                + ", Fläche: " + size + " m3," + " Maximal tiere anzahl: " + maxCapacity );

        }
}