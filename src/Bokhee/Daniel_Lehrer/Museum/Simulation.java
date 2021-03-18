package Bokhee.Daniel_Lehrer.Museum;

import Bokhee.Daniel_Lehrer.Museum.Factories.ArtPieceFactory;
import Bokhee.Daniel_Lehrer.Museum.Factories.PersonFactory;
import Bokhee.Daniel_Lehrer.Museum.Factories.RoomFactory;

import java.util.Currency;

public class Simulation {
    public static void main(String[] args) {
        var rooms = RoomFactory.createRooms(4);
        var startingRoom = rooms.get(0);
        int artPiecesCount = 5;
        for (var room : rooms) {
            room.addRandomArtPieces(artPiecesCount);
        }
        Curator cur = new Curator("Alphonso", "Paulina");
        Museum monastery = new Museum("Kloster Riedenburg", rooms, startingRoom, 9, 16, 17, cur);

        var guards = PersonFactory.createGuards(3);
        for (var guard : guards) {
            guard.visitRoom(startingRoom);
        }

        Integer maxGuestsPerTick = 4;
        for (int tick = 1; tick < monastery.getTicksUntilClose(); tick++) {
            monastery.nextSimulationStep(tick, maxGuestsPerTick, 1000);
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
       // CollectionUtil.printCollection(guards, ", ");
    }
}
