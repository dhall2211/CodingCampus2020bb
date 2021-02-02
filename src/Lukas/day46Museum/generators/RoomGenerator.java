package Lukas.day46Museum.generators;

import Lukas.day46Museum.models.ArtPiece;
import Lukas.day46Museum.models.Room;


public abstract class RoomGenerator {
	public static Room createRoom(int roomNumber, ArtPiece[] artPieces) {
		Room room = new Room(roomNumber);
		room.addArtPieces(artPieces);
		return room;
	}
}
