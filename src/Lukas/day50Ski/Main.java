package Lukas.day50Ski;

public class Main {
	public static void main(String[] args) {
		Shop skiRental = Shop.getInstance();
		System.out.println("Hello World");
		
		Shop skiRental2 = Shop.getInstance();
		System.out.println(skiRental == skiRental2);
	}
}