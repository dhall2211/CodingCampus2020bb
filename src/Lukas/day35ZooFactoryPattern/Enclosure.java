package Lukas.day35ZooFactoryPattern;

import java.util.Vector;

public class Enclosure {
	private String name;
	private Vector<Animal> animals;

	protected Enclosure(String name) {
		this.name = name;
		animals = new Vector<>();
	}

	public void assignAnimal(Animal animal) {
		animals.add(animal);
	}

	public String getName() {
		return name;
	}

	public String getStructure() {
		StringBuilder sb = new StringBuilder();
		sb.append("  L ")
		  .append(name)
		  .append("\n");
		
		if (animals != null) {
			for (Animal animal : animals) {
				sb.append("      L ").append(animal.toString()).append("\n");
			}
		}
		return sb.toString();
	}

	public int getNumberOfAnimals() {
		if (animals != null) {
			return animals.size();
		}
		return 0;
	}
}
