package Lukas.day46Museum.models;

import java.util.ArrayList;
import java.util.Random;

import Lukas.day46Museum.abstracts.Person;
import Lukas.day46Museum.enums.PersonType;


public class Room {
	private int roomNumber;
	private ArrayList<ArtPiece> artPieces;
	private ArrayList<Person> persons;

	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
		this.artPieces = new ArrayList<>();
		this.persons = new ArrayList<>();
	}

	// -- METHODS ----------------------------------------------------------------------------------
	public void releaseSatisfiedPersons() {
		for (Person person : getCopyOfPersons()) {
			if (person.getType() == PersonType.VISITOR) {
				Visitor visitor = (Visitor) person;
				if (visitor.isSatisfied()) {
					System.out.println(visitor.getInfo() + " is satisfied and leaves");
					persons.remove(visitor);
				}
			} else if (person.getType() == PersonType.THIEF) {
				Thief thief = (Thief) person;
				if (thief.isSatisfied()) {
					System.out.println(thief.getInfo() + " is satisfied and leaves");
					persons.remove(thief);
				}
			}
		}
	}

	public void stealArtPiece() {
		for (Person person : persons) {
			Thief thief = (Thief) person;
			thief.stealArtPiece();
			artPieces.remove(thief.getArtPiece());
		}
		persons.clear();
	}

	public void sendPersonsHome() {
		for (Person person : persons) {
			if (person.getType() == PersonType.VISITOR || person.getType() == PersonType.THIEF) {
				System.out.println(person.getInfo() + " goes home");
			}
		}
		persons.clear();
	}

	// -- SETTER -----------------------------------------------------------------------------------
	public void addArtPieces(ArtPiece[] artPieces) {
		for (ArtPiece artPiece : artPieces) {
			this.artPieces.add(artPiece);
		}
	}

	public void addArtPiece(ArtPiece artPiece) {
		artPieces.add(artPiece);
	}

	public void addPerson(Person person) {
		persons.add(person);
	}

	public void removePerson(Person person) {
		persons.remove(person);
	}

	// -- GETTER -----------------------------------------------------------------------------------
	public int getRoomNumber() {
		return roomNumber;
	}

	public boolean onlyThievesInRoom() {
		boolean onlyThievesInRoom = true;

		for (Person person : persons) {
			if (person.getType() != PersonType.THIEF) {
				onlyThievesInRoom = false;
				break;
			}
		}
		return onlyThievesInRoom;
	}

	public ArrayList<Person> getCopyOfPersons() {
		ArrayList<Person> personsCopy = new ArrayList<>();

		for (Person person : persons) {
			personsCopy.add(person);
		}
		return personsCopy;
	}

	public ArtPiece getRandomArtPiece() {
		Random random = new Random();
		return artPieces.get(random.nextInt(artPieces.size()));
	}
}
