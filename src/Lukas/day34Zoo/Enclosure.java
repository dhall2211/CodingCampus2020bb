package Lukas.day34Zoo;

import java.util.Vector;

public class Enclosure {
	private String fence;
	private Vector<Animal> animals;

	public Enclosure(Zoo zoo, String fence) {
		this.fence = fence;
		zoo.addEnclosure(this);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("  L ")
		  .append("Enclosure with ")
		  .append(fence)
		  .append("\n")
		  .append("    L ");
		
		if (animals != null) {
			for (int i = 0; i < animals.size(); i++) {
				if (i > 0) {
					sb.append(", ");
				}
				sb.append(animals.get(i).toString());
			}
		}
		return sb.toString();
	}

	public void addAnimal(Animal a) {
		if (animals == null) {
			this.animals = new Vector<>();
		}
		animals.add(a);
	}
}
