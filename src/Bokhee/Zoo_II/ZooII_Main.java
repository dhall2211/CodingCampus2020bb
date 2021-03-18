package Bokhee.Zoo_II;

public class ZooII_Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Feldkircher Tierpark");


        Tier reh1 = zoo.createTier("Gehege Alps", "Rudolf", "Reh", "Heu", 7);
        Tier reh2 = zoo.createTier("Gehege Alps", "Regina", "Reh", "Heu", 5);
        Tier reh3 = zoo.createTier("Gehege Alps", "Rubeola", "Reh", "Heu", 5);
        Tier igel = zoo.createTier("Gehege Alps", "Ixilon", "Igel", "Obst", 1);
        Tier loewe = zoo.createTier("Savanna", "Leo", "Löwe", "Bratwurst", 5);
        Tier voegel1 = zoo.createTier("Südkäfig", "Palang", "Vögel", "Korner", 1);

        zoo.searchAndCreateFutter("Heu", "kg");
        zoo.searchAndCreateFutter("Obst", "kg");
        zoo.searchAndCreateFutter("Bratwurst", "Stk");

        zoo.printStrukture("");

        Pfleger pf1 = new Pfleger(zoo,
                "Stefan",
                "Gehege Alps",
                reh1);

        pf1.addPflegeTier(reh1);
        pf1.addPflegeTier(igel);
        pf1.addPflegeTier(loewe);
        // pf1.bestellFutter();
        pf1.printPflegerArbeiten();

        Arzt arzt = new Arzt(zoo, "Park");
        arzt.behandelnTier("Regina");


    }
}
