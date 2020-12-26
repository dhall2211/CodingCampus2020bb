package Ali.ghanmi.com.BakeryOrderSystem;

public class OrderBasket {
    private int amount;
    private String cokies;
    private int orderNumber;


    public OrderBasket(int amount, String cokies) {
        this.amount = amount;
        this.cokies = cokies;

        orderNumber = 1000;
        for (int i = 0; i < 100; i++) {
            orderNumber += 5;
        }
    }

    public void setAmount(int amount) {
        int saleUnite1 = 200;
        int saleUnite2 = 400;
        int saleUnite3 = 600;
        int saleUnite4 = 800;
        if (amount == saleUnite1 || amount == saleUnite2 || amount == saleUnite3 || amount == saleUnite4)
            this.amount = amount;


    }
}
