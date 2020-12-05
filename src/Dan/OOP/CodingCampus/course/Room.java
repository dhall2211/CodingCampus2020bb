package Dan.OOP.CodingCampus.course;

import Dan.OOP.CodingCampus.course.Building;

public class Room {
    private Building building;
    private char sector;
    private int floor;
    private int roomNumber;
    Room (Building building,  char sector, int floor, int roomNumber) {
        this.building = building;
        this.sector = sector;
        this.floor = floor;
        this.roomNumber = roomNumber;
    }
    public String getFullLocation ()  {
        return String.format("%s %s %d %d", building.getName(), sector, floor, roomNumber);

    }
}
