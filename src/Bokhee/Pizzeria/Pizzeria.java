package Bokhee.Pizzeria;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Pizzeria {
    public static Scanner scanner = new Scanner(System.in);

    private String name;
    private String customerName;
    private Vector<Order> orders;
    private Vector<Pizza> pizzas;

    public Pizzeria(String name) {
        this.name = name;
        this.customerName = "";
        this.orders = new Vector<>();
        this.pizzas = new Vector<>();
    }

    public void addPizza(Pizza pizza) {
        if (!pizzas.contains(pizza)) {
            pizzas.add(pizza);
        }
    }

    public void addOrder(Order order) {
        if (order != null) {
            this.orders.add(order);
        }
    }

    public int readNumber(){
        int result = Integer.MIN_VALUE;
        while (result == Integer.MIN_VALUE){
            String line = scanner.nextLine();
            try {
                result = Integer.valueOf(line);
            } catch (NumberFormatException nfe){
                System.out.println("Ungültige Eingabe. Bitte wiederholen!");
            }
        }
        return result;
    }

    public void orderPizzas(Order order, Topping[] toppings, Pizza pizza) {
        startOrdering();
        System.out.println("Möchten Sie bestellen?\nGeben Sie ,falls Ja --> 1, Nein --> 0 ein.");
        int isInputOrder = readNumber();

        while (isInputOrder == 1) {

            System.out.println("Geben Sie den Name ein: ");
            this.customerName = scanner.nextLine();

            System.out.println("Wählen Sie Pizzas");
            printActionPizza();
            System.out.println("Geben Sie bitte die gewünschte Number der Pizza ein.");

            int inputSelectionPizza = readNumber();


            if (inputSelectionPizza == pizza.getIdNumber()) {
                pizza = pizzas.get(inputSelectionPizza);
                Order newOrder = new Order(pizza);
                newOrder.addToppings(new Topping[]{});

                this.orders.add(newOrder);
                System.out.println(this.customerName + " " + order.getPizza() + " ist bestellt worden");
            }
            isInputOrder = 2;
        }

    }


    public void startOrdering() {
        System.out.println(this.customerName + " Sie bestellen eine Pizza.....\n");
    }

    public void printActionPizza() {
        System.out.println("Auswahl : ");
        for (Pizza onePizza : pizzas) {
            if (onePizza != null) {
                System.out.println(onePizza.getIdNumber() + " : " + onePizza.getName() + " = \t" +
                        onePizza.getPrice() + " CHF");
            }
        }
        System.out.println();
    }

    public void printActionTopping() {
        System.out.println("Auswahl : ");
        for (Pizza onePizza : pizzas) {
            if (onePizza != null) {
                System.out.println(onePizza.getIdNumber() + " : " + onePizza.getName() + " = \t" +
                        onePizza.getPrice() + " CHF");
            }
        }
        System.out.println();
    }

    public void printPizzaList() {
        System.out.println("...............................\n" +
                "\t Menu Pizzas ");
        System.out.println("...............................");
        for (Pizza onePizza : pizzas) {
            if (onePizza != null) {
                System.out.println(onePizza.getIdNumber() + " - " + onePizza.getName());
            }
        }
        System.out.println("...............................\n");
    }

    public void printOrderList() {
        System.out.println("*******************************\n" +
                "\t Order : " + this.customerName);
        System.out.println("*******************************");
        for (Order oneOrder : orders) {
            if (oneOrder != null) {
                System.out.println(oneOrder.getOrderNumber());
            }
        }
        System.out.println("*******************************\n");
    }

    @Override
    public String toString() {
        return "Pizzeria{" +
                "name='" + name + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orders=" + orders +
                ", pizzas=" + pizzas +
                '}';
    }

    // Vector printouts
   /* public void printStruktur(String prefix){
        System.out.println(prefix + name);
        for (int i = 0; i < tierList.size(); i++) {
            tierList.get(i).printStruktur(prefix + "  ");
        }
    }*/
}

