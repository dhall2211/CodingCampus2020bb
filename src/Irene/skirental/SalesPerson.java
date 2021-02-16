package Irene.skirental;

public class SalesPerson implements IProvider {
	private String name;

	@Override
	public boolean isAvailable(Category category) {
		return false;
	}

	@Override
	public Reservation request(Category category) {
		return null;
	}
}
