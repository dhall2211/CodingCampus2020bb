package Marcella.Pizzeria;

import java.util.Scanner;
import java.util.Vector;

public class Pizzeria {

    public static Scanner scanner = new Scanner(System.in);

    private String name;
    private String customerName;
    private Vector<Order> orders;
    private int idNumberOrder = 1;
    private Vector<BasicPizza> basicPizzas;
    private Vector<Topping> toppings;

    public Pizzeria(String name) {
        this.name = name;
        this.orders = new Vector<>();
        this.basicPizzas = new Vector<>();
        this.toppings = new Vector<>();
    }

    public void addBasicPizza(BasicPizza[] basicPizzas) {
        for (BasicPizza oneBasicPizza : basicPizzas) {
            this.basicPizzas.add(oneBasicPizza);
        }
    }

    public void addTopping(Topping[] toppings) {
        for (Topping oneTopping : toppings) {
            this.toppings.add(oneTopping);
        }
    }

    public void order() {
        System.out.println("Herzlich willkommen bei Giovannis. Bitte geben Sie Ihren Vor- und Zunamen ein.");
        this.customerName = scanner.nextLine();
        // create new Order ----------------------------------------
        Order newOrder = new Order(this.idNumberOrder);
        // choose BasicPizza ---------------------------------------
        System.out.println(customerName + ", Bitte wählen Sie Ihre BasicPizza per Nummer aus: \n");
        for (BasicPizza oneBasicPizza : basicPizzas) {
            System.out.println("_ " + oneBasicPizza.getIdNumberPizza() + ": " + oneBasicPizza.getName() + ", " + oneBasicPizza.getPrice() + " Euro.");
        }
        newOrder.addBasicPizza(scanner.nextInt());
        // choose Toppings ------------------------------------------
        for (int i = 1; i <= 5; i++) {
            System.out.println(customerName + ", Sie können maximal 5 zusätzliche Toppings wählen. Bitte wählen Sie Ihr " + i + ". Topping per Nummer aus, oder beenden Sie die Bestellung mit 0: \n");
            for (Topping oneTopping : toppings) {
                System.out.println("_ " + oneTopping.getIdNumberTopping() + ": " + oneTopping.getName() + ", " + oneTopping.getPrice() + " Euro.");
            }
            System.out.println("_ 0: Bestellung beenden.");
            int temp = scanner.nextInt();
            if (temp != 0) {
                newOrder.addTopping(temp);
            } else {
                System.out.println("Vielen Dank für Ihre Bestellung.");
                break;
            }
        }
        // add new Order -------------------------------------------
        orders.add(newOrder);
        // change idNumber for next Order --------------------------
        idNumberOrder++;
    }

}
