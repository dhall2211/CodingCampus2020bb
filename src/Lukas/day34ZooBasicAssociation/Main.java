package Lukas.day34ZooBasicAssociation;

/*
Erstellt ein Objekt “Zoo” , dieses Objekt beinhaltet eine Vielzahl an Gehegen, welche
wiederum eine bestimmte Anzahl an Tieren besitzt.
z.B. Ein Zoo hat 50 Gehege, im ersten Gehege befinden sich 4 Löwen
Versucht Objekte zu modellieren und die Objekte mit Eigenschaften zu füllen, welche
sinnvoll wären.
z.B. Ein Zoo hat einen Standort und eventuell einen Vorsitzenden
Ein Gehege besteht aus einer bestimmten Absperrung (Holzzaun, Maschendraht,
Glas)
Ein Löwe sollte nicht in einer Klasse Löwe abgebildet werden, sondern einem Tier,
dieses hat dann wiederum eine Gattung oder sowas ähnliches.
Am Ende benötigen wir die Anzahl der Tiere je Gehege, aber auch über den ganzen Zoo.
Ich möchte auch wissen wie viele Wassertiere wir haben, aber auch wie viele verschiedene
Arten.
*/

public class Main {
	public static void main(String[] args) {
		Zoo zoo = new Zoo("awesome Zoo", "The knight who say ni");
		Enclosure lionCage = new Enclosure(zoo, "high metal fence");
		Enclosure tigerCage = new Enclosure(zoo, "metal fence");
		Enclosure antarctisTank = new Enclosure(zoo, "big cold water tank");
		Enclosure meshFenceCover = new Enclosure(zoo, "5m cover thingy");
		Enclosure winterMountain = new Enclosure(zoo, "Mountain");

		Food lionAndTigerFood = new Food(zoo, "Meat", "kg");
		Food penguinFood = new Food(zoo, "Fish", "small");
		Food hummingbirdFood = new Food(zoo, "Sugarwater", "ml");

		for (int i = 0; i < 5; i++) {
			Animal lion = new Animal(lionCage, "lion", "lion" + i, lionAndTigerFood, 3);
			Animal tiger = new Animal(tigerCage, "tiger", "tiger" + i, lionAndTigerFood, 2);
			Animal penguin = new Animal(antarctisTank, "penguine", "pinguin" + i, penguinFood, 6);
			Animal hummingbird = new Animal(meshFenceCover, "hummingbird", "hummbird" + i, hummingbirdFood, 50);
		}

		Animal alpNashorn = new Animal(winterMountain, "AlpNashorn", "nasi das nashorn", lionAndTigerFood, 20);

		System.out.println("\nprint zoo structure --------------");
		System.out.println(zoo.getStructure());
		System.out.println("\nprint number of animals ----------");
		System.out.println("Zoo has " + zoo.getNumberOfAnimals() + " animals");
		System.out.println("\nprint food demand ----------------");
		zoo.printFoodDemand();
	}	
}
