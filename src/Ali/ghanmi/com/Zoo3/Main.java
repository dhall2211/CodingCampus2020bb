package Ali.ghanmi.com.Zoo3;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Wildpark Feldkirch");

        Tier reh1 = zoo.createTier("Gehege Alps", "Rudolf", "Reh", "Heu", 7);
        Tier reh2 = zoo.createTier("Gehege Alps", "Regina", "Reh", "Heu", 5);
        Tier reh3 = zoo.createTier("Gehege Alps", "Rubeola", "Reh", "Heu", 5);
        Tier igel = zoo.createTier("Gehege Alps", "Ixilon", "Igel", "Obst", 1);
        Tier loewe = zoo.createTier("Savanna", "Leo", "Löwe", "Fleisch", 10);

        zoo.searchAndCreateFutter("Heu","kg",1000);
        zoo.searchAndCreateFutter("Obst","kg",10);
        zoo.searchAndCreateFutter("Fleisch","kg",20);
        zoo.searchAndCreateMitarbeiter("Bernard",reh1, new String[]{"Gehege Alps"});
        zoo.searchAndCreateMitarbeiter("Xavi",reh2, new String[]{"Gehege Mediteranne"});

        zoo.searchAndCreateVeterinary("Alfred");

       // FutterManagement.foodManagment();
        zoo.printStruktur("");


    }
}
