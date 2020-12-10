package Lukas.day34ZooBasicAssociation;

import java.util.Vector;

public class Zoo {
	private String name;
	private String chairman;
	private Vector<Enclosure> enclosures;
	private Vector<Food> food;

	public Zoo(String name, String chairman) {
		this.name = name;
		this.chairman = chairman;
		this.enclosures = new Vector<>();
	}
	
	public String getStructure() {
		StringBuilder sb = new StringBuilder();
		sb.append("zoo name: ").append(name);
		
		if (enclosures != null) {
			for (Enclosure enclosure : enclosures) {
				sb.append("\n").append(enclosure.getStructure());
			}
		}
		return sb.toString();
	}

	public int getNumberOfAnimals() {
		int animals = 0;
		if (enclosures != null) {
			for (Enclosure enclosure : enclosures) {
				animals += enclosure.getNumberOfAnimals();
			}
		}
		return animals;
	}
	
	public void addEnclosure(Enclosure e) {
		if (enclosures == null) {
			enclosures = new Vector<>();
		}
		enclosures.add(e);
	}
	
	public void addFood(Food f) {
		if (food == null) {
			food = new Vector<>();
		}
		food.add(f);
	}
	
		public void printFoodDemand() {
			if (food != null){
				for (Food food : food) {
					System.out.println(food);
				}
			}
		}
}
