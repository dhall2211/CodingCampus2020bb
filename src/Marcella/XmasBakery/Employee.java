package Marcella.XmasBakery;

import java.util.Vector;

public class Employee {

    private String name;
    private Vector<Cookie> cookiesEmployee;
    private String bestCookie;
    private int productionCapacity;

    public Employee(Bakery bakery, String name, String bestCookie, int productionCapacity) {
        this.name = name;
        this.cookiesEmployee = new Vector<>();
        this.bestCookie = bestCookie;
        this.productionCapacity = productionCapacity;
        bakery.addNewEmployee(this);
    }

    public String getBestCookie() {
        return bestCookie;
    }

    public void produceCookies(int amount) {
        productionCapacity -= amount;
    }

    public void printStructure(String spaces) {
        System.out.println(spaces + "_ " + this.name);
    }

}
