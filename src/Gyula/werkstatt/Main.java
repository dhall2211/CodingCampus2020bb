package Gyula.werkstatt;

public class Main {
    public static void main(String[] args) {
        // Erzeugen
        Auto autoVW = new Auto("VW Touran", 20, 50, 150);
        Auto autoFord = new Auto("Ford Mondeo", 50, 10, 150);

        Fahrer fahrerPeter = new Fahrer("Peter", autoFord);
        Fahrer fahrerAlexandra = new Fahrer("Alexandra", autoVW);
        Tankstelle total = new Tankstelle("Total", 0.95f);

        autoVW.fahren(951, total);
        autoFord.fahren(450, total);

    }
}
