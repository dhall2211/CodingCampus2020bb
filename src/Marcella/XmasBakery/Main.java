package Marcella.XmasBakery;

public class Main {

    public static void main(String[] args) {

        Bakery zuckerbaeckerei = new Bakery("Die Zuckerbäckerei");

        Employee hans = new Employee(zuckerbaeckerei, "Hans", "Vanillekipferl");
        Employee werner = new Employee(zuckerbaeckerei, "Werner", "Zimtsterne");
        Employee luise = new Employee(zuckerbaeckerei, "Luise", "Schoko-Nuss-Makronen");

        Cookie vanillekipferl = new Cookie(zuckerbaeckerei, "Vanillekipferl");
        Cookie zimtsterne = new Cookie(zuckerbaeckerei, "Zimtsterne");
        Cookie schokoNussMakronen = new Cookie(zuckerbaeckerei, "Schoko-Nuss-Makronen");
        Cookie butterplaetzchen = new Cookie(zuckerbaeckerei, "Butterplätzchen");
        Cookie baiserringe = new Cookie(zuckerbaeckerei, "Baiserringe");

        Customer patricia = new Customer(zuckerbaeckerei, "Patricia", "Reichstraße 22, 6800 Feldkirch");
        Customer tom = new Customer(zuckerbaeckerei, "Tom", "Liechtensteiner Straße 38, 6800 Feldkirch");

        zuckerbaeckerei.printStructure("   ");

    }

}
