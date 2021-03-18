package Bokhee.Zoo;

public class Zoo_Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Feldkircher Tierpark");

        Futter fleisch = new Futter(zoo,"Fleisch","kg");
        Futter schinken = new Futter(zoo,"Schinken","kg");
        Futter poulet = new Futter(zoo,"Poulet","kg");
        Futter frucht = new Futter(zoo,"Frucht","kg");
        Futter heu = new Futter(zoo,"Heu","kg");

        fleisch.tagesBedarfzufuegen(30);
        schinken.tagesBedarfzufuegen(50);
        poulet.tagesBedarfzufuegen(23);
        frucht.tagesBedarfzufuegen(100);

        Gehege gehegeAlps = new Gehege(zoo,"Gehege Alps");


        Tier reh1 = new Tier(gehegeAlps,"Rudolf","Reh",heu,20);
        zoo.addFutter(fleisch);
        fleisch.tagesBedarfzufuegen(5);
        Tier reh2 = new Tier(gehegeAlps,"Regina","Reh",heu,28);
        zoo.addFutter(fleisch);
        schinken.tagesBedarfzufuegen(6);
        Tier reh3 = new Tier(gehegeAlps,"Rubeola","Reh",heu,45);
        zoo.addFutter(fleisch);
        poulet.tagesBedarfzufuegen(7);

        Gehege gehegeAmazon = new Gehege(zoo, "Amazon");
        Tier horang1 = new Tier(gehegeAmazon,"Hodori","Tiger",fleisch,15);
        Tier horang2 = new Tier(gehegeAmazon,"HodoriJr","Tiger", schinken,8);
        Tier horang3 = new Tier(gehegeAmazon, "Hosun","Tiger",poulet,30);

        Gehege gehegeKaefig = new Gehege(zoo,"Kaefig");
        Tier kolibris1 = new Tier(gehegeKaefig,"Parang","Kolibris",frucht,9);
        Tier kolibris2 = new Tier(gehegeKaefig,"ParangJr","Kolibris",frucht,11);

        zoo.printStrukture("");

    }
}
