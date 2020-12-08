package Irene.company;

public class Main {
    public static void main(String[] args) {
        Departement director = new Departement("Alfred Boss", "Director");
        Departement sales = new Departement("Mustermann Max", "Sales", director);
        Departement salesPrivate = new Departement("Musterfrau Angela", "Sales private customers", sales);
        Departement salesB2B = new Departement("Muste Alfons", "Sales company customers", sales);
        Departement purchase = new Departement("Kufmann Alois", "Purchase", director);
        Departement purchaseMechanic = new Departement("Gunz Herlinde", "Purchase mechanics", purchase);
        Departement purchaseMechanicSmall = new Departement("Friedrich Hermann", "Purchase small parts", purchaseMechanic);
        Departement purchaseMechanicBig = new Departement("Peter Hannelore", "Purchase big parts", purchaseMechanic);
        Departement purchaseMechanicBigEU = new Departement("But Moritz", "Purchase Europe", purchaseMechanicBig);
        Departement servicedesk = new Departement("Hall Dan", "Software development");

        servicedesk.connectToDepartment(director);

        director.printCompanyOrganisation("");
    }
}
