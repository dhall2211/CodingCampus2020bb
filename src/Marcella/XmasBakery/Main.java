package Marcella.XmasBakery;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        Bakery zuckerbaeckerei = new Bakery("Die Zuckerbäckerei");

        // Employees --------------------------------------------------------------------------------------
        Employee hans = new Employee(zuckerbaeckerei, "Hans", "Vanillekipferl");
        Employee werner = new Employee(zuckerbaeckerei, "Werner", "Zimtsterne");
        Employee luise = new Employee(zuckerbaeckerei, "Luise", "Schoko-Nuss-Makronen");

        // Cookies ----------------------------------------------------------------------------------------
        Cookie vanillekipferl = new Cookie(zuckerbaeckerei, "Vanillekipferl");
        Cookie zimtsterne = new Cookie(zuckerbaeckerei, "Zimtsterne");
        Cookie schokoNussMakronen = new Cookie(zuckerbaeckerei, "Schoko-Nuss-Makronen");
        Cookie butterplaetzchen = new Cookie(zuckerbaeckerei, "Butterplätzchen");
        Cookie baiserringe = new Cookie(zuckerbaeckerei, "Baiserringe");

        // Customers --------------------------------------------------------------------------------------
        Customer patricia = new Customer(zuckerbaeckerei, "Patricia Ludwig", "Reichstraße 22, 6800 Feldkirch");
        Customer tom = new Customer(zuckerbaeckerei, "Tom Tennert", "Liechtensteiner Straße 38, 6800 Feldkirch");

        OrderDescription tomsOrder = new OrderDescription(tom, new String[][] {{"Vanillekipferl", "5"}, {"Zimtsterne", "3"}});

        zuckerbaeckerei.printStructure("   ");

    }

}
