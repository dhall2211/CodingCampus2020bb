package Lukas.day33Departments;

public class Staff {
	private String name;
	private Departement currDepartement;

	public Staff(String name, Departement currDepartement) {
		this.name = name;
		this.currDepartement = currDepartement;
		if (currDepartement != null) {
			currDepartement.switchToDepartment(this);
		}
	}

	public String getName() {
		return this.name;
	}

	public Departement getDepartment() {
		return this.currDepartement;
	}
}
