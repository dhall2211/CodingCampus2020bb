package Bokhee.Restaurant;

public class Restaurant_Main {

    public static void main(String[] args) {

        Restaurant rosenGarten = new Restaurant("Rosen Garten");

        Product drink1 = new Product("Drinks","Water",3.5);
        Product starter1 = new Product("Starter","Green Salad", 5.5);
        Product starter2 = new Product("Starter","Daily Soup",5.2);
        Product main1 = new Product("Main","Alpen Magronen",11.5);
        Product main2 = new Product("Main","Schnitzel",13.3);
        Product dessert1 = new Product("Dessert","Tiramisu",6.4);
        Product dessert2 = new Product("Dessert","Chocho Cream",6.6);

        rosenGarten.addProducts(new Product[]{drink1,starter2,main1,dessert2});

        Table t1 = new Table(1, 2);
        Table t2 = new Table(2,6);
        Table t3 = new Table(3, 8);
        Table t4 = new Table(4, 4);

        rosenGarten.addTables(new Table[] {t1,t2,t3,t4});


        GuestGroup gg1 = new GuestGroup(4);
        GuestGroup gg2 = new GuestGroup(2);
        GuestGroup gg3 = new GuestGroup(1);
        GuestGroup gg4 = new GuestGroup(6);
        GuestGroup gg5 = new GuestGroup(10);

        rosenGarten.assignGuestGroup(gg1);
        rosenGarten.assignGuestGroup(gg2);
        rosenGarten.assignGuestGroup(gg3);
        rosenGarten.assignGuestGroup(gg4);
        rosenGarten.assignGuestGroup(gg5);

        //rosenGarten.handleOrder(t2,dessert1);

    }
}
