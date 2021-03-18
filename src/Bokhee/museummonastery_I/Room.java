package Bokhee.museummonastery_I;

import Bokhee.museummonastery_I.factories.ArtPieceFactory;

import java.util.LinkedList;
import java.util.Random;

public class Room {
    private String id;
    private LinkedList<ArtPiece> artPieces;
    private LinkedList<Guard> guards;
    private LinkedList<Visitor> visitors;
    private LinkedList<Thief> thieves;
    Random random = new Random();

    public Room(String id) {
        this.id = id;
        artPieces = new LinkedList<>();
        this.guards = new LinkedList<>();
        this.visitors = new LinkedList<>();
        this.thieves = new LinkedList<>();
    }

    public void addArtPieces() {
        artPieces.addAll(ArtPieceFactory.createArtPiece(3));
        System.out.println("In room " + getId() + " the following art pieces are exhibited: " + artPieces);
    }

    public void removeArtPiece(ArtPiece artpiece) {
        artPieces.remove(artpiece);
    }

    public void addGuard(Guard guard) {
        guards.add(guard);
    }

    public void removeGuard(Guard guard) {
        guards.remove(guard);
    }

    public void moveGuards(LinkedList<Room> rooms) {
        var random = new Random();
        var guards = new LinkedList<>(this.guards);
        for (var guard : guards) {
            var randomRoom = rooms.get(random.nextInt(rooms.size()));
            guard.visitRoom(randomRoom);
        }
    }

    public String getId() {
        return id;
    }

    public void removeVisitor(Visitor visitor) {
        visitors.remove(visitor);
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void moveVisitors(LinkedList<Room> rooms) {
        var random = new Random();
        var visitors = new LinkedList<>(this.visitors);
        for (var visitor : visitors) {
            var randomRoom = rooms.get(random.nextInt(rooms.size()));
            visitor.visitRoom(randomRoom);}
        for(var visitor : visitors){
            if (visitor.getVisitedRoomsCount() >= rooms.size() * 0.9) {
               // rooms.remove(visitor);
                visitor.leaveMuseum();
            }
        }
    }

    public void removeAllPersons() {
        var visitors = new LinkedList<>(this.visitors);
        for (var visitor : visitors) {
            visitor.leaveMuseum();
        }
        // TODO reset guards position
    }

    public void removeThief(Thief thief) {
        thieves.remove(thief);
    }

    public void addThief(Thief thief) {
        thieves.add(thief);
    }

    public void moveThieves(LinkedList<Room> rooms) {
        var random = new Random();
        var thieves = new LinkedList<>(this.thieves);
        for (var thief : thieves) {
            if (isRoomClear() && artPieces.size() > 0) {
                stealArtPiece(thief);
                thief.leaveMuseumThief();
                System.out.println("ALARM: "+thief.getFirstName()+" "+thief.getLastName() + " left the Museum with an Art Piece");
            } else if (thief.getVisitedRoomsCount() >= rooms.size() * 1.0) {
                thief.leaveMuseumThief();

            } else {
                var randomRoom = rooms.get(random.nextInt(rooms.size()));
                thief.visitRoomThief(randomRoom);
            }
        }
    }

    public void stealArtPiece(Thief thief) {
        ArtPiece piece = artPieces.remove(random.nextInt(artPieces.size()));
        System.out.println("The " + thief.toString() + " stole " + piece + ".");
    }

    public boolean isRoomClear() {
        if (visitors.size() == 0 && guards.size() == 0) {
            return true;
        }
        return false;
    }

    public void addArtPiece(ArtPiece newPiece) {
        this.artPieces.add(newPiece);

    }
}
