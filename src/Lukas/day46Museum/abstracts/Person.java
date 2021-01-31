package Lukas.day46Museum.abstracts;

import Lukas.day46Museum.enums.PersonType;
import Lukas.day46Museum.models.Room;


public abstract class Person {
	private PersonType type;
	private String firstName;
	private String lastName;
	private Room room;

	public Person(PersonType type, String firstName, String lastName) {
		this.type = type;
		this.firstName = firstName;
		this.lastName = lastName;
		this.room = null;
	}

	// -- METHODS ----------------------------------------------------------------------------------
	public void visitRoom(Room newRoom) {
		if (this.room != null) {
			this.room.removePerson(this);
		}
		this.room = newRoom;
		this.room.addPerson(this);
		System.out.println(getInfo() + " moves to room " + room.getRoomNumber());
	}
	
	// -- GETTER ----------------------------------------------------------------------------------
	public String getInfo() {
		return type + " " + firstName + " " + lastName;
	}

	public PersonType getType() {
		return type;
	}

	public Room getRoom() {
		return room;
	}
}
