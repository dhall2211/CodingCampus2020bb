package Gyula.pizza;

public class Main {
    public static void main(String[] args) {
        Zutat pepperoni = new Zutat("Pepperoni", 1.0f);
        Zutat olive = new Zutat("Olive", 1.0f);
        Zutat mozarella = new Zutat("Mozarella", 1.0f);
        Zutat tomatenSauce = new Zutat("Tomatensauce", 0.0f);
        Zutat pilze = new Zutat("Pilze", 1.0f);

        Pizza margherita = new Pizza("Margherita", 8.5f);
        margherita.addBasisZutat(tomatenSauce);
        margherita.addBasisZutat(mozarella);

        Pizza funghi = new Pizza("Funghi", 9.0f);
        funghi.addBasisZutat(tomatenSauce);
        funghi.addBasisZutat(pilze);
        funghi.addBasisZutat(mozarella);

        Pizzeria mamma = new Pizzeria("Mamma-Mija");
        mamma.addPizza(margherita);
        mamma.addPizza(funghi);
        mamma.addZutat(new Zutat[]{mozarella, olive, pepperoni, pilze});

/*
        System.out.println(pepperoni);
        System.out.println(olive);
        System.out.println(margherita);
        System.out.println(mamma);
 */

        mamma.ordnenMenuUndZutaten();
        while (true) {
            mamma.bestellen();
        }
    }
}
