package Ali.ghanmi.com.OrderindSysteme;

import java.util.Vector;

public class Customer {
    private String name;
    private String adress;
    private int customerPw;
    private Vector<OrderBasket> orderBaskets;

    public Customer(String name, String adress, int customerPw, Vector<OrderBasket> orderBaskets) {
        this.name = name;
        this.adress = adress;
        this.customerPw = customerPw;
        this.orderBaskets = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public int getCustomerPw() {
        return customerPw;
    }

    public void addOrderbasket(OrderBasket orderBasket) {
        orderBaskets.add(orderBasket);
    }

    public void printStructure(String prefix) {
        System.out.println("Pending  Order");
        System.out.println(prefix+"Kunde: "+name+" bestellung");
        for (int i = 0; i <orderBaskets.size() ; i++) {
            System.out.println("         Produkt: "+orderBaskets.get(i).getProduct().getName()+"," +
                    " Quantität: "+orderBaskets.get(i).getAmount());
        }
        System.out.println();
    }

    }
