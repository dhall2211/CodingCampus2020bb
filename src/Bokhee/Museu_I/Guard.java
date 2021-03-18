package Bokhee.Museu_I;

public class Guard {
    private String firstName;
    private String lastName;
    private Room room;

    public Guard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void visitRoom(Room room) {
        if(this.room != null){
            this.room.removeGuard(this);
        }
        room.addGuard(this);
        this.room = room;
        System.out.println("Guard " + firstName + " " + lastName + " moves to room " + room.getId());
    }

    @Override
    public String toString() {
        return "Guard{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
