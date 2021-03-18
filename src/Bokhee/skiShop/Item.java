package Bokhee.skiShop;

public class Item {

    private static int counter = 0;

    private Category category;
    private int inventaryID;
    private boolean isReserved;
    private boolean isRented;

    public Item(Category category) {
        this.category = category;
        this.inventaryID = counter++;
    }

}
