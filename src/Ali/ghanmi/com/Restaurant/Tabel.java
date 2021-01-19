package Ali.ghanmi.com.Restaurant;

import java.util.Vector;

public class Tabel {

    private int tableNumber;
    private int capacity;
    private boolean isFree;
    private Vector<Order> orders;

    public Tabel(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isFree = true;
        this.orders = new Vector<>();
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

    @Override
    public String toString() {
        return "Tabel: " + "tableNumber: " + tableNumber + ", capacity: " + capacity + "" +
                ", Statut: " + isFree+ " "+orders.toString();
    }

    public void addOrderToTabel(Order order) {
            orders.add(order);
    }
}
