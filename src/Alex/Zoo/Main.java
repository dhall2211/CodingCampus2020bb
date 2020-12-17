package Alex.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("->Fabelhafte Welt der Tiere<-");
        Gehege gehegePrimaten = new Gehege(zoo, "Gehege Primaten");
        Gehege gehegePanthera = new Gehege(zoo, "Gehege Panthera");
        Gehege gehegeZahnwale = new Gehege(zoo, "Gehege Zahnwale");

        Futter banane = new Futter(zoo, "Banane(n)", "Stück");
        Futter fleisch = new Futter(zoo, "Fleisch", "Kg");
        Futter lachs = new Futter(zoo, "Lachs", "Kg");

        Tier Schimpansen = new Tier(gehegePrimaten, "Chitta", "Schimpanse", banane, 5);
        Tier Gorilla = new Tier(gehegePrimaten, "King Kong", "Gorilla", banane, 115);
        Tier ZeichentrickAffe = new Tier(gehegePrimaten, "Koko", "Zeichentrick Affe", banane, 1);

        Tier Löwe = new Tier(gehegePanthera, "Aslan", "Löwe", fleisch, 45);
        Tier Tiger = new Tier(gehegePanthera, "Shir Khan", "Tiger", fleisch, 35);

        Tier Delfin = new Tier(gehegeZahnwale, "Flipper", "Delfin", lachs, 10);
        Tier Orka = new Tier(gehegeZahnwale, "Willy", "Orka", lachs, 177);


        zoo.searchAndCreateTierArzt("Dr.House");
        zoo.searchAndCreatePfleger("Chuck Norris");
        zoo.searchAndCreatePfleger("Tarzan");
        zoo.searchAndCreatePfleger("Aquaman");
        zoo.printStruktur(" ");
    }

}
