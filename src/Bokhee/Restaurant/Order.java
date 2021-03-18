package Bokhee.Restaurant;

public class Order {
    private Table orderNumber;
    private Product product;


    public Order(Table orderNumber, Product product) {
        this.orderNumber = orderNumber;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public Table getOrderNumber() {
        return orderNumber;
    }
}
