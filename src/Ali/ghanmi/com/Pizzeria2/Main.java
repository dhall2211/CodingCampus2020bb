package Ali.ghanmi.com.Pizzeria2;

public class Main {

    public static void main(String[] args) {

        Pizzeria giovannis = new Pizzeria("Giovannis Pizza");

        BasicPizza margherita = new BasicPizza(1, "margherita", 6.0, new String[]{});
        BasicPizza prosciutto = new BasicPizza(2, "prosciutto", 7.0, new String[]{});
        BasicPizza funghi = new BasicPizza(3, "funghi", 6.5, new String[]{});

        Topping pepperoni = new Topping(11, "pepperoni", 1.0);
        Topping olive = new Topping(12, "olive", 1.0);
        Topping anchois = new Topping(13, "anchois", 1.0);
        Topping mais = new Topping(14, "mais", 1.0);
        Topping aglio = new Topping(15, "aglio", 1.0);

        giovannis.addBasicPizza(new BasicPizza[]{margherita, prosciutto, funghi});
        giovannis.addTopping(new Topping[]{pepperoni, olive, anchois, mais, aglio});

        margherita.addToppingToBasic(new Topping[]{pepperoni, olive});


        giovannis.order();
     }
    }

