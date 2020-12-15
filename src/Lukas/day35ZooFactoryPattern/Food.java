package Lukas.day35ZooFactoryPattern;

public class Food {
	private String name;
	private int demand;
	private String unit;

	protected Food(String name, int demand, String unit) {
		this.name = name;
		this.demand = demand;
		this.unit = unit;
	}

	public void addDemand(int demand) {
		this.demand += demand;
	}

	public String getName() {
		return this.name;
	}

	public String getUnit() {
		return this.unit;
	}

	public int getDemand() {
		return this.demand;
	}
}
