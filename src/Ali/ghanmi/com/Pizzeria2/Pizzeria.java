package Ali.ghanmi.com.Pizzeria2;

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
        customerName = null;
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
        boolean repeat = true;
        while (repeat) {
            int menuItem = chooseMenuIthem();
            switch (menuItem) {
                case 1:
                    bestellung();
                    break;

                case 0:
                    repeat = false;
                    salutaion();
                    break;
                default:
                    repeat = true;
                    break;
            }
        }
    }

    private void salutaion() {
        System.out.println("danke für ihren besuch und aufwiedersehen");
    }

    private void bestellung() {
        int counter = 0;
        double totalKosten = 0;
        String[] namestopping = new String[5];

        if(customerName == null) {
            System.out.println("Herzlich willkommen bei Giovannis. Bitte geben Sie Ihren Vor- und nachname ein");
            this.customerName = scanner.nextLine();
        }
        // choose BasicPizza ---------------------------------------
        System.out.println(customerName + ", Bitte wählen Sie Ihre BasicPizza per Nummer aus: \n");
        // choosePizza();
        String namebasic = "";
        boolean isOrdering = true;
        while (isOrdering) {
            int basicPiza = choosePizza();
            switch (basicPiza) {
                case 1, 2, 3:
                    for (int i = 0; i < basicPizzas.size(); i++) {
                        if (basicPiza == basicPizzas.get(i).getIdNumberPizza()) {
                            namebasic = basicPizzas.get(i).getName();
                            totalKosten += basicPizzas.get(i).getPrice();
                            System.out.println("deine aktuel kosten: " + basicPizzas.get(i).getPrice() + " " + namebasic);
                        }
                    }
                    break;
                case 0:
                    isOrdering = false;
                    break;
            }
            while (isOrdering) {
                int topping = chooseTopping();

                switch (topping) {

                    case 11, 12, 13, 14, 15:
                        for (int j = 0; j < toppings.size(); j++) {
                            if (topping == toppings.get(j).getIdNumberTopping()) {
                                namestopping[counter] = toppings.get(j).getName();
                                totalKosten += toppings.get(j).getPrice();
                                counter++;
                                System.out.println("deine aktuel Zusatz kosten: " + toppings.get(j).getPrice() +
                                        " " + Arrays.toString(namestopping));
                                System.out.println("total kosten: " + totalKosten);

                            }
                        }
                        break;
                    case 100:
                        bestellungAbschlisen();
                        System.out.println("Pizza " + namebasic + ",zusätzlich zutaten: " + Arrays.toString(namestopping) + " " + totalKosten + " $");
                        Order newOrder = new Order(this.idNumberOrder, new String[]{namebasic}, namestopping);
                        orders.add(newOrder);
                        idNumberOrder++;
                        System.out.println("möchten Sie weiter PizzaBestellen?");
                        isOrdering = false;
                        break;

                    case 0:
                        isOrdering = false;
                        break;

                }
            }
        }
    }

    private void bestellungAbschlisen() {
        System.out.println("ihren Bestellung lautet:\nBestellNr:" + idNumberOrder);

    }

    private int chooseTopping() {
        while (true) {
            System.out.println(" 11 = pepperoni \n 12 = olive\n 13 = anchois \n 14 = mais \n 15 = aglio \n 0 = Benden\n 100 = bestellung abgeben");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
        }
    }

    private static int chooseMenuIthem() {
        while (true) {
            System.out.println(" 1 = Bestellung \n 0 = Benden");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
        }
    }

    private static int choosePizza() {
        while (true) {
            System.out.println(" 1 = margherita \n 2 = prosciutto\n 3 = funghi \n 0 = Benden");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
        }
    }

}

