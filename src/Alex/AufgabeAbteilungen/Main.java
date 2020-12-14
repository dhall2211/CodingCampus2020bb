package Alex.AufgabeAbteilungen;

import Gyula.Company.Departement;

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

        Departement direction = new Departement("Alfred Boss", "Vorstand");
        Departement sale = new Departement("Mustermann Max", "Vertrieb", direction);
        Departement salePrivat = new Departement("Musterfrau Angela", "Vertrieb Privatkunden", sale);
        Departement saleB2B = new Departement("Muste Alfons", "Vertrieb Firmenkunden", sale);
        Departement purchase = new Departement("Kufmann Alois", "Einkauf", direction);
        Departement purchaseMechanic = new Departement("Gunz Herlinde", "Einkauf Mechanik", purchase);
        Departement purchaseMechanicSmall = new Departement("Friedrich Hermann", "Einkauf Kleinteile", purchaseMechanic);
        Departement purchaseMechanicBig = new Departement("Peter Hannelore", "Einkauf Großteile", purchaseMechanic);
        Departement purchaseMechanicBigEU = new Departement("But Moritz", "Einkauf Europa", purchaseMechanicBig);

        direction.printOrganisation("");
    }
}
