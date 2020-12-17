package Daniel.Association;

public class Room {
    private String name;
    private Floor floor;
    private Building building;

    protected Room(String name, Floor floor, Building building) {
        this.name = name;
        this.floor = floor;
        this.building = building;
    }

    @Override
    public String toString() {
        return "Raum " + name + " in Gebäude " + building + " Stockwerk " + floor;
    }
}
