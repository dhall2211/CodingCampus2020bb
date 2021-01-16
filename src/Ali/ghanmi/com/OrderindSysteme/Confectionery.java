package Ali.ghanmi.com.OrderindSysteme;

import java.util.Vector;

public class Confectionery {
    private String name;
    private Vector<Staff> staffs;
    private Vector<Product> products;
    private Vector<Customer> customers;
    private Vector<Order> orders;
    private Vector<OrderBasket> orderBaskets;


    public Confectionery(String name) {
        this.name = name;
        this.products = new Vector<>();
        this.staffs = new Vector<>();
        this.orders = new Vector<>();
        this.customers = new Vector<>();
        this.orderBaskets =new Vector<>();
    }

    @Override
    public String toString() {
        return "Bakery: " + name;
    }


    public Staff searchAndCreateStaff(String name, Product specialty, int produktionCapacity, String[] productsNames) {
        for (Staff staff : staffs) {
            if (staff.getName().equals(name)) {
                return staff;
            }
        }
        Vector<Product> products = new Vector<>();
        for (var productsname : productsNames) {
            var pruduct = searchAndCreateProduct(productsname);
            products.add(pruduct);
        }

        Staff staff = new Staff(name, specialty, produktionCapacity, products, this);
        staffs.add(staff);
        return staff;
    }

    public Customer searchAndCreatCustomer(String name, String adress, int customerPw, String[] basketLists) {
        for (Customer customer : customers) {
            if ((customer.getName().equals(name) && customer.getCustomerPw() == customerPw)) {
                return customer;
            }

        }
        Customer cus = new Customer(name, adress, customerPw, orderBaskets);
        customers.add(cus);
        return cus;
    }
    public Customer CreateCustomer(String name, String adress, int customerPw) {
        Customer customer = new Customer(name, adress, customerPw);
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerPw() == customerPw) {
                System.out.println("Versuche mit eine andere customerNumber");
            } else {
                customers.add(customer);
                System.out.println("erfolgreich angemeldet");
                return customer;
            }
        }
        return customer;
    }

    public Vector<OrderBasket> addBasket(OrderBasket orderBasket) {
        orderBaskets.add(orderBasket);
        return orderBaskets;

    }

    public Product searchAndCreateProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                return products.get(i);
            }
        }
        Product p = new Product(name);
        products.add(p);
        return p;
    }

    public void printStructure(String prefix) {
        System.out.println("unsere bäckerei läuft nach plan\n" + prefix + " " + name + "\n");
        for (int i = 0; i < staffs.size(); i++) {
            staffs.get(i).printStructure("--");
        }
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).printStructure("--");
        }
        for (int i = 0; i <orders.size() ; i++) {
            orders.get(i).printStructure("--");

        }
    }

    public void logIn(String name, int customerPw) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name) && customer.getCustomerPw() == customerPw) {
                System.out.println("Herzlich Willkommen " + customer.getName() + " bitte Wälen sie ihre" +
                        " geewünschte artikeln und Menge");
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(products.get(i).getName());
                    System.out.println("200g\n400g\n600g\n800g\n");
                }
                if (!(customer.getName().equals(name) || customer.getCustomerPw() == customerPw)) {
                        System.out.println("name oder pw falsch");
                    }
                }
            }

        }
    }

