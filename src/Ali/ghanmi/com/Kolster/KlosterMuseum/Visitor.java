package Ali.ghanmi.com.Kolster.KlosterMuseum;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class Visitor {
    private String name;
    private String city;
    private int age;
    private Vector<Room> rooms;

    public Visitor(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.rooms = new Vector<>();

    }


    public static void addVisitor(){

}


    @Override
    public String toString() {
        return "Visitor: " + " name: " + name +
                ", city: " + city + ", age: " + age + "\n";
    }

}


