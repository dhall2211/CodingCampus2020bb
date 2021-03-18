package Bokhee.Werkstatt_II;

public class Werkstatt_II_Main {

    public static void main(String[] args) {

        Auto vW = new Auto("VW", 250, 50, 1000);
        Auto nissan = new Auto("Nissan", 100, 500, 18000);

        Tankstelle coop = new Tankstelle("Coop",0.05f);

        Werkstatt sonnenGarage = new Werkstatt("SonnenGarage" );

        Fahrer mike = new Fahrer("Mike", vW, sonnenGarage);

        mike.setAuto(nissan);
        mike.fahren(900,coop);
        mike.setAuto(vW);
        mike.fahren(1200,coop);







    }


}
