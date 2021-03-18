package Bokhee.Restaurant;

public class Product {

    private String category;
    private String menuName;
    private double price;

    public Product(String category, String menuName, double price) {
        this.category = category;
        this.menuName = menuName;
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public double getPrice() {
        return price;
    }
}
