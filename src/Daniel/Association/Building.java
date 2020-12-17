package Daniel.Association;

import java.util.Vector;

public class Building {
    private String address;
    private Vector<Room> rooms;
    private Vector<Floor> floors;

    public Building(String address) {
        this.address = address;
        this.rooms = new Vector<>();
    }

    public Room createRoom(String name, Floor floor){
        var room = new Room(name, floor, this);
        this.rooms.add(room);
        return room;
    }

    @Override
    public String toString() {
        return address;
    }

    public Floor createFloor(int floorNumber) {
        var floor = new Floor(floorNumber);
        floors.add(floor);
        return floor;
    }
}
