package Daniel.Static;

public class Shop {
    // Klassen-Attribute
    private static final double PRICE_APPLE = 0.5;
    // Objekt-Attribute
    private final String name;
    private int appleStock;

    public Shop(String name, int appleStock) {
        this.name = name;
        this.appleStock = appleStock;
    }

    public static double getApplePrice() {
        return PRICE_APPLE;
    }

    public static void main(String[] args) {
        System.out.println("Äpfel kosten immer " + Shop.getApplePrice());

        Shop appleShop = new Shop("Daniel Apfelstore", 20);
        appleShop.buyApples(5);
        appleShop.buyApples(25);
    }

    public String getName() {
        return name;
    }

    public void buyApples(int count) {
        if (appleStock >= count) {
            appleStock -= count;
            System.out.println("bought " + count + " apples with a total price of " + (Shop.PRICE_APPLE * count));
            return;
        }
        System.out.println("not enough apples in stock");
    }
}
