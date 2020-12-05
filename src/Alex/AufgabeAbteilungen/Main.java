package Alex.AufgabeAbteilungen;

/***
 * Versucht folgendes Diagramm mit Objekten abzubilden:
 *         Vorstand (Alfred Boss)
 *         |
 *         Vertrieb (Leiter Mustermann Max)
 *         |
 *         Vertrieb Privatkunden (Leiterin Musterfrau Angela)
 *         Vertrieb Firmenkunden (Leiter Muste Alfons)
 *         |
 *         Einkauf (Leiter Kufmann Alois)
 *         |
 *         Einkauf Mechanik (Leiterin Gunz Herlinde)
 *         |
 *         Einkauf Kleinteile (Leiter Friedrich Hermann)
 *         Einkauf Großteile (Leiterin Peter Hannelore)
 *         |
 *         Einkauf Europa (Leiter But Moritz)
 *
 *         Die “Abteilungen” Vorstand, Vertrieb, … sollten in Abteilungsobjekte abgelegt werde,
 *         jeder dieser Abteilung kann ein Leiter zugeordnet werden (Personen Objekt).
 *         Am Ende sollte in unserer Konsole ein Output ähnlich dem linken dargestellt werden. (nur schöner ;))
 *         Zusatz: Füllt die Abteilung mit Mitarbeitern und lasst die Mitarbeiter Abteilungen switchen
 *         z.B. Abteilung.switch(person, Zielabteilung).
 *         Die Abteilung soll eine Eigenschaft besitzen, welche die Mitarbeiteranzahl speichert
 */

public class Main {
    public static void main(String[] args) {
       // Person vorstand = new Person("Alfred Boss", "Vorstand.");
       // Person vertrieb = new Person("Mustermann Max", "Vertriebs Leiter.");
        Person vertriebPrivatkunden = new Person("Musterfrau Angela", "Vertriebs Leiterin Privatkunden.");
        Person vertriebFirmenkunden = new Person("Muste Alfons", "Vertrieb Leiter Firmenkunden.");
        Person einkauf = new Person("Kufmann Alois", "Einkaufs Leiter.");
        Person einkaufMechanik = new Person("Gunz Herlinde", "Einkaufs Leiterin Abteilung Mechanik.");
        Person einkaufKleinteile = new Person("Friedrich Hermann", "Einkaufs Leiter Abteilung Kleinteile.");
        Person einkaufGroßteile = new Person("Peter Hannelor", "Einkaufs Leiter Abteilung Großteile.");
        Person einkaufEuropa = new Person("But Moritz", "Einkauf Europa.");

        Abteilung vorstand =new Abteilung("Vorstand");
        Abteilung vertrieb =new Abteilung("Vertrieb");


        System.out.println(vorstand);
        System.out.println(vertrieb);
        System.out.println(vertriebPrivatkunden);
        System.out.println(vertriebFirmenkunden);
        System.out.println(einkauf);
        System.out.println(einkaufMechanik);
        System.out.println(einkaufKleinteile);
        System.out.println(einkaufGroßteile);
        System.out.println(einkaufEuropa);

    }
}
