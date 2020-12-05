package Lukas.day33Departments;

public class Staff {
	private String name;
	private Departement currDepartement;

	Staff(String name, Departement currDepartement) {
		this.name = name;
		this.currDepartement = currDepartement;
		currDepartement.setStaff(this);
	}

	public String getName() {
		return this.name;
	}
}
