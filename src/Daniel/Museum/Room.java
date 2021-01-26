package Daniel.Museum;

import java.util.LinkedList;
import java.util.Random;

public class Room {
    private String id;
    private LinkedList<ArtPiece> artPieces;
    private LinkedList<Guard> guards;

    public Room(String id) {
        this.id = id;
        this.artPieces = new LinkedList<>();
        this.guards = new LinkedList<>();
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
}
