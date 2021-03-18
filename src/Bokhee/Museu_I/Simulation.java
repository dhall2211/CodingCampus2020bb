package Bokhee.Museu_I;

import Bokhee.Museu_I.Factories.ArtPieceFactory;
import Bokhee.Museu_I.Factories.PersonFactory;
import Bokhee.Museu_I.Factories.RoomFactory;


public class Simulation {
    public static void main(String[] args) {
        var rooms = RoomFactory.createRooms(4);
        var startingRoom = rooms.get(0);
        Museum monastery = new Museum("Kloster Riedenburg", rooms, startingRoom, 9, 16, 17);

        var guards = PersonFactory.createGuards(3);
        for (var guard : guards) {
            guard.visitRoom(startingRoom);
        }

        Integer maxGuestsPerTick = 4;
        for (int tick = 1; tick < monastery.getTicksUntilClose(); tick++) {
            monastery.nextSimulationStep(tick, maxGuestsPerTick);
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
