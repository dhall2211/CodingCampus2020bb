package Ali.ghanmi.com.Kolster.KlosterMuseum;

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
        this.visitors = new Vector<>();


    }

    public void addPainting(Painting p) {
        paintings.add(p);
    }

    @Override
    public String toString() {
        return "\nRoom: " + roomNumber + "" + paintings + " " + visitors + "\n";
    }

/*
    public void addVisitorToRoom(Vector<Visitor> visitor) {
        for (Visitor onevisitor : visitors) {
            Random random = new Random();
            onevisitor = random.next();
            visitors.add(onevisitor);
        }

 */
    }
