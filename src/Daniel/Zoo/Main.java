package Daniel.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Wildpark Feldkirch");

        Animal reh1 = zoo.createTier("Gehege Alps", "Rudolf", "Reh", "Heu", 7);
        Animal reh2 = zoo.createTier("Gehege Alps", "Regina", "Reh", "Heu", 5);
        Animal reh3 = zoo.createTier("Gehege Alps", "Rubeola", "Reh", "Heu", 5);
        Animal igel = zoo.createTier("Gehege Alps", "Ixilon", "Igel", "Obst", 1);
        Animal loewe = zoo.createTier("Savanna", "Leo", "Löwe", "Bratwurst", 5);

        zoo.searchAndCreateFutter("Heu", "kg");
        zoo.searchAndCreateFutter("Obst", "kg");
        zoo.searchAndCreateFutter("Bratwurst", "Stk");

        zoo.searchAndCreateVeterinary("Johann");

        zoo.printStruktur("");
    }
}
