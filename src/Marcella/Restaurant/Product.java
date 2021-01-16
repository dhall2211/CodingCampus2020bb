package Marcella.Restaurant;

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
        return "Product{" +
                "catagory='" + catagory + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
