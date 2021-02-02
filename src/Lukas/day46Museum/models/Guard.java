package Lukas.day46Museum.models;

import Lukas.day46Museum.abstracts.Person;
import Lukas.day46Museum.enums.PersonType;


public class Guard extends Person {
	
	public Guard(String firstName, String lastName) {
		super(PersonType.GUARD, firstName, lastName);
	}
}
