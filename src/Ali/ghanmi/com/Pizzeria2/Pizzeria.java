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

        int menuItem = chooseMenuIthem();
        switch (menuItem) {
            case 1:
                Bestellung();
                break;

            case 0:
                salutaion();

        }
    }

    private void salutaion() {
        System.out.println("danke für ihren besuch und aufwiedersehen");
    }

    private void Bestellung() {
        double totalKosten = 0;
        String[] namestopping = new String[5];
        System.out.println("Herzlich willkommen bei Giovannis. Bitte geben Sie Ihren Vor- und nachname ein");
        this.customerName = scanner.nextLine();
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
            }
            boolean moreToppind = true;
            while (moreToppind) {
                int topping = chooseTopping();

                switch (topping) {

                    case 11, 12, 13, 14, 15:
                        int counter=0;
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
                        System.out.println("Pizza " + namebasic + ",zusätzlich zutaten: " + Arrays.toString(namestopping)+ " " + totalKosten + " $");
                        Order newOrder = new Order(this.idNumberOrder,new String[]{namebasic},namestopping);
                        orders.add(newOrder);
                        idNumberOrder++;
                        chooseMenuIthem();
                        break;


                    case 0:
                        salutaion();
                        isOrdering = false;


                }
            }
        }
    }

    private void bestellungAbschlisen() {
        System.out.println("ihren Bestellung lautet:");

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

      /*
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
        */



