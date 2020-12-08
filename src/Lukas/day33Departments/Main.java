package Lukas.day33Departments;


public class Main {
	public static void main(String[] args) {
		
		// #1 print Organigramm
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
		
		// #2 track employees
		Staff s1 = new Staff("Ignatz", einkaufEuropa);
		Staff s2 = new Staff("Jürgen", einkaufEuropa);
		Staff s3 = new Staff("Klaus", null);
		
		System.out.println("Staff in einkaufEuropa: " + einkaufEuropa.getStaff());
		
		// #3 switch employees
		einkaufEuropa.switchToDepartment(s1);
		einkaufEuropa.switchToDepartment(s3);
		einkaufKleinteile.switchToDepartment(s3);
		System.out.println("Staff in einkaufEuropa: " + einkaufEuropa.getStaff());
		System.out.println("Staff in einkaufKleinteile: " + einkaufKleinteile.getStaff());
	}
}
