package Alex.DigitalCampus;

import java.util.Arrays;

public class Kurs {

    private String name;
    private Room room;
    //private Trainer[] trainers;
    private Person[] personen;

    public Kurs(String name, Room room, Person[] personen) {
        this.name = name;
        this.room = room;
        // this.trainers = trainers;
        this.personen = personen;
    }

    @Override
    public String toString() {
        return   "Standort: " + this.room + "\n"
                +this.name + "\n" +
                "Teilnehmer: " + "\n" + Arrays.toString(this.personen);
    }
}
