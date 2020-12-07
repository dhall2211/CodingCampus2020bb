package Lukas.day33Departments;

import java.util.Vector;

public class Departement {
	private String depName;
	private String boss;
	private Departement topDepartement;
	private Vector<Departement> subDepartement;
	private Vector<Staff> staff;
	
	Departement(String depName, String boss, Departement topDepartement) {
		this.depName = depName;
		this.boss = boss;
		this.topDepartement = topDepartement;
		this.subDepartement = new Vector<>();
		this.staff = new Vector<>();

        if (topDepartement != null){
            topDepartement.subDepartement.add(this);
        }
	}

	public Departement(String depName, String boss) {
        this(depName, boss, null);
	}
	
	// getter --------------------------------------------------------------------------------------
	public String getOrganigram() {
		return getOrganigram(0);
	}

	public String getOrganigram(int indentation) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < indentation; i++) {
			sb.append(" ");
		}

		sb.append("L ").append(depName).append(" ").append(boss).append("\n");

		if (this.subDepartement != null) {
			for (int dep = 0; dep < subDepartement.size(); dep++) {
				sb.append(subDepartement.get(dep).getOrganigram(indentation + 2));
			}
		}
		return sb.toString();
	}

	public String getStaff() {
		StringBuilder sb = new StringBuilder();
		
		if (this.staff != null) {
			for (Staff s : this.staff) {
				sb.append(s.getName()).append(", ");
			}
		}
		return sb.toString();
	}

	// setter --------------------------------------------------------------------------------------
	public void setStaff(Staff s) {
		staff.add(s);
	}
}
