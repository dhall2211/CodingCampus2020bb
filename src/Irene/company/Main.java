package Irene.company;

import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // employees list for sale
        ArrayList saleEmployees = new ArrayList();
        saleEmployees.add("Irene");
        saleEmployees.add("Mihael");

        // emplyees list for service
        ArrayList purchaseEmployees = new ArrayList();
        purchaseEmployees.add("Eric");
        purchaseEmployees.add("Marcella");

        Departement director = new Departement("Alfred Boss", "Director");
        Departement sales = new Departement("Mustermann Max", "Sales", director, saleEmployees);
        Departement salesPrivate = new Departement("Musterfrau Angela", "Sales private customers", sales);
        Departement salesB2B = new Departement("Muste Alfons", "Sales company customers", sales);
        Departement purchase = new Departement("Kufmann Alois", "Purchase", director);
        Departement purchaseMechanic = new Departement("Gunz Herlinde", "Purchase mechanics", purchase, purchaseEmployees);
        Departement purchaseMechanicSmall = new Departement("Friedrich Hermann", "Purchase small parts", purchaseMechanic);
        Departement purchaseMechanicBig = new Departement("Peter Hannelore", "Purchase big parts", purchaseMechanic);
        Departement purchaseMechanicBigEU = new Departement("But Moritz", "Purchase Europe", purchaseMechanicBig);
        Departement serviceDesk = new Departement("Hall Dan", "Software development");

        serviceDesk.connectToDepartment(director);

        serviceDesk.switchDepartment(salesB2B);

        purchaseMechanicSmall.removeDepartment();

        sales.switchEmployees("Mihael", purchaseMechanicBigEU);

        director.printCompanyOrganisation("");
    }
}
