package Lukas.day30CodingCampusObject;

public abstract class Person {
	private String firstName;
	private String lastName;
	private Address address;
	private String type;

	Person(String firstName, String lastName, Address address, String type) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.type = type; // Probably useless, but just for testing
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	};
	public String[] getAddress() {
		return this.address.getAddress();
	};

	public String getType() {
		return this.type;
	}
}
