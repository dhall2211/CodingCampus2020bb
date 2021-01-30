package Ali.ghanmi.com.museummonastery;

import java.util.HashSet;

public class Visitor {
    private String firstName;
    private String lastName;
    private Room room;
    private HashSet<Room> visitedRooms;

    public Visitor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.visitedRooms = new HashSet<>();
    }

    public void visitRoom(Room room) {
        if(this.room != null){
            this.room.removeVisitor(this);
        }
        room.addVisitor(this);
        this.room = room;
        visitedRooms.add(room);
        System.out.println("Visitor " + firstName + " " + lastName + " moves to room " + room.getId() + ".");
    }

    public int getVisitedRoomsCount(){
        return visitedRooms.size();
    }

    public void leaveMuseum() {
        if(this.room != null){
            this.room.removeVisitor(this);
        }
        this.room = null;
        System.out.println("Visitor " + firstName + " " + lastName + " leaves the museum.");
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}