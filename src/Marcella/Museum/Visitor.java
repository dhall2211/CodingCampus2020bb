package Marcella.Museum;

import java.util.Random;
import java.util.Vector;

public class Visitor {

    private String firstName;
    private String lastName;
    private String age;
    private String adress;
    private boolean isThief;
    private Room room;
    private boolean isToChange = true;
    private Vector<Art> artPieces;
    private static Random random = new Random(System.nanoTime());


    public Visitor(Room room) {
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.age = "age";
        this.adress = "adress";
        this.room = room;
        this.isThief = false;
        this.artPieces = new Vector<>();
    }

    public boolean isToChange() {
        return isToChange;
    }

    public void setToChange(boolean isToChange) {
        this.isToChange = isToChange;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public boolean isThief() {
        return isThief;
    }

    public void setThief(boolean thief) {
        isThief = thief;
    }

    // functions ------------------------------------------
    public void generateVisitor() {
        String[] firstName = {"Hans", "Peter", "Paul", "Lisa", "Gerlinde", "Anna", "Tom", "Victor", "Tatjana"};
        String[] lastName = {"M", "P", "F", "L", "X"};
        String[] age = {"29", "53", "39", "45", "71", "23", "62"};
        String[] adress = {"Feldkirch", "St. Gallen", "Berlin", "Dornbirn", "Milano", "London"};

        this.firstName = firstName[random.nextInt(firstName.length)];
        this.lastName = lastName[random.nextInt(lastName.length)];
        this.age = age[random.nextInt(age.length)];
        this.adress = adress[random.nextInt(adress.length)];
    }

    public void changeRoom(Vector<Room> rooms) {
        this.room.getVisitors().remove(this);
        Room newRoom;
        do {
            newRoom = rooms.get(random.nextInt(rooms.size()));
        } while (newRoom.equals(this.room));
        this.room = newRoom;
        this.room.getVisitors().add(this);
        isToChange = false;
        System.out.println(firstName + " " + lastName + " ist jetzt in Raum " + this.room.getRoomID());
    }

    public void lookAtArt(Vector<Room> rooms) {
        if (this.room.getArtPieces().size() == 0) {
            changeRoom(rooms);
            return;
        }
        Art choosenArt = this.room.getArtPieces().get(new Random().nextInt(this.room.getArtPieces().size()));
        System.out.println(firstName + " " + lastName + " betrachtet " + choosenArt.getTitle());
        if (isThief() == true && this.room.getVisitors().size() == 1) {
            stealArt(choosenArt);
            this.artPieces.add(choosenArt);
            this.room.getArtPieces().remove(choosenArt);
        }
    }

    public void stealArt(Art choosenArt) {
        System.out.println("ACHTUNG! " + firstName + " " + lastName + " stiehlt " + choosenArt.getTitle());
    }

    public void leaveMuseum(Vector<Room> rooms) {
        this.room.getVisitors().remove(this);
        System.out.println(firstName + " " + lastName + " hat das Museum verlassen.");
    }

    @Override
    public String toString() {
        return "Thief: " + isThief +
                ", name: " + firstName + " " + lastName +
                ", age: " + age +
                ", adress: " + adress +
                ", in room: " + room.getRoomID() +
                ", gestohlene Kunst: " + artPieces +
                "\n";
    }

}
