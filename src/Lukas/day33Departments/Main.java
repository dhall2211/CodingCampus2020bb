package src.com.dcv.nov.day33;


public class Main {
	public static void main(String[] args) {
		
		Department vertrievPrivatkunden = new Department("Vertrieb Privatkunden", "Musterfrau Angela");
		Department vertriebFirmenkunden = new Department("Vertrieb Firmenkunden", "Muste Alfons");
		Department einkaufEuropa = new Department("Einkauf Europa", "But Moritz");
		Department einkaufKleinteile = new Department("Einkauf Kleinteile", "Leiter Friedrich Hermann");
		
		Department[] einkaufGrossteileSub = {einkaufEuropa};
		Department einkaufGrossteile = new Department("Einkauf Großteile", "Leiterin Peter Hannelore", einkaufGrossteileSub);
		
		Department[] einkaufMechanikSub = {einkaufKleinteile, einkaufGrossteile};
		Department einkaufMechanik = new Department("Einkauf Mechanik", "Gunz Herlinde", einkaufMechanikSub);
		
		Department[] einkaufSub = {einkaufMechanik};
		Department einkauf = new Department("Einkauf", "Kufmann Alois", einkaufSub);
		
		Department[] vertriebSub = {vertrievPrivatkunden, vertriebFirmenkunden};
		Department vertrieb  = new Department("Vertrieb", "Mustermann Max", vertriebSub);

		Department[] vorstandSub = {vertrieb, einkauf};
		Department vorstand = new Department("Vorstand", "Alfred Boss", vorstandSub);
		
		System.out.println(vorstand.toString());
	}
}
