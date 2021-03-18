package Bokhee.Werkstatt;



public class Werkstatt_Main {
    public static void main(String[] args) {
        // Erzeugen
        Auto autoVW = new Auto("VW Touran", 20, 50, 150);
     Auto autoFord = new Auto("Ford Mondeo", 50, 10, 150);

        Tankstelle total = new Tankstelle("Total", 0.95f);
     Werkstatt tiptop = new Werkstatt("Tip-Top", 100, 20);

        Fahrer fahrerAlexandra = new Fahrer("Alexandra", tiptop, autoVW);


        fahrerAlexandra.fahren(951, total);
        fahrerAlexandra.setAuto(autoFord);
        fahrerAlexandra.fahren(450, total);

    }
}
