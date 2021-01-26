package Daniel.Museum;

import java.util.LinkedList;

public class Museum {
    private String name;
    private LinkedList<Room> rooms;
    private Room startingRoom;

    public Museum(String name, LinkedList<Room> rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    public void nextSimulationStep() {
        for (var room : rooms) {
            room.moveGuards(rooms);
        }
    }
}
