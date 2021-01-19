package Marcella.XmasBakery;

import java.lang.reflect.Array;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Bakery zuckerbaeckerei = new Bakery("Die Zuckerbäckerei");

        // Employees --------------------------------------------------------------------------------------
        Employee hans = new Employee(zuckerbaeckerei, "Hans", "Vanillekipferl", 50);
        Employee werner = new Employee(zuckerbaeckerei, "Werner", "Zimtsterne", 30);
        Employee luise = new Employee(zuckerbaeckerei, "Luise", "Schoko-Nuss-Makronen", 20);

        // Cookies ----------------------------------------------------------------------------------------
        Cookie vanillekipferl = new Cookie(zuckerbaeckerei, "Vanillekipferl");
        Cookie zimtsterne = new Cookie(zuckerbaeckerei, "Zimtsterne");
        Cookie schokoNussMakronen = new Cookie(zuckerbaeckerei, "Schoko-Nuss-Makronen");
        Cookie butterplaetzchen = new Cookie(zuckerbaeckerei, "Butterplätzchen");
        Cookie baiserringe = new Cookie(zuckerbaeckerei, "Baiserringe");

        // Customers --------------------------------------------------------------------------------------
        Customer patricia = new Customer(zuckerbaeckerei, "Patricia Ludwig", "Reichstraße 22, 6800 Feldkirch");
        Customer tom = new Customer(zuckerbaeckerei, "Tom Tennert", "Liechtensteiner Straße 38, 6800 Feldkirch");

        Order tomsOrder = new Order(zuckerbaeckerei, tom);
        OrderDescription tomsOrderDescription1 = new OrderDescription(tomsOrder,"Vanillekipferl", 5);
        OrderDescription tomsOrderDescription2 = new OrderDescription(tomsOrder,"Zimtsterne", 3);

        zuckerbaeckerei.produceCookie();

        Order patriciasOrder = new Order(zuckerbaeckerei, patricia);
        OrderDescription patriciasOrderDescription1 = new OrderDescription(patriciasOrder, "Schoko-Nuss-Makronen", 7);

        System.out.println(zuckerbaeckerei.getOrders().size());

        // zuckerbaeckerei.printStructure("   ");

    }

}
