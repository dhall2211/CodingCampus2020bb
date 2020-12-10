package Eric.selfReferencingClass;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // employees list for sale
        ArrayList saleEmployees = new ArrayList<>();
        saleEmployees.add("Irene");
        saleEmployees.add("Mihael");

        // emplyees list for service
        ArrayList purchaseEmployees = new ArrayList<>();
        purchaseEmployees.add("Eric");
        purchaseEmployees.add("Irene");


        Department direction = new Department("Alfred Boss", "Vorstand");
        Department sale = new Department("Mustermann Max", "Vertrieb", direction, saleEmployees);
        Department salePrivat = new Department("Musterfrau Angela", "Vertrieb Privatkunden", sale);
        Department saleB2B = new Department("Muste Alfons", "Vertrieb Firmenkunden", sale);
        Department purchase = new Department("Kufmann Alois", "Einkauf", direction);
        Department purchaseMechanic = new Department("Gunz Herlinde", "Einkauf Mechanik", purchase, purchaseEmployees);
        Department purchaseMechanicSmall = new Department("Friedrich Hermann", "Einkauf Kleinteile", purchaseMechanic);
        Department purchaseMechanicBig = new Department("Peter Hannelore", "Einkauf Großteile", purchaseMechanic);
        Department purchaseMechanicBigEU = new Department("But Moritz", "Einkauf Europa", purchaseMechanicBig);
        Department service = new Department("Gyula H", "Service");

        service.switchDepartment(saleB2B);
        service.switchDepartment(purchase);

        service.removeDepartment();

        sale.switchEmployees("Mihael", purchaseMechanicBigEU);

        purchaseMechanicBigEU.switchDepartment(direction);
         direction.printOrganisation(" ", "- ", 1);

    }
}






