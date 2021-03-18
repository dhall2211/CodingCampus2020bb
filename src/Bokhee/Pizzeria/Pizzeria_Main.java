package Bokhee.Pizzeria;


public class Pizzeria_Main {
    public static void main(String[] args) {


        Pizzeria napoli = new Pizzeria("Napoli");

        Pizza margherita = new Pizza(01, "Margherita", 12.9);
        Pizza formaggie = new Pizza(02, "Formaggie", 17.2);
        Pizza hawaii = new Pizza(03, "Hawaii", 16.9);
        Pizza diavola = new Pizza(04, "Diavola", 16.9);
        Pizza stagioni = new Pizza(05, "Stagioni", 16.9);

        napoli.addPizza(margherita);
        napoli.addPizza(formaggie);
        napoli.addPizza(hawaii);
        napoli.addPizza(diavola);
        napoli.addPizza(stagioni);

        napoli.printPizzaList();

        Topping tomaten = new Topping(11, "Tomaten", 1.0);
        Topping mozzarella = new Topping(12, "Mozzarella", 1.0);
        Topping gorgonzola = new Topping(13, "Gorgonzola", 1.0);
        Topping peperoncini = new Topping(14, "Peperoncini", 1.0);
        Topping ananas = new Topping(15, "Ananas", 1.0);
        Topping koblauch = new Topping(16, "Knoblauch", 1.0);

        Order order1 = new Order(hawaii);

        order1.addToppings(new Topping[]{tomaten,mozzarella,gorgonzola});
        order1.printToppings();

        napoli.orderPizzas(order1,new Topping[]{tomaten,mozzarella,gorgonzola},diavola);

//        Order order2 = new Order(102,margherita);
//        order2.addToppings(new Topping[]{tomaten,mozzarella});
//
//        order2.printToppings();
napoli.printOrderList();
    }
}
