package Daniel.Association;

public class Course {
    private String name;
    private EducationInstitute educationInstitute;
    private Room room;

    public Course(String name, EducationInstitute educationInstitute) {
        this.name = name;
        this.educationInstitute = educationInstitute;
    }

    public void printLocation(){
        System.out.println(room);
    }

    @Override
    public String toString(){
        return name;
    }
}
