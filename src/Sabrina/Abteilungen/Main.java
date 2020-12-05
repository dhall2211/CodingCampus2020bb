package Sabrina.Abteilungen;

public class Main {
    public static void main(String[] args) {
        Abteilung vorstand = new Abteilung ("Vorstand", "Alfred Boss", null);
        Abteilung vertrieb = new Abteilung("Vertrieb", "Max Mustermann", vorstand);
        Abteilung privatkunden = new Abteilung("Privatkunden", "Angela Musterfrau", vertrieb);
        Abteilung firmenkunden = new Abteilung("Firmenkunden", "Alfons Muste", vertrieb);
        Abteilung einkauf = new Abteilung("Einkauf", "Alois Kufmann", vorstand);
        Abteilung mechanik = new Abteilung("Mechanik", "Herlinde Gunz", einkauf);
        Abteilung kleinteile = new Abteilung("Kleinteile", "Friedrich Hermann", mechanik);
        Abteilung grossteile = new Abteilung ("Grossteile", "Hannelore Peter", mechanik);
        Abteilung europa = new Abteilung("Europa", "But Moritz",grossteile);

        vorstand.printOrganisation(" ");


    }
}
