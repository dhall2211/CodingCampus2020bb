package Irene.museummonastery;

import Irene.museummonastery.factories.PersonFactory;
import Irene.museummonastery.factories.RoomFactory;

public class Simulation {
    public static void main(String[] args) {
        var rooms = RoomFactory.createRooms(4);
        var startingRoom = rooms.get(0);
        var secondRoom = rooms.get(1);
        var thirdRoom = rooms.get(2);
        var fourthRoom = rooms.get(3);

        startingRoom.addArtPieces();
        secondRoom.addArtPieces();
        thirdRoom.addArtPieces();
        fourthRoom.addArtPieces();

        Museum monastery = new Museum("Kloster Riedenburg", rooms, startingRoom, 13, 16, 17);

        var guards = PersonFactory.createGuards(3);
        for (var guard : guards) {
            guard.visitRoom(startingRoom);
        }

        var thieves = PersonFactory.createThief(2);
        for (var thief : thieves) {
            thief.visitRoomThief(startingRoom);
        }

        Integer maxGuestsPerTick = 4;
        for (int tick = 1; tick < monastery.getTicksUntilClose(); tick++) {
            monastery.nextSimulationStep(tick, maxGuestsPerTick);
        }

    }

    private static void testMethods() {
//        var randomArtPiece = ArtPieceFactory.createArtPieces(3);
//        System.out.println(randomArtPiece);

//        System.out.println(PersonFactory.createVisitor());
//        System.out.println(PersonFactory.createVisitor());
//        System.out.println(PersonFactory.createThief());
//        System.out.println(PersonFactory.createThief());
    }
}