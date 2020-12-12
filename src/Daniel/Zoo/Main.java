package Daniel.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Wildpark Feldkirch");

        Animal reh1 = zoo.createAnimal("Gehege Alps", "Rudolf", "Reh", "Heu", 7);
        Animal reh2 = zoo.createAnimal("Gehege Alps", "Regina", "Reh", "Heu", 5);
        Animal reh3 = zoo.createAnimal("Gehege Alps", "Rubeola", "Reh", "Heu", 5);
        Animal igel = zoo.createAnimal("Gehege Alps", "Ixilon", "Igel", "Obst", 1);
        Animal loewe = zoo.createAnimal("Savanna", "Leo", "Löwe", "Bratwurst", 5);

        zoo.searchAndCreateFutter("Heu", "kg");
        zoo.searchAndCreateFutter("Obst", "kg");
        zoo.searchAndCreateFutter("Bratwurst", "Stk");

        zoo.searchAndCreateZookeeper("Franz", igel, new String[]{"Gehege Alps"});

        zoo.searchAndCreateVeterinary("Anna");

        zoo.printStructure("");
    }
}
