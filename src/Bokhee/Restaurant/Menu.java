package Bokhee.Restaurant;


import java.util.Vector;

public class Menu {

    private Vector<Product> products;

    public Menu() {
        this.products = new Vector<>();
    }
    // String자료 여러개 받아 Vector에 집어넣는 법
    public void addProducts(Product[] products){
        for (Product oneProduct: products) {
            this.products.add(oneProduct);
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "products=" + products +
                '}';
    }
}
