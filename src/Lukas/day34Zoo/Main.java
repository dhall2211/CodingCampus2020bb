package Lukas.day34Zoo;

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
		Zoo zoo = new Zoo("ni ni ni zoo", "The knight who say ni");
		Enclosure lionCage = new Enclosure(zoo, "metal fence");

		for (int i = 0; i < 4; i++) {
			new Animal(lionCage, "lion");
		}
		System.out.println(zoo);
	}	
}
