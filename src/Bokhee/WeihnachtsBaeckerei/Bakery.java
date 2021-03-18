package Bokhee.WeihnachtsBaeckerei;

import java.util.Vector;

public class Bakery {
    private String name;
    private Vector<Employee> employees;
    private Vector<Customer> customers;
    private Vector<Cookie> cookies;
    private Vector<Order> orders;

    public Bakery(String name) {
        this.name = name;
        this.employees = new Vector<>();
        this.customers = new Vector<>();
        this.cookies = new Vector<>();
        this.orders = new Vector<>();
    }

    public void addEmployee(Employee name) {
        if (!employees.contains(name)) {
            employees.add(name);
        }
    }

    public void addCustomer(Customer name) {
        if (!customers.contains(name)) {
            customers.add(name);
        }
    }

    public void addCookie(Cookie name) {
        if (!cookies.contains(name)) {
            cookies.add(name);
        }
    }

   /* public Customer searchAndRegisterNewCustomer(String name, String adresse) {
        if (customers.size() !=0 ){
            if(!customers.contains(name)){
               System.out.println("new Registration :  " + name + " received.");
               customers.add(new Customer(name,adresse));
               return name;
            }
        }
        String exisitingCustomer = name;
        return exisitingCustomer;
    }

    public Vector<Order> orderCookie(Customer customer, String[] cookies, int[] numberOfUnity) {
        if( customers.size() !=0){
            System.out.println(customer.getName()+"has placed an order with \n" + cookies.toString())+"\t"  + numberOfUnity.toString());
            for (int i = 0; i < cookies.length; i++) {
                 this.cookies[i] = cookies[i];
                for (int j = 0; j < numberOfUnity.length; j++) {
                    this.cookies[i] = numberOfUnity[j];
                }
            }
        }
        var cookieList = this.cookies;
        return cookieList;
    }

   public Order orderCookie(Customer customer, Vector<OrderItem> orderItems) {
        for (int i = 0; i < customers.size() ; i++) {
            if(customers.get(i).equals(customer.getName())){
                for (int j = 0; j < orderItems.size(); j++) {
                    orders.addAll(orderItems);
                }
            } System.out.println(customer + " ordered : " + orders.toString());

        } return Vector<Order> orders;
    }


    public boolean addNewEmployee(String name, String favoriteCookie, int productionsCapacity) {
        if (employees.contains(name)) {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getName().equals(name)) {
                    System.out.println(employees.get(i) + " is already registered as an employee.");
                    return true;
                } else {
                    Employee newEmployee = new Employee(name, favoriteCookie, productionsCapacity);
                }
            }

        } return false;
    }*/

    @Override
    public String toString() {

        return "==============================" + "\n" +
                "||      " + name + "        ||" + "\n" +
                " ============================== " + "\n" +
                " employees" + employees.toString() + "\n" +

                " customers" + customers.toString() + "\n" +

                " cookies" + cookies.toString() + "\n" +

                " orders" + orders.toString() + "\n" +
                " ============================== ";
    }

    public void printCookieSort() {
        System.out.println(cookies.toString());
    }

    public void printEmployeeList() {
        System.out.println(employees.toString());
    }

    public void printOrderList() {
        System.out.println(orders.toString());
    }

    public void printCustomerList() {
        System.out.println(customers.toString());
    }
}