package Lukas.holidayBaking;

import java.util.ArrayList;

public class Baker {
	String name;
	Cookie bestCookie;
	ArrayList<Cookie> producableCookies;
	int dailyBakingCapacity;
	int bakingCapacity;
	int dailyDeliveryCapacity;
	int deliveryCapacity;

	public Baker(String name, int dailyBakingCapacity, int dailyDeliveryCapacity, Cookie bestCookie,
				 Cookie[] producableCookies) {
		this.name = name;
		this.dailyBakingCapacity = dailyBakingCapacity;
		this.bakingCapacity = dailyBakingCapacity;
		this.dailyDeliveryCapacity = dailyDeliveryCapacity;
		this.deliveryCapacity = dailyDeliveryCapacity;
		this.bestCookie = bestCookie;
		this.producableCookies = new ArrayList<>();
		
		for (Cookie cookie : producableCookies) {
			this.producableCookies.add(cookie);
		}
	}

	// Getter --------------------------------------------------------------------------------------
	public String getName() {
		return name;
	}

	public int getBakingCapacity() {
		return bakingCapacity;
	}

	public int getDeliveryCapacity() {
		return deliveryCapacity;
	}

	public String getBestCookieName() {
		return bestCookie.getName();
	}

	@Override
	public String toString() {
		return name;
	}

	// Methods -------------------------------------------------------------------------------------
	public void produceItems(int amount) {
		bakingCapacity -= amount;
	}

	public void deliverOrder() {
		deliveryCapacity--;
	}

	public void resetCapacities() {
		bakingCapacity = dailyBakingCapacity;
		deliveryCapacity = dailyDeliveryCapacity;
	}
	
	public boolean canProduce(String itemName) {
		boolean canProduce = false;
		
		for (Cookie cookie : producableCookies) {
			if (cookie.getName().equals(itemName)) {
				canProduce = true;
				break;
			}
		}
		return canProduce;
	}
}
