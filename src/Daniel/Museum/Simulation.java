package Daniel.Museum;

import Daniel.Museum.Factories.ArtPieceFactory;
import Daniel.Museum.Factories.PersonFactory;
import Daniel.Museum.Factories.RoomFactory;
import Daniel.Util.CollectionUtil;

public class Simulation {
    public static void main(String[] args) {
        var rooms = RoomFactory.createRooms(4);
        Museum monastery = new Museum("Kloster Riedenburg", rooms);

        var guards = PersonFactory.createGuards(3);
        var startingRoom = rooms.get(0);
        for (var guard : guards) {
            guard.visitRoom(startingRoom);
        }

        for (int i = 0; i < 5; i++) {
            monastery.nextSimulationStep();
        }
    }

    private static void testMethods() {
        var randomArtPiece = ArtPieceFactory.createArtPiece();
        System.out.println(randomArtPiece);

        System.out.println(PersonFactory.createVisitor());
        System.out.println(PersonFactory.createVisitor());
        System.out.println(PersonFactory.createThief());
        System.out.println(PersonFactory.createThief());

        var guards = PersonFactory.createGuards(3);
        CollectionUtil.printCollection(guards, ", ");
    }
}
