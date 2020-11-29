package Lukas.day30CodingCampusObject;

public final class Room {
	private Building building;
	private char sector;
	private int floor;
	private int roomNumber;

	Room(Building building, char sector, int floor, int roomNumber) {
		this.building = building;
		this.sector = sector;
		this.floor = floor;
		this.roomNumber = roomNumber;
	}

	public String getFullLocation() {
		String location = String.format("%s, sector %s, floor %d, room %d", building.getName(), sector, floor, roomNumber);
		return location;
	}
}
