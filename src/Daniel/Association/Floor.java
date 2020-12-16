package Daniel.Association;

public class Floor {
    private int floorNumber;

    protected Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return Integer.toString(floorNumber);
    }
}
