package Lukas.day34ZooBasicAssociation;

public class Animal {
	private Enclosure enclosure;
	private String species;
	private String name;
	private Food food;
	private int foodRequirenment;

	public Animal(Enclosure enclosure, String species, String name, Food food, int foodRequirenment) {
		enclosure.addAnimal(this);
		this.species = species;
		this.name = name;
		this.food = food;
		this.foodRequirenment = foodRequirenment;

		food.addQuantity(foodRequirenment);
	}
	
	@Override
	public String toString() {
		return name + " needs " + foodRequirenment + " " + food.getUnit() + " " + food.getName();
	}
}
