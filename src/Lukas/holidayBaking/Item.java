package Lukas.holidayBaking;

public class Item {
	Cookie cookie;
	int amount;
	
	public Item(Cookie cookie, int amount) {
		this.cookie = cookie;
		this.amount = amount;
	}

	// Getter --------------------------------------------------------------------------------------
	public String getName() {
		return cookie.toString();
	}

	public int getAmount() {
		return amount;
	}

	public String generateInfo() {
		return cookie.generateInfo(amount);
	}

	@Override
	public String toString() {
		return amount + " " + cookie;
	}
}
