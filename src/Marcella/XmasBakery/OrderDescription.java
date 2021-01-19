package Marcella.XmasBakery;

public class OrderDescription {

    private String nameCookie;
    private int amountCookies;

    public OrderDescription(Order whoOrders, String nameCookie, int amountCookies) {
        this.nameCookie = nameCookie;
        this.amountCookies = amountCookies;
        whoOrders.addNewOrderDescription(this);
    }

    public String getNameCookie() {
        return nameCookie;
    }

    public int getAmountCookies() {
        return amountCookies;
    }

    public void printOrderDescription() {
        System.out.println("_ " + amountCookies + "-mal " + nameCookie);
    }

}
