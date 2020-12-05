package Lukas.day33Departments;

import java.util.Vector;

public class Departement {
	private String depName;
	private String boss;
	private Departement topDepartement;
	private Vector<Departement> subDepartement;
	
	Departement(String depName, String boss, Departement topDepartement) {
		this.depName = depName;
		this.boss = boss;
		this.topDepartement = topDepartement;
		subDepartement = new Vector<>();

        if (topDepartement != null){
            topDepartement.subDepartement.add(this);
        }
	}

	public Departement(String depName, String boss) {
        this(depName, boss, null);
	}
	
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
}
