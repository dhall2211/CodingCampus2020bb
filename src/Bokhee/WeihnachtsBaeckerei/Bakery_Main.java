package Bokhee.WeihnachtsBaeckerei;

//1. Weihnachtbäckerei hat Mitarbeiter und bestimmte Keksesorte.
//2. Jeder Mitarbeiter kann gewisse Kekse backen und hat Lieblingssorte.
//3. Kunden soll selber registrieren mit den Namen und der Adresse.
//4. Kunden stellt die Bestellung: Position, Keksename, Menge
//5. Produktion : jeder Mitarbeiter stellt seine Lieblingskekse her so weit das möglich ist.
//6. Wird die tägliche Keks-Kapazität erreicht, übernimmt ein anderer Mitarbeiter die Bestellposition.
//7. Am Ende des Tages sollen die bereits produzierten Bestellungen ausgeliefert werden.
// Die selben Mitarbeiter übernimmt die Auslieferung.
// Dabei gibt es auch maximale Ausliefer-Kapazität.

public class Bakery_Main {
    public static void main(String[] args) {


        Bakery yellowBakery = new Bakery("YellowBakery");
        Bakery pinkBakery = new Bakery("PinkBakery");

        Customer a1 = new Customer("Mimi", "Widnau");
        Customer b1 = new Customer("Nana","St.Gallen");
        System.out.println(a1.toString());

     //   yellowBakery.searchAndRegisterNewCustomer("Lara","Rebstein");
        System.out.println(yellowBakery.toString());

        Cookie mandelgipfel = new Cookie("Mandelgipfel",50);
        Cookie vanilstange = new Cookie("Vanilstange",150);
        Cookie zwetzigentasche = new Cookie("Zwetzigentasche",160);
        Cookie praline = new Cookie("Praline",30);
        Cookie erdbeerentortli = new Cookie("Erdbeeren Torteli",200);
        Cookie schwarzwaldkuchen = new Cookie("Schwarzwald Kuchen",170);

        Employee franz = new Employee("Franz","Mandelgipfel",10);
        Employee luca = new Employee("Luca","Vanilstange",15);
        Employee speiderman = new Employee("Speiderman","Praline",35);
    yellowBakery.printEmployeeList();

      //  Order o1 = new Order(a1,mandelgipfel,vanilstange,praline);

//        Employee franz = new Employee("Franz", "Croassant", 2000);
//        produceFavoritCookie();
//        produceOtherCookie();
//        printToString();
//
//
//        produce();
//        collectCookies();
//        sortOutCookies();
//        compareQty();
//        assignBaking();
//        deliver(DeliveryDate, Position, CookieName, Portion, CustomerName, CustomerAdress);
//        printToString();


    }

}
