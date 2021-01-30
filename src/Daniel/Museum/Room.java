package Daniel.Museum;

import Daniel.Museum.Factories.ArtPieceFactory;

import java.util.LinkedList;
import java.util.Random;

public class Room {
    private static Random random = new Random(System.currentTimeMillis());
    private String id;
    private LinkedList<ArtPiece> artPieces;
    private LinkedList<Person> persons;

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
            if (person instanceof ExternalPerson && person.getVisitedRoomsCount() >= rooms.size() * 0.8) {
                ((ExternalPerson) person).leaveMuseum();
            } else {
                person.visitRoom(randomRoom);
            }
        }
    }

    public String getId() {
        return id;
    }

    public void removeAllPersons(Room startingRoom) {
        var persons = new LinkedList<>(this.persons);
        for (var person : persons) {
            if (person instanceof ExternalPerson) {
                ((ExternalPerson) person).leaveMuseum();
            }
            if (person instanceof Guard) {
                person.visitRoom(startingRoom);
            }
        }
    }

    public void addRandomArtPieces(int artPiecesCount) {
        this.artPieces = ArtPieceFactory.createArtPieces(artPiecesCount);
    }

    public void addArtPiece(ArtPiece artPiece) {
        artPieces.add(artPiece);
    }
}
