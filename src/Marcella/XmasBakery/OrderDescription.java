package Marcella.XmasBakery;

public class OrderDescription {

    private Customer nameCustomer;
    private String nameCookie;
    private String amountCookies;

    public OrderDescription(Customer whoOrders, String[][] orderDescriptions) {
        this.nameCustomer = whoOrders;
        for (String[] oneOrderDescription : orderDescriptions) {
            this.nameCookie = oneOrderDescription[0];
            this.amountCookies = oneOrderDescription[1];
        }
        whoOrders.addNewOrderDescription(this);
}

    public void printOrderDescription() {
        System.out.println(amountCookies + "-mal " + nameCookie);
    }

}
