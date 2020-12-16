package Daniel.Zoo;

public class Demand {
    private Food food;
    private int amount;

    public Demand(Food food, int amount) {
        this.food = food;
        this.amount = amount;
    }

    public Food getFood() {
        return food;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return amount + food.getUnit() + " " + food.getName();
    }
}
