package Ali.ghanmi.com.Museum;

import java.util.LinkedList;
import java.util.Random;

public class Room {
    private String id;
    private LinkedList<ArtPiece> artPieces;
    private LinkedList<Guard> guards;
    private LinkedList<Visitor> visitors;

    public Room(String id) {
        this.id = id;
        this.artPieces = new LinkedList<>();
        this.guards = new LinkedList<>();
        this.visitors = new LinkedList<>();
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
            if(visitor.getVisitedRoomsCount() >= rooms.size() * 0.8){
                visitor.leaveMuseum();
            }
            var randomRoom = rooms.get(random.nextInt(rooms.size()));
            visitor.visitRoom(randomRoom);
        }
    }

    public void removeAllPersons() {
        var visitors = new LinkedList<>(this.visitors);
        for (var visitor : visitors) {
            visitor.leaveMuseum();
        }
        // TODO reset guards position
    }
}
