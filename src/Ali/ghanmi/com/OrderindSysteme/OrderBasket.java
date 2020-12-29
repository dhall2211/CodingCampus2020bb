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
        if (amount == 200 || amount == 400 || amount == 600 || amount == 800 ){
            this.amount = amount;
        }else{
            System.out.println("Menge soll 200 oder 400 oder 600 oder 800 sein");
        }
    }
    public void printStructure(String prefix) {
        System.out.println(prefix+"   Artikel: "+product+"Quantität: "+amount);

    }
}