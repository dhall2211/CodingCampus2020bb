package Daniel.Course;

public class Room {
    private String name;
    private Building building;

    public Room(String name, Building building) {
        this.name = name;
        this.building = building;
    }

    @Override
    public String toString() {
        return this.name + " in Gebäude " + this.building;
    }
}
