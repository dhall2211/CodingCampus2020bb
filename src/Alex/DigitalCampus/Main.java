package Alex.DigitalCampus;

public class Main {
    /***
     * Der DigitalCampus soll objektorientiert modelliert und anschließend der aktuelle Kurs abgebildet werden:
     *
     * Gebäude
     * Räume
     * Kurse
     * Trainer
     * Studenten
     * Starte mit einem Klassendiagramm mit den entsprechenden Attributen,
     * Methoden und Assoziationen. Setze anschließend den aktuellen Kurs in Java um.
     * Ziel soll sein, den Kurs ausgeben (.toString()) zu können mit allen Informationen.
     */

    /***
     * Übung DigitalCampus - Erweiterung
     * Die Kursleitung würde gerne Weihnachtskarten an alle Kursteilnehmer und Trainer
     * versenden. Dazu benötigen sie eine Liste von den Adressen (Vorname,
     * Nachname, Straße, Hausnummer, Postleitzahl, Wohnort, Land).
     * Im Objekt des Kurses soll eine Methode saveAddress(String filename) umgesetzt
     * werden, welche die Adressen aller Teilnehmer und Trainer in einem CSV
     * speichert.
     * Dazu soll mittels Vererbung eine allgemeine Klasse für Personen erstellt werden,
     * welche die Personendaten beinhaltet
     */


    public static void main(String[] args) {
        Person[] personen = new Person[]{
                new Person("Ali", "Ila", "Tariq", "1", "1111", "Paris", "Frankreich"),
                new Person("Bokhee", "Eehkob", "Dolo", "2", "2222", "Soul", "Süd Korea"),
                new Person("Dan", "Nad", "Road", "3", "3333", "San Francisco", "USA"),
                new Person("Marcella", "Allecram", "Straße", "4", "4444", "Berlin", "Deutschland"),
                new Person("Irene", "Eneri", "Weg", "5", "5555", "Wien", "Österreich"),
                new Person("Sabrina", "Anirbas", "Strada", "6", "6666", "Neapel", "Italien"),
                new Person("Erich", "Hcire", "Vei", "7", "7777", "Prag", "Tschechien"),
                new Person("Mihael", "Leahim", "Püt", "8", "8888", "Bukarest", "Rumenien"),
                new Person("Klaus", "Sualk", "Ceste", "9", "9999", "Zagreb", "Kroatien"),
                new Person("Lukas", "Sakul", "Jalan", "10", "1234", "Porto", "Portogal"),
                new Person("Samet", "Temas", "Yol", "11", "5678", "Istanbul", "Türkei"),
                new Person("Daniel", "Leinad", "Vegur", "12", "9000", "Kapstadt", "Süd Africa"),
                new Person("Gyula", "Aluyg", "üt", "13", "9123", "Budapest", "Ungarn"),

        };

        Building building = new Building("Arbeiter Kammer");
        Room room = new Room("Raum C03 ", building);
        Kurs fkBb = new Kurs("Feldkirch Abendkurs Berufsbegleitend 2020", room, personen);

        System.out.println(fkBb);

    }
}
