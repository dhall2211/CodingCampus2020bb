package Irene.people;

public class Main {
    public static void main(String[] args) {
        People per1 = new People("Ali", "Ghanmi", 1966, "Tunesien", 'm');
        People per2 = new People("Samet", "Arslan", 1994, "Bregenz", 'm');
        People per3 = new People("Irene", "Knap", 1989, "Bludenz", 'w');

        printPeople(per1);
        printPeople(per2);
        printPeople(per3);

        System.out.println();

        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);

        System.out.println();

        if (per1.equals(per2)){
            System.out.println("Person 1 und Person 2 haben das gleiche Geschlecht.");
        } else {
            System.out.println("Person 1 und Person 2 haben unterschiedliche Geschlechter.");
        }
        if (per2.equals(per3)){
            System.out.println("Person 2 und Person 3 haben das gleiche Geschlecht.");
        } else {
            System.out.println("Person 2 und Person 3 haben unterschiedliche Geschlechter.");
        }

        System.out.println();

        if (per1.equals2(per2)){
            System.out.println("Person 1 und Person 2 wurden im gleichen Jahr geboren.");
        } else {
            System.out.println("Person 1 und Person 2 wurden nicht im gleichen Jahr geboren.");
        }
        if (per2.equals2(per3)){
            System.out.println("Person 2 und Person 3 wurden im gleichen Jahr geboren.");
        } else {
            System.out.println("Person 2 und Person 3 wurden nicht im gleichen Jahr geboren.");
        }

        System.out.println();

        if (per1.equals3(per2)){
            System.out.println("Person 1 und Person 2 haben den gleichen Vor- und Nachnamen.");
        } else {
            System.out.println("Person 1 und Person 2 haben nicht den gleichen Vor- und Nachnamen.");
        }
        if (per2.equals3(per3)){
            System.out.println("Person 2 und Person 3 haben den gleichen Vor- und Nachnamen.");
        } else {
            System.out.println("Person 2 und Person 3 haben nicht den gleichen Vor- und Nachnamen.");
        }
    }

    public static void printPeople(People people) {
        System.out.printf("%-10s %-10s %-10d %-10s %-10s%n", people.getVorname(), people.getNachname(), people.getGeburtsjahr(), people.getGeburtsort(), people.getGeschlecht());
    }
}
