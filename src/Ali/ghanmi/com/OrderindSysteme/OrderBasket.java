package Ali.ghanmi.com.OrderindSysteme;

import java.util.Vector;

public class OrderBasket {
    private Product product;
    private int amount;

    public OrderBasket(Product product, int amount) {
        this.product = product;
        this.amount = amount;
        }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
    }
    public void printStructure(String prefix) {
        System.out.println(prefix+"   Artikel: "+product+"Quantität: "+amount);

    }
}