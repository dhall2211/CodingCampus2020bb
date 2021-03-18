package Bokhee.Restaurant;

import java.util.Vector;

public class Restaurant {
    private String name;
    private Menu menu;
    private Vector<GuestGroup> guestGroups;
    private Vector<Table> tables;
    private Vector<Order> orders;
    private Product product;
    private Table table;


    public Restaurant(String name) {
        this.name = name;
        this.menu = new Menu();
        this.guestGroups = new Vector<>();
        this.tables = new Vector<>();
        this.orders = new Vector<>();

    }

    public void addProducts(Product[] products) {
        menu.addProducts(products);
    }

    public void addTables(Table[] tables) {
        for (Table oneTable : tables) {
            this.tables.add(oneTable);
        }
    }

    public void assignGuestGroup(GuestGroup guestGroup) {
        for (Table oneTable : tables) {
            if (oneTable.isFree() && guestGroup.getNumberOfGroup() <= oneTable.getCapacity()) {
                this.guestGroups.add(guestGroup);
                oneTable.setFree(false);
                System.out.println("Bitte setzen Sie sich an Tisch nummer " + oneTable.getNumber());
                return;
            }
        }
        System.out.println("Momentan sind alle Tische belegt. Sie können warten, bis ein passender Tisch frei wird.");
    }

    public Order handleOrder(Table tableNumber, Product productsOrdered) {
        System.out.println("Menukarte ist an den  Tisch " + table.getNumber() + "gebracht worden.");
        for (int i = 0; i < tables.size(); i++) {
            if (tables.get(i) != null) {
                Order order = new Order(tableNumber, productsOrdered);
                orders.add(order);
            }
            System.out.println("Die Bestellung für den Tisch Nummber" + tables.get(i) + " sind\n " + orders.get(i).toString());
        }
        return orders.get(tableNumber.getNumber());
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", menu=" + menu +
                ", guestGroups=" + guestGroups +
                ", tables=" + tables +
                '}';
    }
}