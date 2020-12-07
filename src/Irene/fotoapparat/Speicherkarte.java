package Irene.fotoapparat;

public class Speicherkarte {
    private String brand;
    private int capacity;
    private int occupiedCapacity;

    public Speicherkarte(String brand, int capacity, int occupiedCapacity) {
        this.brand = brand;
        this.capacity = capacity;
        this.occupiedCapacity = occupiedCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public int setOccupiedCapacity(int occupiedCapacity) {
        this.occupiedCapacity = occupiedCapacity;
        return occupiedCapacity;
    }

    public int getOccupiedCapacity() {
        return occupiedCapacity;
    }
}
