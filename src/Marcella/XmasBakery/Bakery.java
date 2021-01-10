package Marcella.XmasBakery;

import Marcella.Zoo2.Ranger;

import java.util.Vector;

public class Bakery {

    private String name;
    private Vector<Employee> employees;
    private Vector<Cookie> cookies;
    private Vector<Customer> customers;

    public Bakery(String name) {
        this.name = name;
        this.employees = new Vector<>();
        this.cookies = new Vector<>();
        this.customers = new Vector<>();
    }

    public void addNewEmployee(Employee newEmployee) {
        if (!employees.contains(newEmployee)) {
            employees.add(newEmployee);
        }
    }

    public void addNewCookie(Cookie newCookie) {
        if (!cookies.contains(newCookie)) {
            cookies.add(newCookie);
        }
    }

    public void registerNewCustomer(Customer newCustomer) {
        if (!customers.contains(newCustomer)) {
            customers.add(newCustomer);
        }
    }

    public void printStructure(String spaces) {
        System.out.println(this.name);
        System.out.println(spaces + "Angestellte: ");
        for (Employee oneEmployee : employees) {
            oneEmployee.printStructure(spaces);
        }
        System.out.println(spaces + "Kekssorten: ");
        for (Cookie oneCookie : cookies) {
            oneCookie.printStructure(spaces);
        }
        System.out.println(spaces + "Kunden: ");
        for (Customer oneCustomer : customers) {
            oneCustomer.printStructure(spaces);
        }
    }

}
