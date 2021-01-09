package Lukas.holidayBaking;


public class Main {

	public static void main(String args[]) {
		Bakery bakery = new Bakery("Weihnachtsbäckerei");

		// Cookies ---------------------------------------------------------------------------------
		Cookie schokodinger = bakery.createCookie("Schokodinger", 100, "g");
		Cookie vanilledinger = bakery.createCookie("Vanilledinger", 100, "g");
		Cookie kokosdinger = bakery.createCookie("Kokosdinger", 100, "g");
		
		// Bakers ----------------------------------------------------------------------------------
		bakery.createBaker("Bibi", 5, 1, schokodinger, new Cookie[]{schokodinger, kokosdinger});
		bakery.createBaker("Rudi", 18, 1, vanilledinger, new Cookie[]{vanilledinger, kokosdinger});
		bakery.createBaker("Idi", 7, 1, kokosdinger, new Cookie[]{schokodinger, vanilledinger, kokosdinger});
		bakery.createBaker("Ludi", 4, 0, kokosdinger, new Cookie[]{kokosdinger});
		
		// Customers -------------------------------------------------------------------------------
		Customer customer1 = new Customer("customer1", "I dont care Street 1, 4430 abcd");
		Customer customer2 = new Customer("customer2", "Somewhere 3, 4637 asdf");
		Customer customer3 = new Customer("customer3", "Winterstreet 23, 2341 blablabla");
		Customer customer4 = new Customer("customer4", "ManyOrdersStreet 3, 4242 dodl");

		bakery.registerCustomer(customer1);
		bakery.registerCustomer(customer2);
		bakery.registerCustomer(customer3);
		bakery.registerCustomer(customer4);

		// Orders ----------------------------------------------------------------------------------
		// Info: Bakery can't split order items. They are produced at the same time from the same
		// Baker. If a item amount is too high, the programm will loop forever
		Order order1 = new Order(customer1);
		order1.addItem(new Item(schokodinger, 2));
		order1.addItem(new Item(vanilledinger, 2));
		bakery.placeOrder(order1);

		Order order2 = new Order(customer2);
		order2.addItem(new Item(kokosdinger, 4));
		bakery.placeOrder(order2);

		Order order3 = new Order(customer3);
		order3.addItem(new Item(kokosdinger, 4));
		order3.addItem(new Item(kokosdinger, 4));
		order3.addItem(new Item(kokosdinger, 4));
		order3.addItem(new Item(kokosdinger, 4));
		order3.addItem(new Item(kokosdinger, 4));
		order3.addItem(new Item(kokosdinger, 4));
		order3.addItem(new Item(kokosdinger, 4));
		order3.addItem(new Item(kokosdinger, 4));
		order3.addItem(new Item(vanilledinger, 4));
		order3.addItem(new Item(vanilledinger, 4));
		order3.addItem(new Item(vanilledinger, 4));
		order3.addItem(new Item(vanilledinger, 4));
		order3.addItem(new Item(vanilledinger, 4));
		order3.addItem(new Item(vanilledinger, 4));
		bakery.placeOrder(order3);

		Order order4 = new Order(customer4);
		order4.addItem(new Item(kokosdinger, 4));
		bakery.placeOrder(order4);
		Order order5 = new Order(customer4);
		order5.addItem(new Item(kokosdinger, 4));
		bakery.placeOrder(order5);
		Order order6 = new Order(customer4);
		order6.addItem(new Item(schokodinger, 4));
		bakery.placeOrder(order6);
		Order order7 = new Order(customer4);
		order7.addItem(new Item(vanilledinger, 4));
		bakery.placeOrder(order7);
		Order order8 = new Order(customer4);
		order8.addItem(new Item(schokodinger, 4));
		bakery.placeOrder(order8);
		Order order9 = new Order(customer4);
		order9.addItem(new Item(vanilledinger, 4));
		bakery.placeOrder(order9);

		// Print Structure -------------------------------------------------------------------------
		System.out.println(bakery.getStructure());
		
		// Simulation ------------------------------------------------------------------------------
		Simulation simulation = new Simulation(bakery);
		simulation.start();
	}	
}
