package Bokhee.Restaurant;

public class Table {
    private int number;
    private int capacity;
    private boolean isFree;

    public Table(int number, int sizeTable) {
        this.number = number;
        this.capacity = sizeTable;
        this.isFree = true;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return "Table{" +
                "number=" + number +
                ", sizeTable=" + capacity +
                ", isFree=" + isFree +
                '}';
    }
}
