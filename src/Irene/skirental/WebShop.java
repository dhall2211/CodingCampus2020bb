package Irene.skirental;

public class WebShop implements IProvider{
	private static WebShop instance;

	private WebShop() {	}

	public static WebShop getInstance() {
		if(WebShop.instance == null) {
			WebShop.instance = new WebShop();
		}
		return WebShop.instance;
	}

	@Override
	public boolean isAvailable(Category category) {
		return false;
	}

	@Override
	public Reservation request(Category category) {
		return null;
	}
}
