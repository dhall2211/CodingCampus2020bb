package Lukas.holidayBaking;

import java.util.ArrayList;
// java.util.List;

public class Bakery {
	String name;
	ArrayList<Baker> bakers;
	ArrayList<Customer> customers;
	ArrayList<Cookie> cookies;
	ArrayList<Order> pendingOrders;
	ArrayList<Order> producedOrders;
	
	public Bakery(String name) {
		this.name = name;
		this.bakers = new ArrayList<>();
		this.customers = new ArrayList<>();
		this.cookies = new ArrayList<>();
		this.pendingOrders = new ArrayList<>();
		this.producedOrders = new ArrayList<>();
	}

	// Factory -------------------------------------------------------------------------------------
	public Baker createBaker(String name, int dailyBakingCapacity, int dailyDeliveryCapacity,
							 Cookie bestCookie, Cookie[] producableCookies) {
		for (Baker baker : bakers) {
			if (baker.getName().equals(name)) {
				return baker;
			}
		}

		Baker b = new Baker(name, dailyBakingCapacity, dailyDeliveryCapacity, bestCookie, producableCookies);
		bakers.add(b);
		return b;

	}

	public Cookie createCookie(String name, int packageAmount, String packageUnit) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals(name)) {
				return cookie;
			}
		}

		Cookie c = new Cookie(name, packageAmount, packageUnit);
		cookies.add(c);
		return c;
	}

	// Setter --------------------------------------------------------------------------------------
	public void registerCustomer(Customer customer) {
		customers.add(customer);
	}

	public void placeOrder(Order order) {
		pendingOrders.add(order);
	}

	// Getter --------------------------------------------------------------------------------------
	public String getStructure() {
		StringBuilder sb = new StringBuilder();

		sb.append(name)
		  .append("\n")
		  .append("  L Bakers: ")
		  .append(bakers)
		  .append("\n")
		  .append("  L Cookies: ")
		  .append(cookies)
		  .append("\n")
		  .append("  L Customers: ")
		  .append(customers)
		  .append("\n")
		  .append("  L Orders: ")
		  .append(pendingOrders)
		  .append("\n");

		return sb.toString();
	}

	public ArrayList<Order> getCopyOfPendingOrders() {
		ArrayList<Order> copyOfPendingOrders = new ArrayList<>();

		for (Order order : pendingOrders) {
			copyOfPendingOrders.add(order);
		}
		return copyOfPendingOrders;
	}

	public ArrayList<Order> getCopyOfProducedOrders() {
		ArrayList<Order> copyOfProducedOrders = new ArrayList<>();

		for (Order order : producedOrders) {
			copyOfProducedOrders.add(order);
		}
		return copyOfProducedOrders;	
	}

	// Methods -------------------------------------------------------------------------------------
	public void produce() {
		ArrayList<Order> copyOfPendingOrders = new ArrayList<>();

		for (Order Order : pendingOrders) {
			copyOfPendingOrders.add(Order);
		}

		boolean capacityReached = false;

		for (Order order : copyOfPendingOrders) {
			if (!capacityReached) {
				System.out.println("Working on: " + order);
	
				// Java can't iterate and simultaneously change lists, therefore use a copy of the 
				// pending orders
				for (Item item : order.getCopyOfPendingItems()) {
					String itemName = item.getName();
					int amount = item.getAmount();
	
					Baker assignedBaker = null;
					int highestCapacity = 0;
	
					for (Baker baker : bakers) {
						int leftCapacity = baker.getBakingCapacity();
						if (baker.getBestCookieName().equals(itemName) && leftCapacity > amount) {
							assignedBaker = baker;
							break;
						} else if (leftCapacity > highestCapacity && baker.canProduce(item.getName())) {
							highestCapacity = leftCapacity;
							assignedBaker = baker;
						}
					}
					
					if (assignedBaker != null && assignedBaker.getBakingCapacity() >= amount) {
						System.out.println("  L " + assignedBaker.getName() + " makes " + item.generateInfo());
						assignedBaker.produceItems(amount);
						order.setItemProduced(item);
					} else {
						System.out.println("\nDaily baking capacity reached");
						capacityReached = true;
						break;
					}
	
				}
	
				if (order.getCopyOfPendingItems().size() == 0) {
					System.out.println("> " + order + " produced and ready for delivery");
					producedOrders.add(order);
					pendingOrders.remove(pendingOrders.indexOf(order));
				}
				System.out.println();
			}
		}
	}

	public void deliver() {
		ArrayList<Order> copyOfProducedOrders = new ArrayList<>();

		for (Order Order : producedOrders) {
			copyOfProducedOrders.add(Order);
		}

		for (Order order : copyOfProducedOrders) {
			Baker assignedBaker = null;
			int highestCapacity = 0;
			for (Baker baker : bakers) {
				int capacity = baker.getDeliveryCapacity();
				if (capacity > highestCapacity) {
					assignedBaker = baker;
					highestCapacity = capacity;
				}
			}

			if (assignedBaker != null) {
				assignedBaker.deliverOrder();
				System.out.println(assignedBaker.getName() + " delivers: " + order);
				producedOrders.remove(producedOrders.indexOf(order));
			} else {
				System.out.println("\nDaily delivery capacity reached");
				break;
			}
		}

	}

	public void resetCapacities() {
		for (Baker baker : bakers) {
			baker.resetCapacities();
		}
	}
}
