package Irene.museummonastery;

import java.util.HashSet;

public class Thief {
    private String firstName;
    private String lastName;
    private Room room;
    private HashSet<Room> visitedRoomsThief;


    public Thief(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.visitedRoomsThief = new HashSet<>();
    }

    public void visitRoomThief(Room room) {
        if(this.room != null){
            this.room.removeThief(this);
        }
        room.addThief(this);
        this.room = room;
        visitedRoomsThief.add(room);
        System.out.println("Thief " + firstName + " " + lastName + " moves to room " + room.getId() + ".");
    }

    public int getVisitedRoomsCount(){
        return visitedRoomsThief.size();
    }

    public void leaveMuseumThief() {
        if(this.room != null){
            this.room.removeThief(this);
        }
        this.room = null;
        System.out.println("Thief " + firstName + " " + lastName + " leaves the museum.");
    }

    @Override
    public String toString() {
        return "Thief{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}