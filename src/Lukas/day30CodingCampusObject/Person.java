package Lukas.day30CodingCampusObject;

public abstract class Person {
	private String firstName;
	private String lastName;
	private Address address;

	Person(String firstName, String lastName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	};
	public String[] getAddress() {
		return this.address.getAddress();
	};
}
