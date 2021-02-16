package Marcella.Museum;

public class Guard {

    private String name;
    private Room room;

    public Guard(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    @Override
    public String toString() {
        return name + ", room=" + room.getRoomID();
    }

}
