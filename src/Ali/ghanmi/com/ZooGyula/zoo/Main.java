package Ali.ghanmi.com.ZooGyula.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Wildpark Feldkirch");

        Tier reh1 = zoo.createTier("Gehege Alps", "Rudolf", "Reh", "Heu", 7,"bernard");
        Tier reh2 = zoo.createTier("Gehege Alps", "Regina", "Reh", "Heu", 5,"ff" +
                "");
        Tier reh3 = zoo.createTier("Gehege Alps", "Rubeola", "Reh", "Heu", 5,"Xaxi");
        Tier igel = zoo.createTier("Gehege Alps", "Ixilon", "Igel", "Obst", 1,"Jose");
        Tier loewe = zoo.createTier("Savanna", "Leo", "Löwe", "Bratwurst", 5,"Javiarrrrrr");

        zoo.searchAndCreateFutter("Heu", "kg");
        zoo.searchAndCreateFutter("Obst", "kg");
        zoo.searchAndCreateFutter("Bratwurst", "Stk");
        zoo.searchAndCreateMitarbeiter("Bernard");

        zoo.searchAndCreateMitarbeiter("Bernd");
        zoo.searchAndCreateMitarbeiter("Jose");

        zoo.printStruktur("");
    }
}
