package Marcella.Museum;

import Gyula.oop.MultiInterfaces.Buchstabe;
import Gyula.oop.MultiInterfaces.IPrintStructure;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Museum elisabeth = new Museum("St. Elisabeth", 9.0, 17.0, 16.0);

        Room raum1 = new Room(elisabeth, "Raum 1");
        Room raum2 = new Room(elisabeth, "Raum 2");
        Room raum3 = new Room(elisabeth, "Raum 3");
        Room raum4 = new Room(elisabeth, "Raum 4");

        Curator lucia = new Curator("Lucia");
        elisabeth.setCurator(lucia);

        Guard benedikt = new Guard("Benedikt", raum1);
        Guard georg = new Guard("Georg", raum1);
        elisabeth.addGuard(benedikt);
        elisabeth.addGuard(georg);

        elisabeth.addArtToRoom(2);

        System.out.println(elisabeth);

        // Simultation every 15 minutes (while elisabeth.get isOpen)===================================================
        // for i < openinghours / 4, ++
        // elisabeth.runSimultation:
        // createVisitors/Thiefs(boolean isThief), Visitors/Tiefs/Guards: moveToStartingRoom
        // Guards: changeRoom / Visitor: changeRoom,lookAtArt,leaveMuseum / Tiefs: changeRoom,lookAtArt,stealArt,leaveMuseum
        // Curator: collect, buyArt (if enough money: create and put in room)
        // isOpen = false: Visitors/Thiefs removeAll

        while (elisabeth.isOpen()) {
            elisabeth.runSimultation();
        }

        Vector<IPrintStructure> toPrint = new Vector<>();
        toPrint.add(elisabeth);
        toPrint.add(raum1);
        toPrint.add(new Art());

        for (IPrintStructure p: toPrint) {
            p.printStructure();
        }


    }

}
