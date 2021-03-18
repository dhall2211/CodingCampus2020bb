package Bokhee.WeihnachtsBaeckerei;

import java.util.Random;
import java.util.Vector;

public class Employee {
    private String name;
    private String favouriteCookie;
    private Vector<Cookie> bakeableCookies;
    private int productionCapacity;
    private int productionCapacityTotal;
    private int productionCapacityLeft;
    private int deliverCapacityTotal;
    private int deliverCapacityLeft;

    public Employee( String name, String favouriteCookie, int productionCapacity) {
        this.name = name;
        this.favouriteCookie = favouriteCookie;
        this.bakeableCookies = new Vector<>();
        this.productionCapacity = productionCapacity;
        this.productionCapacityTotal = 0;
        this.productionCapacityLeft = 0;
        this.deliverCapacityTotal = 0;
        this.deliverCapacityLeft = 0;

    }

    public String getName() {
        return name;
    }

    public Vector<Cookie> addBakeableCookie(String cookieName) {
        if (!bakeableCookies.contains(cookieName)) {
            bakeableCookies.add(new Cookie(this, cookieName));
        }
        return bakeableCookies;
    }

    public String getFavouriteCookie() {
        return favouriteCookie;
    }

    public boolean produceCookie(String cookieName, int quantity) {
        if (cookieName.equals(favouriteCookie)) {
            if (quantity <= productionCapacity) {
                System.out.println("Baker: " + this.name + " produced " + cookieName + quantity);
            }
            return true;
        } else if (cookieName.equals(favouriteCookie)) {
            if (quantity > productionCapacity) {
                System.out.println("Baker: " + this.name + " has no Capacity left for " + cookieName + quantity + " to bake");
            }

        }
        return false;
    }


    public int hasProductionCapacityLeft(int capacity) {
        this.productionCapacity = capacity;
        productionCapacity -= productionCapacityTotal;
        productionCapacityLeft = productionCapacity;
        return productionCapacityLeft;

    }

    public int hasDeliverCapacityLeft(int orderQuantity) {
        deliverCapacityTotal -= orderQuantity;
        deliverCapacityLeft -= deliverCapacityTotal;
        return deliverCapacityLeft;
    }

    public void delivery(Customer order, Vector<OrderItem> orderItems, OrderItem amount) {
        System.out.println("The order from Customer" + order.getName() + " delivered as follows");
        System.out.println(order.getName() + ":" + orderItems + "\t" + amount.getAmount());
    }

    @Override
    public String toString() {
        return "Employee Name :" +
                name + "\t" + "Favourite Cookie to bake:  " + favouriteCookie + "\n" +
                "Other bakeable Cookies : " + bakeableCookies + "\n" +
                "Productions Capacity: " + productionCapacity + "\n" +
                "Production CapacityTotal: " + productionCapacityTotal + "\n" +
                "Production Capacity Left " + productionCapacityLeft + "\n" +
                "Delivery Capacity Total: " + deliverCapacityTotal + "\n" +
                "Delivery Capacity Left: " + deliverCapacityLeft + "\n" ;

    }
}
