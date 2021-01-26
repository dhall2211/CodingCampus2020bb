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

    public Museum(String name, LinkedList<Room> rooms, Room startingRoom, Integer openingHour, Integer closingDoorsHours, Integer closingHours) {
        this.name = name;
        this.rooms = rooms;
        this.startingRoom = startingRoom;
        this.openingHour = openingHour;
        this.closingDoorsHours = closingDoorsHours;
        this.closingHours = closingHours;
    }

    private int getTicksUntilCloseDoors(){
        return (closingDoorsHours - openingHour) * 4; // one tick every 15min
    }

    public int getTicksUntilClose(){
        return (closingHours - openingHour) * 4; // one tick every 15min
    }

    public void nextSimulationStep(int tick, int maxGuestsPerTick) {
        for (var room : rooms) {
            room.moveGuards(rooms);
            room.moveVisitors(rooms);
        }

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
                room.removeAllPersons();
            }
        }
    }
}
