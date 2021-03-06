package Ali.ghanmi.com.OrderindSysteme;

import java.util.Vector;

public class Customer {
    private String name;
    private String adress;
    private int customerPw;
    private Vector<Order> orders;
    private Vector<OrderBasket> orderBaskets;

    public Customer(String name, String adress, int customerPw, Vector<OrderBasket> orderBaskets) {
        this.name = name;
        this.adress = adress;
        this.customerPw = customerPw;
        this.orders = new Vector<>();
        this.orderBaskets = new Vector<>();
    }
        public Customer(String name, String adress, int customerPw) {
            this.name = name;
            this.adress = adress;
            this.customerPw = customerPw;
    }

    public String getName() {
        return name;
    }

    public int getCustomerPw() {
        return customerPw;
    }

    public void addOrderbasket(OrderBasket orderBasket) {
        if (orderBasket.getAmount() == 200 || orderBasket.getAmount() == 400 || orderBasket.getAmount() == 600 || orderBasket.getAmount() == 800) {
            orderBaskets.add(orderBasket);
        } else {
           // orderBaskets.remove(orderBasket);
            System.out.println("errrror");;
        }
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
