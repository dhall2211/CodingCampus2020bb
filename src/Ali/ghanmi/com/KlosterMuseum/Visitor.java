package Ali.ghanmi.com.KlosterMuseum;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class Visitor {
    private String name;
    private String city;
    private int age;
    private Vector<Room> rooms;

    public Visitor(Object name, Object city, int age) {
        this.name = (String) name;
        this.city = (String) city;
        this.age = age;
        this.rooms = new Vector<>();

    }


    public static void addVisitor() {
        Vector<Object> vistorCity = new Vector<>();
        Vector<Object> vistorname = new Vector<>();
        Vector<Visitor> visitorEntry = new Vector<>();


        vistorname.add("peter");
        vistorname.add("paul");
        vistorname.add("piere");
        vistorname.add("pascal");
        vistorname.add("prince");
        vistorname.add("Ali");
        vistorname.add("Amir");
        vistorname.add("Jan");
        vistorname.add("Reto");

        vistorname.add("Anne");
        vistorname.add("Rita");
        vistorname.add("Eva");
        vistorname.add("Sandra");
        vistorname.add("Maria");
        vistorname.add("Brigitte");
        vistorname.add("Leo");
        vistorname.add("Lea");
        vistorname.add("Linn");

        vistorname.add("Jared");
        vistorname.add("Janne");
        vistorname.add("Hans");
        vistorname.add("Marc");
        vistorname.add("Marco");
        vistorname.add("Meli");
        vistorname.add("Mara");
        vistorname.add("Emma");
        vistorname.add("Go");

        vistorCity.add("Dornbirn");
        vistorCity.add("Bregenz");
        vistorCity.add("Lustenau");
        vistorCity.add("Feldkirch");
        vistorCity.add("Au");

        Random zufallVisitorNumber = new Random();
        int z = zufallVisitorNumber.nextInt(6);
        int visitorCounter = 0;
        while (visitorCounter < z) {
            Visitor v = new Visitor(vistorname.get(new Random().nextInt(vistorname.size()))
                    , (vistorCity.get(new Random().nextInt(vistorCity.size()))),
                    (new Random().nextInt(60) + 15));
            visitorEntry.add(v);
            visitorCounter++;
          //  moveVisitor(visitorEntry,rooms);

        }
        System.out.println(Arrays.toString(visitorEntry.toArray()) + " " + visitorCounter);
        System.out.println();
    }
   public static void moveVisitor(Vector<Visitor> visitors,Vector<Room> rooms){
    for (Visitor oneVisitor: visitors) {
        for (Room oneRoom: rooms) {
            Random random = new Random();
           oneRoom.addVisitorToRoom(oneVisitor);

        }

    }



}


    @Override
    public String toString() {
        return "Visitor: " + " name: " + name +
                ", city: " + city + ", age: " + age + "\n";
    }

}


