package Bokhee.Fachladen2;

public class SelfItem implements IProduct{
    private Shelf shelf;
    private String name;
    private Enum category;
    private int costPerDay;

    public SelfItem(Shelf shelf, String name, Enum category, int costPerDay) {
        this.shelf = shelf;
        this.name = name;
        this.category = category;
        this.costPerDay = costPerDay;
    }


    @Override
    public void getName() {


    }

    @Override
    public int getCostPerDay() {
        return costPerDay;
    }

    @Override
    public boolean reserve() {
        return false;
    }

    @Override
    public boolean isReserved() {
        return false;
    }
}

