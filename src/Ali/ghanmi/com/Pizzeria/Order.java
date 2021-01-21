package Ali.ghanmi.com.Pizzeria;

import java.util.Arrays;
import java.util.Vector;

public class Order {

    private int idNumberOrder;
    private Vector<BasicPizza> basicPizzas;
    private Vector<Topping> toppings;

    public Order(int idNumberOrder, String [] Basic, String[] top) {
        this.idNumberOrder = idNumberOrder;
        basicPizzas = new Vector<>();
        toppings = new Vector<>();
    }


    public void addBasicPizza(int idNumberPizza) {
        for (BasicPizza oneBasicPizza : basicPizzas) {
            if (oneBasicPizza.getIdNumberPizza() == idNumberPizza) {
                this.basicPizzas.add(oneBasicPizza);
            }
        }
    }

    public void addTopping(int idNumberTopping) {
        for (Topping oneTopping : toppings) {
            if (oneTopping.getIdNumberTopping() == idNumberTopping) {
                this.toppings.add(oneTopping);
            }
        }
    }

    public int getIdNumberOrder() {
        return idNumberOrder;
    }

    public Vector<BasicPizza> getBasicPizzas() {
        return basicPizzas;
    }

    public Vector<Topping> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idNumberOrder=" + idNumberOrder +
                ", basicPizzas=" + Arrays.toString(basicPizzas.toArray())+
                ", toppings=" + toppings +
                '}';
    }
}
