package Marcella.Company2;

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
        Departement service = new Departement("Gyula H", "Service");

        Employees E1 = new Employees("Kühne Bertram", sale);
        Employees E2 = new Employees("Mathis Elfriede", sale);
        Employees E3 = new Employees("Janis Otto", purchaseMechanicBig);

        service.connectToDepartment(saleB2B);
        sale.addCurrentEmployees(E1);
        sale.addCurrentEmployees(E2);
        purchaseMechanicBig.addCurrentEmployees(E3);
        direction.printOrganisation("");
    }

}
