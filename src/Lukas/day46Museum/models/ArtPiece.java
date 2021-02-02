package Lukas.day46Museum.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import Lukas.day46Museum.enums.ArtType;


public class ArtPiece {
	private ArtType type;
	private String title;
	private String creator;
	private Date creationDate;
	private Integer price;
 
	public ArtPiece(ArtType type, String title, String creator, Date creationDate, Integer price) {
		this.type = type;
		this.title = title;
		this.creator = creator;
		this.creationDate = creationDate;
		this.price = price;
	}
	
	// -- GETTER -----------------------------------------------------------------------------------
	public String getInfo() {
		return title + " from " + creator;
	}

	public String getFullInfo() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");  

		String fullInfo = "Art Piece: " + title + " from " + creator + "\n" +
			"Type: " + type + "\n" +
			"Creation Date: "  + dateFormat.format(creationDate) + "\n" +
			"Price: "  + price + "\n";
		return fullInfo;
	}

	public int getPrice() {
		return price;
	}
}
