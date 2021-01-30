package Daniel.Museum;

import Daniel.Museum.Factories.PersonFactory;
import Daniel.Museum.Factories.RoomFactory;

public class Simulation {
    public static void main(String[] args) {
        var rooms = RoomFactory.createRooms(4);
        var startingRoom = rooms.get(0);
        int artPiecesCount = 5;
        for (var room : rooms) {
            room.addRandomArtPieces(artPiecesCount);
        }
        Museum monastery = new Museum("Kloster Riedenburg", rooms, startingRoom, 9, 16, 17, new Curator("John", "Smith"));

        var guards = PersonFactory.createGuards(3);
        for (var guard : guards) {
            guard.visitRoom(startingRoom);
        }

        Integer maxGuestsPerTick = 4;
        for (int tick = 1; tick < monastery.getTicksUntilClose(); tick++) {
            monastery.nextSimulationStep(tick, maxGuestsPerTick, 100);
        }
    }
}
