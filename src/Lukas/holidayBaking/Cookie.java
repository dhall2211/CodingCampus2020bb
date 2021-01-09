package Lukas.holidayBaking;

public class Cookie {
	String name;
	int packageAmount;
	String packageUnit;

	public Cookie(String name, int packageAmount, String packageUnit) {
		this.name = name;
		this.packageAmount = packageAmount;
		this.packageUnit = packageUnit;
	}

	// Getter --------------------------------------------------------------------------------------
	public String getName() {
		return name;
	}
	
	public String generateInfo(int packages) {
		int amount = packages * packageAmount;
		return amount + packageUnit + " " + name; 
	}

	@Override
	public String toString() {
		return name;
	}

}
