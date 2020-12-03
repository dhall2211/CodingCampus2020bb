package Klaus.Camera;

public class MemoryCard {
    String manufacturer;
    double capacity; //in Megabyte
    double currentUsedSpace; //in Megabyte


    public MemoryCard(String manufacturer, double capacity, double currentUsedSpace) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
        this.currentUsedSpace = currentUsedSpace;
    }
}
