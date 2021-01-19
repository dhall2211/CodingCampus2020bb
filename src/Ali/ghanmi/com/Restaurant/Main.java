package Ali.ghanmi.com.Restaurant;

public class Main {
    /*Restaurant
Ein Restaurant hat eine Anfrage für eine Software gestellt, mit der es seine Tische und
Speisekarte verwalten kann.
Treffen Gäste-Gruppen im Restaurant ein, soll anhand der Größe der Gruppe (Anzahl
Personen), der optimale (freie) Tisch im Restaurant gefunden werden.
Haben die Gäste platz genommen, erhalten sie die Speisekarte mit Getränken, Vorspeisen,
Hauptspeisen und Nachspeisen.
Von diesen Speisekarten können sie jeweils Bestellungen aufgeben, welche dann gesammelt
an die Küche gehen und dort zubereitet werden. Bestellungen werden in folgender Reihenfolge
aufgenommen:
1. Getränke
2. Vor- und Hauptspeisen
3. Nachspeisen (plus Getränke)
Sind alle Gäste an einem Tisch fertig (keine Bestellungen mehr) wird die Rechnung (gesamt) an
den Tisch gebracht und der Tisch gilt im System wieder als frei.
Aufgaben
Aufgaben 1-3 sind die Modellierung der Problemstellung, dazu gehört ein UML
Klassendiagramm, und ein Algorithmus zur optimalen Verteilung der Gäste-Gruppen.
Aufgabe 4 ist eine mögliche Erweiterung für diejenigen, die schneller fertig sind. Einige Tipps,
um die Aufgabe einfacher lösen zu können:
● Wahrscheinlichkeit kann mit Math.random() gelöst werden
○ Bsp.: 10% Wahrscheinlichkeit entspricht Math.random() <= 0.1
● Warteschlangen existieren als Programmkonstrukte und werden auch Queues
genannt
○ einlesen in das Thema Queues, vor allem Grundkonzepte FIFO und LIFO
○ können mit Vektoren abgebildet werden und haben die Standard-Operationen
Enqueue (Element zu Warteschlange hinzufügen) und Dequeue (Element aus
Warteschlange herausnehmen)
○ es existiert auch bereits eine fertige Implementierung in java.util.Queue
1. Restaurant mit Tischen
2. Gäste-Gruppen kommen an und werden auf Tische verteilt
3. Speisekarte wird an die Tische gebracht
4. Simulation, 1 Durchlauf entspricht 15min (Erweiterung, kein Muss)
a. Speisekarte um Preise erweitern
b. Restaurant, Tische und Speisekarte initialisieren
c. Gästegruppen kommen in Abständen von 15min zum Restaurant
i. bekommen einen Tisch, wenn ein passender frei ist
ii. oder warten 30min, falls noch keiner frei ist, dann gehen sie weiter
iii. werden nach Ankunftsreihenfolge auf Tische verteilt
d. Bestellungen in korrekter Reihenfolge annehmen, dabei unten stehende Tabelle
verwenden, um den Zeitpunkt und die Wahrscheinlichkeit zu bestimmen
e. das Restaurant hat von 11:00 bis 23:00 durchgehend geöffnet
Bestellung aufnehmen Wahrscheinlichkeit
1. Getränk direkt 90%
2. Vorspeise 15min 40%
3. Hauptspeise 15min 80%
4. Nachspeise 1h 15min 30%
5. Getränk 1h 15min 40%
6. Rechnnung 2h 10

     */

    public static void main(String[] args) {

        Restaurant goldenerHirsch = new Restaurant("Der goldene Hirsch");

        Product starter1 = new Product("Vorspeise", "Grüner Salat", 4.5);
        Product starter2 = new Product("Vorspeise", "Tagessuppe", 4.5);
        Product main1 = new Product("Hauptspeise", "Kässpätzle", 9.0);
        Product main2 = new Product("Hauptspeise", "Schnitzel", 10.0);
        Product dessert1 = new Product("Nachspeise", "Mousse au Chocolat", 6.0);
        Product dessert = new Product("Nachspeise", "Tiramisu", 5.5);
        Product drink1 = new Product("Getränk", "Wasser", 2.5);
        Product drink2 = new Product("Getränk", "Wein", 3.5);
        Product drink3 = new Product("Getränk", "Kaffee", 2.5);

        goldenerHirsch.addProducts(new Product[]{starter1,starter2,main1,main2,dessert,dessert1,drink1,drink2,drink3});


        Tabel tabel1 = new Tabel(1, 4);
        Tabel tabel2 = new Tabel(2, 2);
        Tabel tabel3 = new Tabel(3, 6);
        Tabel tabel4 = new Tabel(3, 4);
        Tabel tabel5 = new Tabel(3, 3);


        goldenerHirsch.addTables(new Tabel[]{tabel1, tabel2, tabel3});

        CustomerGroup customerGroup11 = new CustomerGroup(5);
        CustomerGroup customerGroup12 = new CustomerGroup(2);
        CustomerGroup customerGroup13 = new CustomerGroup(7);
        CustomerGroup customerGroup14 = new CustomerGroup(3);
        CustomerGroup customerGroup15 = new CustomerGroup(5);
        CustomerGroup customerGroup16 = new CustomerGroup(1);
        CustomerGroup customerGroup17 = new CustomerGroup(4);


        goldenerHirsch.assignTable(customerGroup12);
        goldenerHirsch.assignTable(customerGroup11);
        goldenerHirsch.assignTable(customerGroup13);
        goldenerHirsch.assignTable(customerGroup14);
        goldenerHirsch.assignTable(customerGroup15);
        goldenerHirsch.assignTable(customerGroup16);

        Order order100 = new Order();
        Order order101 = new Order();
        Order order102 = new Order();
        Order order103 = new Order();
        Order order104 = new Order();

        order100.addProductsToOrder(new Product[]{starter1,starter2,drink1,drink2});
        order101.addProductsToOrder(new Product[]{drink2,drink1,drink3,main1,main2,dessert1});
        order104.addProductsToOrder(new Product[]{starter1,drink1});

        tabel1.addOrderToTabel(order100);
        tabel2.addOrderToTabel(order104);



        System.out.println(goldenerHirsch);

    }

}
