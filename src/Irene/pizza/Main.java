package Irene.pizza;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Topping salami = new Topping("Salami", 1, 1);
        Topping corn = new Topping("Corn", 1, 2);
        Topping pineapple = new Topping("Pineapple", 1, 3);
        Topping bacon = new Topping("Bacon", 1, 4);
        Topping onions = new Topping("Onions", 1, 5);
        Topping chilliPepper = new Topping("Chilli Pepper", 1, 6);
        Topping cheese = new Topping("Cheese", 1, 7);

        Restaurant napoli = new Restaurant("Napoli");

        napoli.addToppings(new Vector<>(Arrays.asList(salami, corn, pineapple, bacon, onions, chilliPepper, cheese)));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the pizzeria Napoli!");
        System.out.println("Please enter your name:");
        String name = scanner.next();
        Order customer = new Order(name);
        System.out.println("Our basic pizza is always a pizza Margherita.");
        System.out.println("You can add up to five additional toppings. Here is a list of the available toppings:");
        napoli.printToppings();
        System.out.println();
        System.out.println("Please enter the idNumber of a topping you want to add.");
        System.out.println("If you don't want any more toppings please enter [0].");
        int id = scanner.nextInt();
        switch (id){
            case 0:
                break;
            case 1:
                customer.addTopping(salami);
                break;
            case 2:
                customer.addTopping(corn);
                break;
            case 3:
                customer.addTopping(pineapple);
                break;
            case 4:
                customer.addTopping(bacon);
                break;
            case 5:
                customer.addTopping(onions);
                break;
            case 6:
                customer.addTopping(chilliPepper);
                break;
            case 7:
                customer.addTopping(cheese);
                break;
        }
        System.out.println();
        System.out.println();
    }
}
