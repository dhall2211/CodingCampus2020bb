package src.com.dcv.nov.day29day30;

public class Lens {

	private String name;
	private int minFocalLength;
	private int maxFocalLength;	
	
	public Lens(String name, int minFocalLength, int maxFocalLength) {
		this.name = name;
		if (isValidFocalLengths(minFocalLength, maxFocalLength)) {
			this.minFocalLength = minFocalLength;
			this.maxFocalLength = maxFocalLength;
		} else {
			System.out.println("Error: min Focal length must be smaller than max Focal length");
		}
	}

	public String getName() {
		return this.name;
	}

	public double getMinFocalLength() {
		return this.minFocalLength;
	}

	public int getMaxFocalLength() {
		return this.maxFocalLength;
	}

	private boolean isValidFocalLengths(int min, int max) {
		return (min < max) ? true : false;
	}

	@Override
	public String toString() {
		return String.format("%s, %dmm - %dmm", name, minFocalLength, maxFocalLength);
	}
}
