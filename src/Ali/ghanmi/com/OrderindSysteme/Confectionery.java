package Ali.ghanmi.com.OrderindSysteme;

import java.util.Vector;

public class Confectionery {
    private String name;
    private Vector<Staff> staffs;
    private Vector<Product> products;
    private Vector<Customer> customers;
    private Vector<Ali.ghanmi.com.OrderindSysteme.OrderBasket> orderBaskets;
    private OrderBasket OrderBasket;


    public Confectionery(String name) {
        this.name = name;
        this.products = new Vector<>();
        this.staffs = new Vector<>();
        this.orderBaskets = new Vector<Ali.ghanmi.com.OrderindSysteme.OrderBasket>();
        this.customers = new Vector<>();
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
        for (int i = 0; i <customers.size() ; i++) {
            customers.get(i).printStructure("--");

        }
    }

}