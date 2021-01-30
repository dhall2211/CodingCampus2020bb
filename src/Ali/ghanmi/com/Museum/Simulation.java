package Ali.ghanmi.com.Museum;

import Ali.ghanmi.com.Museum.Factories.ArtPieceFactory;
import Ali.ghanmi.com.Museum.Factories.PersonFactory;
import Ali.ghanmi.com.Museum.Factories.RoomFactory;
//import Daniel.Util.CollectionUtil;
import Ali.ghanmi.com.Util.CollectionUtil;
public class Simulation {
    public static void main(String[] args) {
        var rooms = RoomFactory.createRooms(3);
        var startingRoom = rooms.get(0);
        Museum monastery = new Museum("Kloster Riedenburg", rooms, startingRoom, 9, 16, 17);

        var guards = PersonFactory.createGuards(1);
        for (var guard : guards) {
            guard.visitRoom(startingRoom);
        }

        Integer maxGuestsPerTick = 2;
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
        CollectionUtil.printCollection(guards, ", ");
    }
}
