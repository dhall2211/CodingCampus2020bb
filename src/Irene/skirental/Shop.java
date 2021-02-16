package Irene.skirental;

public class Shop {
	private static Shop instance;
	
	private Shop() {}

	public static Shop getInstance() {
		if(Shop.instance == null) {
			Shop.instance = new Shop();
		}
		return Shop.instance;
	}
}