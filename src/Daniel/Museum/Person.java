package Daniel.Museum;

import java.util.HashSet;

public class Person {
    protected String firstName;
    protected String lastName;
    protected Room room;
    private PersonType personType;
    private HashSet<Room> visitedRooms;

    public Person(String firstName, String lastName, PersonType personType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personType = personType;
        this.visitedRooms = new HashSet<>();
    }

    public void visitRoom(Room room) {
        if(this.room != null){
            this.room.removePerson(this);
        }
        room.addPerson(this);
        this.room = room;
        visitedRooms.add(room);
        System.out.println(personType.toString() + " " + firstName + " " + lastName + " moves to room " + room.getId());
    }

    public int getVisitedRoomsCount(){
        return visitedRooms.size();
    }
}
