package Marcella.Restaurant;

public class Tabel {

    private int tableNumber;
    private int capacity;
    private boolean isFree;

    public Tabel(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isFree = true;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
