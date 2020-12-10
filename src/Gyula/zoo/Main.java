package Gyula.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Feldkircher Tierpark");
        Gehege gehegeAlps = new Gehege(zoo, "Gehege Alps");
        Futter heu = new Futter(zoo, "Heu", "kg");
        Tier reh1 = new Tier(gehegeAlps, "Rudolf", "Reh", heu, 7);
        Tier reh2 = new Tier(gehegeAlps, "Regina", "Reh", heu, 5);
        Tier reh3 = new Tier(gehegeAlps, "Rubeola", "Reh", heu, 5);

        zoo.printStruktur("");
    }
}
