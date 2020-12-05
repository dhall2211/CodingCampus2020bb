package Lukas.day33Departments;


public class Main {
	public static void main(String[] args) {
		
		Departement vorstand = new Departement("Vorstand", "Alfred Boss");
		Departement vertrieb  = new Departement("Vertrieb", "Mustermann Max", vorstand);
		Departement vertriebPrivatkunden = new Departement("Vertrieb Privatkunden", "Musterfrau Angela", vertrieb);
		Departement vertriebFirmenkunden = new Departement("Vertrieb Firmenkunden", "Muste Alfons", vertrieb);
		Departement einkauf = new Departement("Einkauf", "Kufmann Alois", vorstand);
		Departement einkaufMechanik = new Departement("Einkauf Mechanik", "Gunz Herlinde", einkauf);
		Departement einkaufKleinteile = new Departement("Einkauf Kleinteile", "Leiter Friedrich Hermann", einkaufMechanik);
		Departement einkaufGrossteile = new Departement("Einkauf Großteile", "Leiterin Peter Hannelore", einkaufMechanik);
		Departement einkaufEuropa = new Departement("Einkauf Europa", "But Moritz", einkaufGrossteile);

		System.out.println(vorstand.getOrganigram());
		System.out.println("------------------------------");

		Staff s1 = new Staff("Ignatz", einkaufEuropa);
		Staff s2 = new Staff("Jürgen", einkaufEuropa);

		System.out.println("Staff in einkaufEuropa: " + einkaufEuropa.getStaff());
	}
}
