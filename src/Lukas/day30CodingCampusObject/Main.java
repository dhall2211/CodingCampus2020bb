package Lukas.day30CodingCampusObject;

import java.util.Vector;

public class Main {
	public static void main(String[] args) {

		// Instantiate location objects
		Building ak = new Building("Arbeiterkammer Feldkirch");
		Room room = new Room(ak, 'C', 3, 4);

		// Instantiate Coding Campus course
		Course codingCampus = new Course("Coding Campus", room);

		// Instantiate trainers and add to course
		Trainer t1 = new Trainer("Daniel");
		Trainer t2 = new Trainer("Gyula");
		Trainer t3 = new Trainer("Tobias");
		codingCampus.setTrainer(t1);
		codingCampus.setTrainer(t2);
		codingCampus.setTrainer(t3);

		// Instantiate participants and add to course
		Vector<Participant> participants = new Vector<Participant>();
		String[] names = {"Alex", "Aliben", "Bokhee", "Dan", "Eric", "Irene", "Klaus",
						  "Lukas", "Marcella", "Mihael", "Sabrina", "Samet"};

		for (String name : names) {
			Participant participant = new Participant(name);
			participants.add(participant);
			codingCampus.setParticipant(participant);
		}

		// Print course
		System.out.println(codingCampus.toString());
	}
}
