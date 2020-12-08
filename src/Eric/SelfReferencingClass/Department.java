package Eric.SelfReferencingClass;

import java.util.ArrayList;
import java.util.List;

class Department {

    private final String manager;
    private final String department;
    private Department parentDepartment;
    private final List<Department> childDepartment;

    public Department(String manager, String department, Department parentDepartment) {

        this.manager = manager;
        this.department = department;
        this.parentDepartment = parentDepartment;
        this.childDepartment = new ArrayList<>();

        if (parentDepartment != null) {
            parentDepartment.childDepartment.add(this);
        }
    }

    public Department(String manager, String department) {
        this(manager, department, null);
    }

    public void switchDepartment(Department parent) {
        if (parentDepartment != null) {
            parentDepartment.childDepartment.remove(this);
        }
        parentDepartment = parent;
        parent.childDepartment.add(this);
    }

    @Override
    public String toString() {
        return department + ", " + manager;
    }

    public void printOrganisation(String intend, String prefix, int level) {
        System.out.println(intend.repeat(level) + prefix + this.toString());
        childDepartment.forEach(c -> c.printOrganisation(intend, prefix, level + 1));
    }
}
