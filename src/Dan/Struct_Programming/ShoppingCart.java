import java.util.Base64;

public class ShoppingCart {
    private int numberOfItems;
    private int totalAmount;
    void addAnItem() {}
   // void deleteAnItem {}



}

class Item extends ShoppingCart {
    private boolean IsSavedLater;
    private boolean inStock;
    private String itemName;
    private float  prices;
    private String description;
    private Base64 image;
    private String brand;

}