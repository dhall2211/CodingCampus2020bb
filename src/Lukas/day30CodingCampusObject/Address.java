package Lukas.day30CodingCampusObject;

final public class Address {
	private String street;
	private String house;
	private String postalCode;
	private String city;
	private String country;

	Address(String street, String house, String postalCode, String city, String country) {
		this.street = street;
		this.house = house;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
	}

	public String[] getAddress() {
		return new String[] {this.street, this.house, this.postalCode, this.city, this.country};
	}
	
}
