package Bokhee.Menschen;

public class Main {
    public static void main(String[] args) {
        Mensch m = new Mensch("Bokhee", "Kim", 2000, "Seoul", 'F');
        Mensch m1 = new Mensch("Dani", "Muehler", 2010, "St.Gallen", 'M');
        Mensch et = new Mensch("E.T", "aus der Weltall", 1111, "Planeten X", 'X');

        printMensch(m);
        printMensch(m1);
        printMensch(et);
        System.out.println();

        // toString(), equals(), getClass()
        System.out.println(m);
        System.out.println(m1);
        System.out.println(et);
        if (m.equals(m1)) {
            System.out.println("die sind identisch");
        } else {
            System.out.println("die sind unterschiedlich");
        }
        System.out.println();
        System.out.println(m.getClass().getName());
        System.out.println(m.getClass().getSimpleName());
    }

    public static void printMensch(Mensch mensch) {

        System.out.printf("|%-10s| %-20s | %7d | %10s | %2c|%n",
                mensch.getVorname(),
                mensch.getNachname(),
                mensch.getGeburtsjahr(),
                mensch.getGeburtsort(),
                mensch.getGeschlecht());
    }
}
