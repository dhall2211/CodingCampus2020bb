package Bokhee.WeihnachtsBaeckerei;

import java.util.Vector;

public class OrderItem{
    private Cookie cookie;
    private int orderAmount;

    public OrderItem(Cookie cookie, int orderAmount) {
        this.cookie = cookie;
        this.orderAmount = orderAmount;
    }

    public int getAmount() {
        return orderAmount;
    }

    public Cookie getCookie() {
        return cookie;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "cookie=" + cookie +
                ", orderAmount=" + orderAmount +
                '}';
    }
}

