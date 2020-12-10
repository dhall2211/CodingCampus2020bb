package Lukas.day34ZooBasicAssociation;

public class Food {
	private String name;
	private int amount;
	private String unit;

	public Food(Zoo zoo, String name, String unit) {
		this.name = name;
		this.amount = 0;
		this.unit = unit;
		zoo.addFood(this);
	}
	
	@Override
	public String toString() {
		return amount + " " + unit + " " + name;
	}

	public int getAmount() {
		return amount;
	}

	public String getUnit() {
		return unit;
	}

	public String getName() {
		return name;
	}
	
	public void addQuantity(int a) {
		amount += a;
	}
}
