package src.com.dcv.nov.day29day30;


 /* Create a camera object and implement get and set methods for the values.
  * name (set / get)
  * resolution (set / get)
  * focal length (set / get)
  * country of origin (set / get)
  * functions (multiple) (set / get)
  * owner (set / get)
  * product data sheet (get) -> add values and return formatted String
  */

public class Main {
	public static void main (String[] args) {

		// Create Lens
		Lens l1 = new Lens("Big lens", 17, 30);
		Lens l2 = new Lens("Small lens", 20, 28);

		// Create Memory card
		MemoryCard m1 = new MemoryCard("SanDisk", 128.0);

		
		// Construct Cameras
		String[] cam1Features = {"Autofocus", "4K Video", "Nuclear Blast Protection"};
		Camera cam1 = new Camera("Panasonic DC-LX100M2", 20, "China", cam1Features);
		cam1.setMemoryCard(m1);
		cam1.setLens(l1);
		cam1.setOwner("Blassmoyr");

		String[] cam2Features = {"Autofocus", "Roflcopter Animation", "5x Optical Zoom"};
		Camera cam2 = new Camera("Sony Alpha 5100", 32, "Taiwan", cam2Features);
		cam2.setLens(l2);

		// Test if cam1 worked
		printCam(cam1);

		// Test if cam2 worked
		printCam(cam2);

		// Change some values in cam 1 and print product sheet:
		Lens l3 = new Lens("Ultrawide lens", 14, 25);
		cam1.setLens(l3);

		cam1.addFeature("8K Movie");
		cam1.addFeature("RAW Images");

		System.out.println(cam1.getProductSheet());

		System.out.printf("%s %.1f %s%n", "Current storage", cam1.getStorage(), "MB");
		cam1.makePicture();
		cam1.makePicture();
		System.out.printf("%s %.1f %s%n", "Current storage", cam1.getStorage(), "MB");

	}

	public static void printCam(Camera cam) {
		System.out.println("\n-----------------------------------");
		System.out.println(cam.getName() + ", " +
						   cam.getResolution() + ", " +
						   cam.getFocalLengths() + ", " +
						   cam.getCountryOfOrigin() + ", " +
						   cam.getOwner());
	
		for (String feature : cam.getFeatures()) {
			System.out.print(feature + ", ");
		}
		System.out.println();

	}
}
