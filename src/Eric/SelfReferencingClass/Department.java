package Eric.SelfReferencingClass;

import java.util.ArrayList;
import java.util.List;

class Department {

    private String manager;
    private String department;
    private List<Department> childDepartment;
    private Department parentDepartment;
    private ArrayList employees;

    // constructor with employees
    public Department(String manager, String department, Department parentDepartment, ArrayList employees) {

        this.manager = manager;
        this.department = department;
        this.parentDepartment = parentDepartment;
        this.childDepartment = new ArrayList<>();
        this.employees = new ArrayList<>();

        if (parentDepartment != null) {
            parentDepartment.childDepartment.add(this);
        }
        if (employees != null) {
            for (Object employee : employees) {
                this.employees.add(employee);
            }
        }
    }

    // simple constructor
    public Department(String manager, String department) {
        this(manager, department, null, null);
    }

    // constructor with base info
    public Department(String manager, String department, Department parentDepartment) {
        this.manager = manager;
        this.department = department;
        this.parentDepartment = parentDepartment;
        this.childDepartment = new ArrayList<>();
        this.employees = new ArrayList<>();

        if (parentDepartment != null) {
            parentDepartment.childDepartment.add(this);
        }
    }

    public void switchEmployees(String employee, Department newDepartment) {
        this.employees.remove(employee);
        newDepartment.employees.add(employee);
    }

    public void switchDepartment(Department department) {
        if (parentDepartment != null) {
            parentDepartment.childDepartment.remove(this);
        }
        parentDepartment = department;
        department.childDepartment.add(this);
    }

    public void removeDepartment() {
        this.department = null;
    }

    @Override
    public String toString() {
        return department + ", " + manager + " " + employees.toString();
    }

    // childDepartment.forEach(c -> c.printOrganisation(intend, prefix, level + 1));
    public void printOrganisation(String intend, String prefix, int level) {
        System.out.println(intend.repeat(level) + prefix + this.toString());

        for (Department department : childDepartment) {
            if (department.department != null) {
                department.printOrganisation(intend, prefix, level + 1);
            }
        }
    }
}
