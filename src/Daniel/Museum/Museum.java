package Daniel.Museum;

import Daniel.Museum.Factories.PersonFactory;

import java.util.LinkedList;
import java.util.Random;

public class Museum {
    private String name;
    private LinkedList<Room> rooms;
    private Room startingRoom;
    private Integer openingHour;
    private Integer closingDoorsHours;
    private Integer closingHours;
    private Curator curator;

    public Museum(String name, LinkedList<Room> rooms, Room startingRoom, Integer openingHour, Integer closingDoorsHours, Integer closingHours, Curator curator) {
        this.name = name;
        this.rooms = rooms;
        this.startingRoom = startingRoom;
        this.openingHour = openingHour;
        this.closingDoorsHours = closingDoorsHours;
        this.closingHours = closingHours;
        this.curator = curator;
    }

    private int getTicksUntilCloseDoors(){
        return (closingDoorsHours - openingHour) * 4; // one tick every 15min
    }

    public int getTicksUntilClose(){
        return (closingHours - openingHour) * 4; // one tick every 15min
    }

    public void nextSimulationStep(int tick, int maxGuestsPerTick, int maxDonationsPerDay) {
        for (var room : rooms) {
            room.movePersons(rooms);
        }

        curator.collectDonations(maxDonationsPerDay);
        curator.buyNewArtPiece(rooms);

        var random = new Random();
        if(tick <= getTicksUntilCloseDoors()){
            int guestsCount = random.nextInt(maxGuestsPerTick);
            var newVisitors = PersonFactory.createVisitors(guestsCount);
            for (var visitor : newVisitors) {
                visitor.visitRoom(startingRoom);
            }
        }

        if(tick == getTicksUntilClose()-1){
            for (var room : rooms) {
                room.removeAllPersons(startingRoom);
            }
        }
    }
}
