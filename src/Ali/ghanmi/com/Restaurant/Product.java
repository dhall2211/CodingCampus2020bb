package Ali.ghanmi.com.Restaurant;

public class Product {

    private String catagory;
    private String name;
    private double price;

    public Product(String catagory, String name, double price) {
        this.catagory = catagory;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" +
                "Product: " + "catagory: " + catagory  + ", name: '" + name + ", price: " + price+"\n";
    }

    public String getCatagory() {
        return catagory;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
