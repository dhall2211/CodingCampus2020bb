package Lukas.day46Museum.models;

import Lukas.day46Museum.abstracts.ExternalPerson;
import Lukas.day46Museum.enums.PersonType;


public class Thief extends ExternalPerson {
	
	public Thief(String firstName, String lastName, int maxSatisfactionLvl) {
		super(PersonType.THIEF, firstName, lastName, maxSatisfactionLvl);
	}

	// -- METHODS ----------------------------------------------------------------------------------
	public void stealArtPiece() {
		System.out.println(getInfo() + " steals art piece: " + getArtPiece().getInfo());
	}
}
