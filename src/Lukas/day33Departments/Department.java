package src.com.dcv.nov.day33;

public class Department {
	String depName;
	String boss;
	Department[] subDepartment;
	
	Department(String depName, String boss, Department[] subDepartment) {
		this.depName = depName;
		this.boss = boss;
		this.subDepartment = subDepartment;
	}

	Department(String depName, String boss) {
		this.depName = depName;
		this.boss = boss;
	}

	@Override
	public String toString() {
		return toString(0);
	}

	public String toString(int identation) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < identation; i++) {
			sb.append(" ");
		}

		sb.append(depName + " : " + boss + "\n");

		if (this.subDepartment != null) {
			for (Department dep : this.subDepartment) {
				sb.append(dep.toString(identation + 2));
			}
		}

		return sb.toString();
	}
}
