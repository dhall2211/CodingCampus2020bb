package Bokhee.KlosterMuseum;

import java.util.GregorianCalendar;

public class Visitor {
    private String name;
    private int age;
    private String address;

    public Visitor(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Visitor(String name) {
        this.name = name;
        this.age = 0;
        this.address = "";
    }

    public void appreciate(Art art){
        System.out.println(this.name + "appreciate " + art.getTitleOfArt());
    }

    public void stroll(ExhibitionRoom room) {
        System.out.println(this.name + " strolls first in to the " + room.getName()+".");
    }

    public void leaveForHome(){
        System.out.println(this.name + " leave the exhibition Room ");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
