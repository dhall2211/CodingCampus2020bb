package Lukas.day35ZooFactoryPattern;

public class Animal {
	private String name;
	private String species;
	private String type;
	private Food foodType;
	private int foodDemand;

	protected Animal(Zoo zoo, String enclosure, String name, String species, String type, String foodType, int foodDemand, String foodUnit) {
		this.name = name;
		this.species = species;
		this.type = type;
		this.foodType = zoo.createFood(foodType, foodDemand, foodUnit);
		this.foodDemand = foodDemand;

		Enclosure e = zoo.createEnclosure(enclosure);
		e.assignAnimal(this);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " (" + species + ")" + " needs " + foodDemand + foodType.getUnit() + " " + foodType.getName();
	}
}
