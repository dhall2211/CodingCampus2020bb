package src.com.dcv.nov.day29day30;

import java.util.Collections;
import java.util.Vector;

public class Camera {
	private String name;
	private double resolution;
	private Lens lens;
	private String countryOfOrigin;
	private Vector<String> features = new Vector<String>();
	private MemoryCard memoryCard;
	private String owner;
	private double picSize;
	
	Camera(String name, double resolution, String countryOfOrigin, String[] initFeatures) {
		this.name = name;
		this.resolution = resolution;
		this.lens = null;
		this.countryOfOrigin = countryOfOrigin;
		Collections.addAll(features, initFeatures);
		this.owner = "";
		this.picSize = this.resolution / 4.2; // just as a example
		this.memoryCard = null;
	}

	// getter --------------------------------------------------------------------------------------
	public String getName() {
		return name;
	}

	public double getResolution() {
		return resolution; 
	}

	public String getFocalLengths() {
		return lens.toString();
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public String[] getFeatures() {
		return features.toArray(new String[features.size()]);
	}

	public String getOwner() {
		return owner;
	}

	public String getProductSheet() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n-----------------------------------\n")
		  .append(this.name + "\n")
		  .append(String.format("%s %s %s%n", "Resolution:", this.resolution, "MP"))
		  .append("Current lens: " + lens.toString() + "\n");

		System.out.println("Awesome Features:");
		for (String feature : features) {
			sb.append(String.format("%-3s %-20s%n", "- ", feature));
		}
		return sb.toString();
	}

	public double getStorage() {
		return this.memoryCard.getStorage();
	}

	// setter --------------------------------------------------------------------------------------
	public void addFeature(String feature) {
		features.add(feature);
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setLens(Lens lens) {
		this.lens = lens;
	}

	public void setMemoryCard(MemoryCard memoryCard) {
		this.memoryCard = memoryCard;
	}

	public void makePicture() {
		if (this.memoryCard == null) {
			System.out.println("No memory card installed");
		}
		if (!this.memoryCard.save(this.picSize)) {
			System.out.println("Storage full");
		}
	}
}
