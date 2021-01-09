package Lukas.holidayBaking;

public class Simulation {
	private Bakery bakery;

	public Simulation(Bakery bakery) {
		this.bakery = bakery;
	}

	public void start() {
		int day = 1;
		boolean wheelsTurning = true;
		while (wheelsTurning) {
			System.out.println("\nDay " + day + " -------------------------------");
			bakery.produce();
			bakery.deliver();
			bakery.resetCapacities();
			day++;

			if (bakery.getCopyOfPendingOrders().size() == 0 && bakery.getCopyOfProducedOrders().size() == 0) {
				wheelsTurning = false;
			}
		}
	}
}