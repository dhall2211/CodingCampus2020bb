package Ali.ghanmi.com.BakeryOrderSystem;

public class Customer {
    private String name;
    private String adress;

    public Customer(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }
}
