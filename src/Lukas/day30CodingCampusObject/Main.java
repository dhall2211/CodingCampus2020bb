package Lukas.day30CodingCampusObject;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		// Instantiate location objects
		Building ak = new Building("Arbeiterkammer Feldkirch");
		Room room = new Room(ak, 'C', 3, 4);

		// Instantiate Coding Campus course
		Course codingCampus = new Course("Coding Campus", room);

		// Instantiate trainers and add to course
		Address danielAddress = new Address("a", "s", "d", "f", "g");
		Trainer daniel = new Trainer("Daniel", "G", danielAddress);
		codingCampus.setTrainer(daniel);

		Address gyulaAddress = new Address("g", "h", "i", "j", "k");
		Trainer gyula = new Trainer("Gyula", "H", gyulaAddress);
		codingCampus.setTrainer(gyula);

		// Instantiate participants and add to course
		Address ignatzAddress = new Address("Lolstreet", "42", "1337", "Kratzlol", "Mittelerde");
		Participant ignatz = new Participant("Ignatz", "Roflcopter", ignatzAddress);
		codingCampus.setParticipant(ignatz);

		// Print course
		//System.out.println(codingCampus.toString());

		System.out.println(daniel.getType() + ": " + Arrays.toString(daniel.getAddress()));
		System.out.println(gyula.getType() + ": " + Arrays.toString(gyula.getAddress()));
		System.out.println(ignatz.getType() + ": " + Arrays.toString(ignatz.getAddress()));
	}
}
