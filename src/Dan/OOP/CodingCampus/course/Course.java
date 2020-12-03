package Dan.OOP.CodingCampus.course;

import Lukas.day30CodingCampusObject.Participant;
import Lukas.day30CodingCampusObject.Trainer;

import java.util.Vector;

public class Course {
    private String name;
    private Room room;
    private Vector <Participant> participants = new Vector<Participant>();
    private Vector <Trainer> trainers = new Vector <Trainer>();

    Course (String name, Room room) {
        this.name = name;
        this.room = room;

    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", room=" + room +
                ", participants=" + participants +
                ", trainers=" + trainers +
                '}';
    }
    private String particpantsToString (Vector<Participant> particpants){
        String p =  "";

        for (Participant participant: particpants) {
            p += participant.getName() + " ";

        }
        return p;


    }

    private String trainerToString(Vector<Trainer> trainers) {
        String t = "";

        for(Trainer trainer : trainers) {
            t += trainer.getName() + " ";
        }
        return t;
    }

    public void setTrainers(Vector<Trainer> trainers) {
        this.trainers = trainers;
    }

    public void setParticipants(Vector<Participant> participants) {
        this.participants = participants;
    }
}

