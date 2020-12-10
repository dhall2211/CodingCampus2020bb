package Alex.Zoo;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Fabelhafte Tierwelt");
        Gehege gehegeAlps = new Gehege(zoo, "Gehege Primaten");
        Tier Affe1 = new Tier(gehegeAlps, "Cheeta", "Säugetiere");
        Tier Affe2 = new Tier(gehegeAlps, "King Kong", "Säugetiere");
        Tier Affe3  = new Tier(gehegeAlps, "Koko ", "Säugetier");

        zoo.printStruktur("");

    }
}
