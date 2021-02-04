package Marcella.Museum;

import Gyula.oop.MultiInterfaces.IPrintStructure;

import java.util.Random;
import java.util.Vector;

public class Room implements IPrintStructure {

    private Museum museum;
    private String roomID;
    private Vector<Art> artPieces;
    private Vector<Visitor> visitors;
    private static Random random = new Random(System.nanoTime());

    public Room(Museum museum, String roomID) {
        this.museum = museum;
        museum.addRoom(this);
        this.roomID = roomID;
        this.artPieces = new Vector<>();
        this.visitors = new Vector<>();
    }

    public Museum getMuseum() {
        return museum;
    }

    public String getRoomID() {
        return roomID;
    }

    public Vector<Art> getArtPieces() {
        return artPieces;
    }

    public Vector<Visitor> getVisitors() {
        return visitors;
    }

    // functions ------------------------------------------
    public void visitorDo(Vector<Room> rooms) {
        var visitors = new Vector<>(this.visitors);
        for (Visitor oneVisitor : visitors) {
            int randomNumber = random.nextInt(3);
            if (randomNumber == 0 && oneVisitor.isToChange()) {
                    oneVisitor.changeRoom(rooms);
            } else if (randomNumber == 1) {
                oneVisitor.lookAtArt(rooms);
            } else {
                oneVisitor.leaveMuseum(rooms);
            }
        }
    }

    @Override
    public String toString() {
        return  "\n" + roomID +
                "\n _artPieces: " + artPieces +
                "\n _visitors: " + visitors;
    }

    public void printStructure() {
        System.out.println(roomID +
                "\n _artPieces: " + artPieces +
                "\n _visitors: " + visitors);
    }

    }
