package Lukas.day34Zoo;

import java.util.Vector;

public class Zoo {
	private String name;
	private String chairman;
	private Vector<Enclosure> enclosures;

	public Zoo(String name, String chairman) {
		this.name = name;
		this.chairman = chairman;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("zoo name: ").append(name).append("\n");
		
		if (enclosures != null) {
			for (Enclosure enclosure : enclosures) {
				sb.append(enclosure.toString());
			}
		}
		return sb.toString();
	}
	
	public void addEnclosure(Enclosure e) {
		if (enclosures == null) {
			enclosures = new Vector<>();
		}
		enclosures.add(e);
	}

}
