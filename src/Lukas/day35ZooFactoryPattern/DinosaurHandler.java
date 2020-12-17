package Lukas.day35ZooFactoryPattern;

import java.util.Vector;

public class DinosaurHandler {
	 private String name;
	 private Animal favouriteAnimal;
	 private Vector<Enclosure> enclosures;

	 protected DinosaurHandler(String name, Animal favouriteAnimal, Vector<Enclosure> enclosures) {
		 this.name = name;
		 this.favouriteAnimal = favouriteAnimal;
		 this.enclosures = enclosures;
	 }

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name)
		  .append("\n     Favourite Animal: ")
		  .append(favouriteAnimal.getName())
		  .append("\n     Assigned enclosures: ");

		for (int i = 0; i < enclosures.size(); i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(enclosures.get(i).getName());
		}
		return sb.toString();
	}
}