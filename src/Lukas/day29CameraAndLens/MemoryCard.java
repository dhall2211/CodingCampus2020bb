package src.com.dcv.nov.day29day30;

public class MemoryCard {
	private String name;
	private double storage;
	private double freeStorage;

	MemoryCard(String name, double storage) {
		this.name = name;
		this.storage = storage;
		this.freeStorage = this.storage;
	}

	public String getName() {
		return this.name;
	}

	public double getStorage() {
		return this.freeStorage;
	}

	public boolean save(double size) {
		double newStorage = this.freeStorage - size;
		if (newStorage < 0) {
			return false;
		} else {
			this.freeStorage = newStorage;
			return true;
		}
	}
}
