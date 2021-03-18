package Bokhee.Museu_I.Factories;

import Bokhee.Museu_I.Room;

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
