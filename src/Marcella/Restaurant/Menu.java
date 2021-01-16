package Marcella.Restaurant;

import java.util.Arrays;
import java.util.Vector;

public class Menu {

    private Vector<Product> products;

    public Menu() {
        this.products = new Vector<>();
    }

    public void addProducts(Product[] products) {
        for (Product oneProduct : products) {
            this.products.add(oneProduct);
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "products=" + Arrays.toString(products.toArray()) +
                '}';
    }
}
