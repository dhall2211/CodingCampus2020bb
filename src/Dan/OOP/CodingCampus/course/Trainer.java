package Dan.OOP.CodingCampus.course;

import Dan.OOP.CodingCampus.course.PersonTwo;

public class Trainer extends PersonTwo {
    private  String trainerFirstName;
    private  String trainerLastName;
    private String name;

    Trainer (String trainerFirstName, String trainerLastName) {
        this.trainerFirstName = trainerFirstName;
        this.trainerLastName = trainerLastName;

    }



    public String getName() {
        return name;
    }

    public void getFirstName() {
        super.firstName = trainerFirstName;

    }
    public void getLastName() {
        super.lastName = trainerLastName;

    }
}

