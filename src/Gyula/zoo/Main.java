package Gyula.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Feldkircher Tierpark");
        Gehege gehegeAlps = new Gehege(zoo, "Gehege Alps");
        Tier reh1 = new Tier(gehegeAlps, "Rudolf", "Reh");
        Tier reh2 = new Tier(gehegeAlps, "Regina", "Reh");
        Tier reh3 = new Tier(gehegeAlps, "Rubeola", "Reh");

        zoo.printStruktur("");
    }
}
