package Ali.ghanmi.com.BakeryOrderSystem;

public class Customer {
    private String name;
    private String adress;
    private int customerNumber;

    public Customer(String name, String adress,int customerNumber) {
        this.name = name;
        this.adress = adress;
        this.customerNumber =customerNumber;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
}
