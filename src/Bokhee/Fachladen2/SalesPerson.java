package Bokhee.Fachladen2;

public class SalesPerson implements IAgent {

    private String name;
    private int age;

    public SalesPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void rentProduct(IProduct product, Customer customer) {
        System.out.println(this.name + " rent " + product + "to " + customer );

    }

    public boolean councelCustomer(String name) {
        if ((this.name != null) && (this.name.equals(name))) {
            System.out.println(name + "gives advice to   ");
            return true;
        } else
            return false;
    }

    @Override
    public Enum askProductFor(Enum category) {
        return category;
    }

    @Override
    public void reserveProduct(IProduct product, Customer customer) {

    }

    public String getName() {
        return name;
    }


}
