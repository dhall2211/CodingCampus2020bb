package Bokhee.Zoo_Gyula;


public class Zoo_Gyula_Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Wildpark Feldkirch");

       Tier reh1 = zoo.createTier("Gehege Alps", "Rudolf", "Reh", "Heu", 7);
        Tier reh2 = zoo.createTier("Gehege Alps", "Regina", "Reh", "Heu", 5);
        Tier reh3 = zoo.createTier("Gehege Alps", "Rubeola", "Reh", "Heu", 5);
        Tier igel = zoo.createTier("Gehege Alps", "Ixilon", "Igel", "Obst", 1);
        Tier loewe = zoo.createTier("Savanna", "Leo", "Löwe", "Bratwurst", 5);

        zoo.searchAndCreateFutter("Heu", "kg");
        zoo.searchAndCreateFutter("Obst", "kg");
        zoo.searchAndCreateFutter("Bratwurst", "Stk");

        zoo.printStruktur("");
    }
}
