package Eric.skiShop;

public class Item {

    private static int counter = 0;

    private Category category;
    private final int inventaryID;
    private boolean isAvailable;
    // private boolean isRented;

    public Item(Category category) {
        this.category = category;
        this.inventaryID = counter++;
        isAvailable = true;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
