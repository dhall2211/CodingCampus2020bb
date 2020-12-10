package Lukas.day34ZooBasicAssociation;

import java.util.Vector;

public class Enclosure {
	private String fence;
	private Vector<Animal> animals;

	public Enclosure(Zoo zoo, String fence) {
		this.fence = fence;
		zoo.addEnclosure(this);
	}
	
	public String getStructure() {
		StringBuilder sb = new StringBuilder();
		sb.append("  L ")
		  .append("Enclosure with ")
		  .append(fence)
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
		} else {
			return 0;
		}
	}

	public void addAnimal(Animal a) {
		if (animals == null) {
			this.animals = new Vector<>();
		}
		animals.add(a);
	}
}
