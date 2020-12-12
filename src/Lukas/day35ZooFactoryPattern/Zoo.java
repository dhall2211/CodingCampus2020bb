package Lukas.day35ZooFactoryPattern;

import java.util.Vector;

public class Zoo {
	private String name;
	private String chairman;
	private Vector<Enclosure> enclosures;
	private Vector<Food> foodList;

	public Zoo(String name, String chairman) {
		this.name =
			" e-e\n" +
			"(\\_/)\\\n" +
			" `-'\\ `--.___,\n" +
			"    '\\( ,_.-'\n" +
			"       \\\\\n" +
			"       ^'\n" + name;
		this.chairman = chairman;
		this.enclosures = new Vector<>();
		this.foodList = new Vector<>();
	}

	public Animal createAnimal(String enclosure, String name, String species, String type, String foodType, int foodDemand, String foodUnit) {
		return new Animal(this, enclosure, name, species, type, foodType, foodDemand, foodUnit);
	}

	public Food createFood(String foodType, int foodDemand, String foodUnit) {
		for (Food food : foodList) {
			if (food.getName().equals(foodType)) {
				food.addDemand(foodDemand);
				return food;
			}
		}
		Food f = new Food(foodType, foodDemand, foodUnit);
		foodList.add(f);
		return f;
	}

	public Enclosure createEnclosure(String name) {
		for (Enclosure enclosure : enclosures) {
			if (enclosure.getName().equals(name)) {
				return enclosure;
			}
		}
		Enclosure e = new Enclosure(name);
		enclosures.add(e);
		return e;
	}

	public String getStructure() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		
		if (enclosures != null) {
			for (Enclosure enclosure : enclosures) {
				sb.append("\n").append(enclosure.getStructure());
			}
		}
		return sb.toString();
	}

	public int getNumberOfAnimals() {
		int number = 0;
		if (enclosures != null) {
			for (Enclosure enclosure : enclosures) {
				number += enclosure.getNumberOfAnimals();
			}
		}
		return number;
	}

	public String printFoodDemand() {
		StringBuilder sb = new StringBuilder();
		if (foodList != null){
			for (Food food : foodList) {
				sb.append(food.getDemand() + " " + food.getUnit() + " " + food.getName() + "\n");
			}
		}
		return sb.toString();
	}
}
