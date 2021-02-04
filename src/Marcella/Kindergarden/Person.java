package Marcella.Kindergarden;

import java.util.Random;

public class Person { // evtl. noch Persons / Tiere als sub-superklassen anlegen und HUnd Katze Fisch als Subklassen

    protected Kindergarden kindergarden;
    protected String name;
    protected String type;

    public Person(Kindergarden kindergarden, String name, String type) {
        this.kindergarden = kindergarden;
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }
}
