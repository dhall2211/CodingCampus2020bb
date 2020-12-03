package ghanmi.com.people;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        People per1 = new People("Alex", "Ghanmi", 1966, "Tunesien", 'm');
        People per2 = new People("Samet", "Arslan", 1994, "Bregenz", 'm');
        People per3 = new People("Irene", "Knap", 1989, "Bludenz", 'w');

        printPeople(per1);
        printPeople(per2);
        printPeople(per3);

        System.out.println(per1);
        if(per1.equals(per2)){
            System.out.println("sie tragen den gleiche name und am gleiche Jahr geboren");
        }else{
            System.out.println("Leider nein");
        }


        System.out.println(per1.getGeburtsjahr() +" "+ per2.getGeburtsjahr());

    }

    public static void printPeople(People people) {
        System.out.printf("%-10s %-10s %-10d %-10s %-10s%n", people.getVorname(), people.getNachname(), people.getGeburtsjahr(), people.getGeburtsort(), people.getGeschlecht());
    }
}
