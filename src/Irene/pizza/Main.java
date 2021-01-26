package Irene.pizza;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Restaurant napoli = new Restaurant("Napoli");

        Topping salami = new Topping("Salami", 1, 1);
        Topping corn = new Topping("Corn", 1, 2);
        Topping pineapple = new Topping("Pineapple", 1, 3);
        Topping bacon = new Topping("Bacon", 1, 4);
        Topping onions = new Topping("Onions", 1, 5);
        Topping chilliPepper = new Topping("Chilli Pepper", 1, 6);
        Topping cheese = new Topping("Cheese", 1, 7);

        napoli.addToppings(salami);
        napoli.addToppings(corn);
        napoli.addToppings(pineapple);
        napoli.addToppings(bacon);
        napoli.addToppings(onions);
        napoli.addToppings(chilliPepper);
        napoli.addToppings(cheese);

        Pizza margherita = new Pizza("Margherita", 6, 1);
        Pizza pizzaSalami = new Pizza("Salami", 7, 2);
        Pizza prosciutto = new Pizza("Prosciutto", 8, 3);
        Pizza quattroFormaggi = new Pizza("Quattro Formaggi", 10, 4);
        Pizza funghi = new Pizza("Funghi", 12, 5);

        napoli.addPizzas(margherita);
        napoli.addPizzas(pizzaSalami);
        napoli.addPizzas(prosciutto);
        napoli.addPizzas(quattroFormaggi);
        napoli.addPizzas(funghi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the pizzeria Napoli!");
        System.out.println("Please enter your name:");
        String name = scanner.next();
        Order customer = new Order(name);
        System.out.println();
        System.out.println("Select the base pizza you want to start with:");
        napoli.printStructurePizzaMenu();
        System.out.println();
//        int id = scanner.nextInt();   //besser: nextLine => Integer.valueOf => exception numberFormatException => bei Gyula nachschauen!
//        switch (id) {
//            case 0:
//                break;
//            case 1:
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//            case 6:
//                break;
//            case 7:
//                break;
//        System.out.println("You selected a " + );
        System.out.println("You can add up to five additional toppings for 1 additional Euro each. Here is a list of the available toppings:");
                napoli.printStructureToppingMenu();
                System.out.println();
                System.out.println();
                boolean isOrderComplete=false;
                int bill=6;
                for(
                int i=1;
                i<=5;i++)

                {
                if(isOrderComplete==false){
                System.out.println("Please enter the idNumber of a topping you want to add.");
                System.out.println("If you don't want any more toppings please enter [0].");
                int id=scanner.nextInt();
                switch(id){
                case 0:
                isOrderComplete=true;
                System.out.println("You don't want any more toppings.");
                break;
                case 1:
                customer.addOrderedToppings(salami);
                bill=bill+1;
                break;
                case 2:
                customer.addOrderedToppings(corn);
                bill=bill+1;
                break;
                case 3:
                customer.addOrderedToppings(pineapple);
                bill=bill+1;
                break;
                case 4:
                customer.addOrderedToppings(bacon);
                bill=bill+1;
                break;
                case 5:
                customer.addOrderedToppings(onions);
                bill=bill+1;
                break;
                case 6:
                customer.addOrderedToppings(chilliPepper);
                bill=bill+1;
                break;
                case 7:
                customer.addOrderedToppings(cheese);
                bill=bill+1;
                break;
                }
                }else{
                break;
                }
                }
                System.out.println("Order complete.");
                if(bill==6)

                {
                System.out.println(customer.getCustomerName()+" orders a Pizza Margherita.");
                }else

                {
                System.out.println(customer.getCustomerName()+" orders a Pizza with "+customer.getOrderedToppingsList());
                }
                System.out.println("This pizza costs "+bill+" Euro.");
                System.out.println();
                System.out.println();
                }
                }
