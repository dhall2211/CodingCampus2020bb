package Dan.OOP.CodingCampus.course;

import Dan.OOP.CodingCampus.course.*;

public class CourseMain {

    public static void main(String[] args) {
        Building ak  = new Building("Arbeiterkammer Feldkirch");
        Room room = new Room (ak, 'C', 3,4);

        Course codingCampus = new Course("Coding Campus", room);

        PersonTwo DG = new Trainer("Daniel", "Greas");

        System.out.println(DG.firstName + DG.lastName);


    }
}
