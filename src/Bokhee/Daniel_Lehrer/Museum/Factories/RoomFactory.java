package Bokhee.Daniel_Lehrer.Museum.Factories;

import Bokhee.Daniel_Lehrer.Museum.Room;

import java.util.LinkedList;

public class RoomFactory {
    public static LinkedList<Room> createRooms(int count){
        LinkedList<Room> rooms = new LinkedList<>();
        for (int i = 1; i <= count; i++) {
            rooms.add(new Room(Integer.toString(i)));
        }
        return rooms;
    }
}
