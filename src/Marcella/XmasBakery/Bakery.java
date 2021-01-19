package Marcella.XmasBakery;

import java.util.Vector;

public class Bakery {

    private String name;
    private Vector<Employee> employees;
    private Vector<Cookie> cookies;
    private Vector<Customer> customers;
    private Vector<Order> orders;

    public Bakery(String name) {
        this.name = name;
        this.employees = new Vector<>();
        this.cookies = new Vector<>();
        this.customers = new Vector<>();
        this.orders = new Vector<>();
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

    public void addNewOrder(Order newOrder) {
        if (!orders.contains(newOrder)) {
            orders.add(newOrder);
        }
    }

    public void produceCookie() {
        for (Order oneOrder : orders) {
            for (OrderDescription oneOrderDescription : oneOrder.getOrderDescriptions()) {
                String nameCookie = oneOrderDescription.getNameCookie();
                int amountCookies = oneOrderDescription.getAmountCookies();
                for (Employee oneEmployee : employees) {
                    if (nameCookie.equals(oneEmployee.getBestCookie())) {
                        oneEmployee.produceCookies(amountCookies);
                    }
                }
            }
        }
    }

        public Vector<Order> getOrders () {
            return orders;
        }

        public void printStructure (String spaces){
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
