package Lukas.day46Museum.models;

import Lukas.day46Museum.abstracts.ExternalPerson;
import Lukas.day46Museum.enums.PersonType;


public class Visitor extends ExternalPerson {

	public Visitor(String firstName, String lastName, int maxSatisfactionLvl) {
		super(PersonType.VISITOR, firstName, lastName, maxSatisfactionLvl);
	}
}
