package Ali.ghanmi.com.Pizzeria;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Pizzeria {

    public static Scanner scanner = new Scanner(System.in);

    private String name;
    private String customerName;
    private Vector<Order> orders;
    private int idNumberOrder;
    private Vector<BasicPizza> basicPizzas;
    private Vector<Topping> toppings;

    public Pizzeria(String name) {
        this.name = name;
        this.orders = new Vector<>();
        this.basicPizzas = new Vector<>();
        this.toppings = new Vector<>();
        idNumberOrder = 1;
    }

    public void addBasicPizza(BasicPizza[] basicPizzas) {
        for (BasicPizza oneBasicPizza : basicPizzas) {
            this.basicPizzas.add(oneBasicPizza);
        }
    }

    @Override
    public String toString() {
        return "Pizzeria{" +
                "name='" + name + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orders=" + orders +
                ", idNumberOrder=" + idNumberOrder +
                ", basicPizzas=" + Arrays.toString(basicPizzas.toArray()) +
                ", toppings:" + Arrays.toString(toppings.toArray());
    }

    public void addTopping(Topping[] toppings) {
        for (Topping oneTopping : toppings) {
            this.toppings.add(oneTopping);
        }

    }

    public void order() {
        int idN = this.idNumberOrder;
        String topname = "";

        System.out.println("Herzlich willkommen bei Giovannis. Bitte geben Sie Ihren Vor- und nachname ein");
        this.customerName = scanner.nextLine();
        // choose BasicPizza ---------------------------------------
        System.out.println(customerName + ", Bitte wählen Sie Ihre BasicPizza per Nummer aus: \n");
        for (BasicPizza oneBasicPizza : basicPizzas) {
            System.out.println("_" + oneBasicPizza.getIdNumberPizza() + ": " + oneBasicPizza.getName() + ", " + oneBasicPizza.getPrice() + " Euro.");
        }
        System.out.println("_0: Bestellung beenden.");
        String names = "";
        int auswahl = (scanner.nextInt());
        for (int i = 0; i < basicPizzas.size(); i++) {
            if (auswahl == basicPizzas.get(i).getIdNumberPizza()) {
                names = basicPizzas.get(i).getName();
                System.out.println("deine aktuel kosten: " + basicPizzas.get(i).getPrice() + " " + names);
            } else {
                System.out.println("Falsche numer bitte veruchen nochmal");
            }
            // choose Toppings ------------------------------------------
            for (int j = 1; j <= 5; j++) {
                System.out.println(customerName + ", Sie können maximal 5 zusätzliche Toppings wählen. Bitte wählen Sie Ihr " + j + ". Topping per Nummer aus, oder beenden Sie die Bestellung mit 0: \n");
                for (Topping oneTopping : toppings) {
                    System.out.println("_" + oneTopping.getIdNumberTopping() + ": " + oneTopping.getName() + ", " + oneTopping.getPrice() + " Euro.");
                }
                System.out.println("_ 0: Bestellung beenden.");
                int temp = scanner.nextInt();
                if (temp != 0) {
                    for (int k = 1; k < toppings.size(); k++) {
                        if (temp == toppings.get(i).getIdNumberTopping()) {
                            topname = toppings.get(i).getName();
                        }
                    }
                } else {

                    System.out.println("Vielen Dank für Ihre Bestellung.");
                    break;
                }
            }
            Order newOrder = new Order(this.idNumberOrder, new String[]{names}, new String[]{topname});
            // add new Order -------------------------------------------
            orders.add(newOrder);
            System.out.println(customerName + " Ihren Bestellung nummer: " + newOrder.getIdNumberOrder() + "\n "
                    + newOrder.getBasicPizzas().toString());
        }
        // System.out.println(Arrays.toString(orders.toArray()));
        // change idNumber for next Order --------------------------

    }

}

