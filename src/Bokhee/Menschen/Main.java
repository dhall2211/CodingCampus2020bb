package Bokhee.Menschen;

public class Main {
    public static void main(String[] args) {
        Mensch m = new Mensch("Bokhee", "Kim", 2000, "Seoul", 'F');
        Mensch m1 = new Mensch("Dani", "Muehler", 2010, "St.Gallen", 'M');
        Mensch et = new Mensch("E.T", "aus der Weltall", 1111, "Platen X", 'X');


        //printMensch(m);
        System.out.println(m);
        System.out.println(m1);
        System.out.println(et);

    }



    /*public static void printMensch(Mensch mensch) {
        System.out.printf("%-10s %-10s %6d %10s %2c%n",
                mensch.getVorname(),
                mensch.getNachname(),
                mensch.getGeburtsjahr(),
                mensch.getGeburtsort(),
                mensch.getGeschlecht());
    }*/
}
