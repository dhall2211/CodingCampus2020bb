package Marcella.Restaurant;

public class Main {

    public static void main(String[] args) {

        Restaurant goldenerHirsch = new Restaurant("Der goldene Hirsch");

        Product starter1 = new Product("Vorspeise", "Grüner Salat", 4.5);
        Product starter2 = new Product("Vorspeise", "Tagessuppe", 4.5);
        Product main1 = new Product("Hauptspeise", "Kässpätzle", 9.0);
        Product main2 = new Product("Hauptspeise", "Schnitzel", 10.0);
        Product dessert1 = new Product("Nachspeise", "Mousse au Chocolat", 6.0);
        Product dessert = new Product("Nachspeise", "Tiramisu", 5.5);
        Product drink1 = new Product("Getränk", "Wasser", 2.5);
        Product drink2 = new Product("Getränk", "Wein", 3.5);
        Product drink3 = new Product("Getränk", "Kaffee", 2.5);

        goldenerHirsch.addProducts(new Product[]{starter1, main1, drink1});

        Tabel tabel1 = new Tabel(1, 4);
        Tabel tabel2 = new Tabel(2, 2);
        Tabel tabel3 = new Tabel(3, 6);

        goldenerHirsch.addTables(new Tabel[]{tabel1, tabel2, tabel3});

        CustomerGroup customerGroup11 = new CustomerGroup(5);
        CustomerGroup customerGroup12 = new CustomerGroup(2);
        CustomerGroup customerGroup13 = new CustomerGroup(7);

        goldenerHirsch.assignTable(customerGroup13);
        goldenerHirsch.assignTable(customerGroup12);

        System.out.println(goldenerHirsch);

    }

}
