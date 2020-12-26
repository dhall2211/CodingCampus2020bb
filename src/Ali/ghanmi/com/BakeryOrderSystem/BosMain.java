package Ali.ghanmi.com.BakeryOrderSystem;

public class BosMain {
    public static void main(String[] args) {
        //Bakery
        Bakery bacKunst = new Bakery("Schmid Confiserie");

        //Customers Registred
        Customer a = new Customer("Frank Schmid", "Hofstrasse 14, 6800 Lustenau");
        Customer b = new Customer("Walter summer", "BlumenbergStr. 10, 6890 Dornbirn");
        Customer c = new Customer("Alfred winter", "Alber einstein 2, 6900 Bregenz");
        Customer d = bacKunst.searchAndCreateCustomer("Francice Alber", "Hofnungweg 101,6910Bregenz");

        //Cokies

        Cokie zimmtSterne = bacKunst.searchAndCreateCokies("zimmt Sterne");
        Cokie VanilleGipfel = bacKunst.searchAndCreateCokies("Vanille Gipfel");
        Cokie ChocoMond = bacKunst.searchAndCreateCokies("Choco Mond");
        Cokie DatlenKuss = bacKunst.searchAndCreateCokies("Datlen  Kuss");
        Cokie NussDreieck = bacKunst.searchAndCreateCokies("Nuss Dreieck");
        Cokie MürbeteigBackstein = bacKunst.searchAndCreateCokies("Mürbeteig Backstein");


        //Staff
        var fabrice = bacKunst.searchAndCreateStaff("Fabrice", 10, "Choco Mond", new String[]{}, bacKunst);
        var peter = bacKunst.searchAndCreateStaff("Peter", 10, "N.N", new String[]{}, bacKunst);
        var hanna = bacKunst.searchAndCreateStaff("Hanna", 10, "Vanille_Gipfel", new String[]{}, bacKunst);
        var chris = bacKunst.searchAndCreateStaff("Chris", 10, "mürbeteig_Backstein", new String[]{}, bacKunst);
        var nora = bacKunst.searchAndCreateStaff("Nora", 10, "Nuss_Dreieck", new String[]{}, bacKunst);
        var dani = bacKunst.searchAndCreateStaff("Dani", 10, "Datlen_Kuss", new String[]{}, bacKunst);

        peter.addStaffspeciality(zimmtSterne);
        peter.addStaffspeciality(MürbeteigBackstein);
        fabrice.addStaffspeciality(VanilleGipfel);
        hanna.addStaffspeciality(NussDreieck);
        chris.addStaffspeciality(ChocoMond);
        /*


         */
        //Orderbasket


        // Order


        //bacKunst.printStructure("-");

        bacKunst.logIn("Frank Schmid", "Hofstrasse 14, 6800 Lustenau"); // Falsche login

        bacKunst.logIn("Francice Alber", "Hofnungweg 101,6910Bregenz");  // richtige login

        bacKunst.CreateCustomer("Fiona Fritz", "nirwendwo di hei 600000000 "); // Ne kunden anmelden

        bacKunst.logIn("Fiona Fritz", "nirwendwo di hei 600000000 ");   // Mit Neu anmeldung login
        bacKunst.CreateOrderBascket(200, "Datlen Kuss");
    }
}