package Irene.skirental;

public interface IProvider {
	public boolean isAvailable(Category category);
	public Reservation request(Category category);
}
