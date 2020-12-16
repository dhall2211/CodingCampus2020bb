package Lukas.day35ZooFactoryPattern;

public class Palaeontologist {
	/* someone who studies fossils as a way of getting information about the
	 * history of life on Earth.
	 */
	
	 private String name;

	 protected Palaeontologist(String name) {
		 this.name = name;
	 }

	 public String getName() {
		 return name;
	 }
}
