package Lukas.holidayBaking;

public class Customer {
	String name;
	String address;

	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
