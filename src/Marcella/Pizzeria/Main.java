package Marcella.Pizzeria;

public class Main {

    public static void main(String[] args) {

        Pizzeria giovannis = new Pizzeria("Giovannis Pizza");

        BasicPizza margherita = new BasicPizza(01, "Margherita", 6.0);
        BasicPizza prosciutto = new BasicPizza(02, "Prosciutto", 7.0);
        BasicPizza funghi = new BasicPizza(03, "Funghi", 6.5);

        Topping pepperoni = new Topping(11, "Pepperoni", 1.0);
        Topping olive = new Topping(12, "Olive", 1.0);
        Topping anchois = new Topping(13, "Anchois", 1.0);
        Topping mais = new Topping(14, "Mais", 1.0);
        Topping aglio = new Topping(15, "Aglio", 1.0);

        giovannis.addBasicPizza(new BasicPizza[]{margherita, prosciutto, funghi});
        giovannis.addTopping(new Topping[]{pepperoni, olive, anchois, mais, aglio});

        giovannis.order();

    }

}
