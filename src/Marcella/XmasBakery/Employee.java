package Marcella.XmasBakery;

import java.util.Vector;

public class Employee {

    private String name;
    private Vector<Cookie> cookiesEmployee;
    private String bestCookie;

    public Employee(Bakery bakery, String name, String bestCookie) {
        this.name = name;
        this.cookiesEmployee = new Vector<>();
        this.bestCookie = bestCookie;
        bakery.addNewEmployee(this);
    }

    public void printStructure(String spaces) {
        System.out.println(spaces + "_ " + this.name);
    }

}