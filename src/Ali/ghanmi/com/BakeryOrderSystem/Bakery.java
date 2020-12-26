package Ali.ghanmi.com.BakeryOrderSystem;

import java.util.Arrays;
import java.util.Vector;

public class Bakery {
    private String name;
    private Vector<Staff> staffs;
    private Vector<Cokie> cokies;
    private Vector<OrderBasket> pendingOrders;
    private Vector<Customer> customers;

    public Bakery(String name) {
        this.name = name;
        this.staffs = new Vector<>();
        this.cokies = new Vector<>();
        this.pendingOrders = new Vector<>();
        this.customers = new Vector<>();


    }

    public Customer searchAndCreateCustomer(String name, String adress) {
        // search[]
        for (Customer customer : customers) {
            if (customer.getName().equals(name) && customer.getAdress().equals(adress)) {
                return customer;
            }
        }

        // or create
        Customer customer = new Customer(name, adress);
        customers.add(customer);
        return customer;
    }

    public Staff searchAndCreateStaff(String name, int bakingCapacity, String favoriteCokie, String[] cokiesNames, Bakery bakery) {
        // search[]
        for (Staff staff : staffs) {
            if (staff.getName().equals(name)) {
                return staff;
            }
        }

        Vector<Cokie> cokies = new Vector<>();
        for (var cokiesName : cokiesNames) {
            var cokie = searchAndCreateCokies(cokiesName);

            cokies.add(cokie);
        }
        // or create
        var staff = new Staff(name, bakingCapacity, favoriteCokie, cokies, this);
        staffs.add(staff);
        return staff;
    }

    public Cokie searchAndCreateCokies(String name) {
        for (int i = 0; i < cokies.size(); i++) {
            if (cokies.get(i).getName().equals(name)) {
                return cokies.get(i);
            }
        }
        Cokie c = new Cokie(name);
        cokies.add(c);
        return c;

    }


    public void addStaff(Staff staff) {
        staffs.add(staff);
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + name);
        for (int i = 0; i < staffs.size(); i++) {
            staffs.get(i).printStructure("--");

        }
    }

    public void logIn(String name, String adress) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name) && customer.getAdress().equals(adress)) {
                System.out.println("Herzlich Willkommen bitte Wälen sie ihre geewünschte artikeln");
               System.out.println(cokies.toString()+"\n");
            } else {
                System.out.println("falsche eingaben versuchen sie nochmal, ");
            }
        }
    }

    public Customer CreateCustomer(String name, String adress) {

        Customer customer = new Customer(name, adress);
        customers.add(customer);
        System.out.println("erfolgreich angemeldet");
        return customer;
    }


    public void CreateOrderBascket(int amount, String name){
        int startNum=1000;
        int letznum=0;

        for (int i = 0; i < cokies.size(); i++)
            if ((cokies.get(i).getName().equals(name)) &&
                    (amount == 200 || amount == 400 || amount == 600 || amount == 800)) {
               startNum +=5;

                System.out.println("danke für ihren auswahl");

            }else{
                System.out.println(" Bitte auswal anpassen, Menge und sorte");
            }
}
}

/*
 public Customer newInscreption(){
            Customer customer = new Customer(name, adress);
            customers.add(customer);
        }

    }
}
 */


