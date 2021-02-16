package Ali.ghanmi.com.Museum;

import Ali.ghanmi.com.Museum.Factories.ArtPieceFactory;

import java.util.LinkedList;
import java.util.Random;

public class Room implements ISimulation {
    private String id;
    private LinkedList<ArtPiece> artPieces;
    private LinkedList<Person> persons;
    private static Random random = new Random(System.currentTimeMillis());

    public Room(String id) {
        this.id = id;
        this.artPieces = new LinkedList<>();
        this.persons = new LinkedList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }

    public void movePersons(LinkedList<Room> rooms) {
        var persons = new LinkedList<>(this.persons);
        for (var person : persons) {
            var randomRoom = rooms.get(random.nextInt(rooms.size()));
            person.visitRoom(randomRoom);
        }
    }

    public String getId() {
        return id;
    }

    public void removeAllPersons(Room startingRoom) {
        var persons = new LinkedList<>(this.persons);
        for (var person : persons) {
            if(person.getClass().isAssignableFrom(IVisitor.class)){
                ((IVisitor) person).leaveMuseum();
            }
            if(person.getClass().isAssignableFrom(Guard.class)){
                person.visitRoom(startingRoom);
            }
        }
    }

    public void addRandomArtPieces(int artPiecesCount) {
        this.artPieces = ArtPieceFactory.createArtPieces(artPiecesCount);
    }

    @Override
    public void simulate(int tick) {

    }
}
