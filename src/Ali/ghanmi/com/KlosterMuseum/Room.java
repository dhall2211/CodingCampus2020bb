package Ali.ghanmi.com.KlosterMuseum;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Vector;

public class Room {
    private int roomNumber;
    private Vector<Painting> paintings;
    private Vector<Visitor> visitors;

    public int getRoomNumber() {
        return roomNumber;
    }

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.paintings = new Vector<>();
        this.visitors =new Vector<>();


    }
    public void addPainting(Painting p) {
        paintings.add(p);
    }
    @Override
    public String toString() {
        return "\nRoom: " + roomNumber +""+ paintings+ "\n";
    }


    public void addRommToVisitor(Vector<Visitor> V){
        for (Visitor oneVisitor: visitors) {
            visitors.add(oneVisitor);

    }
    }


    public void addVisitorToRoom(Visitor visitor) {
        visitors.add(visitor);
    }
}
