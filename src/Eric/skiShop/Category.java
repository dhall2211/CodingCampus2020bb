package Eric.skiShop;

public enum Category {
    HELMET(12),
    SHOES(20),
    GLASSES(8),
    SKI(34);

    private final int price;

    Category(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
