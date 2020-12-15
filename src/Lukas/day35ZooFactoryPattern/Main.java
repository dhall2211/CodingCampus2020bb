package Lukas.day35ZooFactoryPattern;


public class Main {
	public static void main(String[] args) {
		// First of all, create Zoo
		Zoo zoo = new Zoo("Jurassic Zoo", "Simon Masrani");

		// Create Viecher
		Animal hybrid = zoo.createAnimal(
			"Research area 20m concrete walls", "Hybrid", "Indominus Rex", "Carnivore", "cows", 30, "pcs");
		Animal blue = zoo.createAnimal(
			"Training cage", "Blue", "Velociraptor", "Carnivore", "pigs", 1, "pcs");
		zoo.createAnimal(
			"Training cage", "Charlie", "Velociraptor", "Carnivore", "pigs", 1, "pcs");
		zoo.createAnimal(
			"Training cage", "Delta", "Velociraptor", "Carnivore", "pigs", 1, "pcs");
		zoo.createAnimal(
			"Training cage", "Echo", "Velociraptor", "Carnivore", "pigs", 1, "pcs");

		// Try this:
		zoo.createFood("fish", "pcs");  // Code does not care if Food is created before / after
									    // animal or not at all
		zoo.createFood("bunny", "pcs"); // Never used, code does not care

		zoo.createAnimal(
			"3 million gallon water pool", "Mosi", "Mosasaurus", "Carnivore", "fish", 200, "pcs");
		zoo.createAnimal(
			"Forest cage near main area", "Tyrant Lizard", "Tyrannosaurus Rex", "Carnivore", "cows", 15, "pcs");
		zoo.createAnimal(
			"Open area", "Fused Lizard", "Ankylosaurus", "Herbivore", "grass", 600, "kg");
		zoo.createAnimal(
			"Aviary", "Needle head", "Pteranodon", "Carnivore", "fish", 25, "pcs");
		zoo.createAnimal(
			"Aviary", "Triangle face", "Pteranodon", "Carnivore", "fish", 30, "pcs");
		zoo.createAnimal(
			"Aviary", "Fish diver", "Pteranodon", "Carnivore", "fish", 22, "pcs");
			
		// Personell
		zoo.createPalaeontologist("Dr. Alan Grant");
		zoo.createDinosaurHandler("Owen Grady", blue, new String[] {"Training cage"});
		zoo.createDinosaurHandler("Barry", hybrid, new String[] {"Aviary", "Open area"});


		// Console print
		System.out.println();
		System.out.println(zoo.getStructure() + "\n");
		System.out.println("Animals in zoo: " + zoo.getNumberOfAnimals() + "\n");
		System.out.println("Demand of food:\n" + zoo.printFoodDemand() + "\n");
	}	
}
