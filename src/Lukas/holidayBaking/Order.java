package Lukas.holidayBaking;

import java.util.ArrayList;

public class Order {
	Customer customer;
	ArrayList<Item> pendingItems;
	ArrayList<Item> producedItems;

	public Order(Customer customer) {
		this.customer = customer;
		this.pendingItems = new ArrayList<>();
		this.producedItems = new ArrayList<>();
	}

	// Setter --------------------------------------------------------------------------------------
	public void addItem(Item item) {
		pendingItems.add(item);
	}

	public void setItemProduced(Item item) {
		producedItems.add(item);
		pendingItems.remove(pendingItems.indexOf(item));
	}

	// Getter --------------------------------------------------------------------------------------
	public ArrayList<Item> getCopyOfPendingItems() {
		ArrayList<Item> copyOfPendingItems = new ArrayList<>();

		for (Item item : pendingItems) {
			copyOfPendingItems.add(item);
		}
		return copyOfPendingItems;
	}

	@Override
	public String toString() {
		return "Order from " + customer;
	}
}
