package Irene.pizza;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Willkommen bei der Pizzeria Napoli!");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        Topping salami = new Topping("Salami", 1, 1);
        Topping corn = new Topping("Corn", 1, 2);
        Topping pineapple = new Topping("Pineapple", 1, 3);
        Topping bacon = new Topping("Bacon", 1, 4);
        Topping onions = new Topping("Onions", 1, 5);
        Topping chilliPepper = new Topping("Chilli Pepper", 1, 6);
        Topping cheese = new Topping("Cheese", 1, 7);

        Restaurant napoli = new Restaurant("Napoli");

        napoli.addToppings(new Vector<>(Arrays.asList(salami, corn, pineapple, bacon, onions, chilliPepper, cheese)));

        System.out.println("Folgende Zutaten stehen zur Verfügung:");
        napoli.printToppings();
        //int id = scanner.nextInt();

    }
}
