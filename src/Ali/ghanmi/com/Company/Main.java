package Ali.ghanmi.com.Company;

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
        Departement service = new Departement("Peterson", "service");
        Departement buchhaltung = new Departement("Schmid", "buchhaltung");

        Employee Empl1 = new Employee("Hans Peter", purchase);
        Employee Empl2 = new Employee("Hanna Kaiser", purchase);
        //  System.out.println(purchase.get);
        buchhaltung.addCurrentEmployee(Empl1);

        service.connectToDepartment(saleB2B);
        buchhaltung.connectToDepartment(direction);
        direction.printOrganisation(" ");
        //Empl1.switchDepartment(service);
        // System.out.println(direction);
    }

}
