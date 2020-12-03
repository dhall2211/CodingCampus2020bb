package Daniel.Course;

import java.util.Arrays;

public class Course {
    private String name;
    private Room room;
    private Trainer[] trainers;
    private Student[] students;

    public Course(String name, Room room, Trainer[] trainers, Student[] students) {
        this.name = name;
        this.room = room;
        this.trainers = trainers;
        this.students = students;
    }

    @Override
    public String toString() {
        return this.name + "\n" +
                "Ort: " + this.room + "\n" +
                "Trainer: " + Arrays.toString(this.trainers) + "\n" +
                "Teilnehmer: " + Arrays.toString(this.students);
    }
}
