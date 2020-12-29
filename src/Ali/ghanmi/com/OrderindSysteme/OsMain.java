package Ali.ghanmi.com.OrderindSysteme;


public class OsMain {
    public static void main(String[] args) {
        //Bakery
        Confectionery schmied = new Confectionery("Schmied Back Werk");

        //Product
        Product choco = schmied.searchAndCreateProduct("Choco");
        Product zimmt = schmied.searchAndCreateProduct("Zimmt");
        Product caramel = schmied.searchAndCreateProduct("Caramel");
        Product mandelziegel = schmied.searchAndCreateProduct("Mandelziegel");
        Product nuss = schmied.searchAndCreateProduct("nuss");
        Product orangenTuile = schmied.searchAndCreateProduct("Orangen-Tuile");
        //Staff
        Staff frank = schmied.searchAndCreateStaff("Frank Müller", mandelziegel, 2500, new String[]{});
        Staff daniel = schmied.searchAndCreateStaff("Daniel Herlimann", choco, 2000, new String[]{});
        Staff fritz = schmied.searchAndCreateStaff("Fritz Gross", caramel, 3000, new String[]{});
        Staff jess = schmied.searchAndCreateStaff("Jessica frik", zimmt, 4000, new String[]{});
        //Add Spyciality to Staff
        frank.addSpcialty(nuss);
        frank.addSpcialty(choco);
        jess.addSpcialty(choco);
        fritz.addSpcialty(mandelziegel);
        fritz.addSpcialty(orangenTuile);
        daniel.addSpcialty(mandelziegel);
        //orderBasket
        OrderBasket a = new OrderBasket(choco, 100);
        OrderBasket b = new OrderBasket(zimmt, 400);
        OrderBasket c = new OrderBasket(mandelziegel, 300);
        //add basket to customer


        //customer
        Customer julia = schmied.searchAndCreatCustomer("Julia Meier", "Blumenbergstrasse 11, 6800 Bregenz", 12345, new String[]{});
        Customer rita = schmied.searchAndCreatCustomer("Rita Wolfgang", "Seestrasse  10, 6800 Bregenz", 23456, new String[]{});
        //add basket to customer
        julia.addOrderbasket(a);
        julia.addOrderbasket(b);
        rita.addOrderbasket(c);
        //PrintStrukrure
        schmied.printStructure("-");
    }
}
