package Daniel.Association;

import java.util.Vector;

public class EducationInstitute {
    private String name;
    private Vector<Course> courses;

    public EducationInstitute(String name) {
        this.name = name;
        this.courses = new Vector<>();
    }

    public void printCourses(){
        for (var course : courses) {
            System.out.println(course);
        }
    }
}
