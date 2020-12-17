package Eric._zoo_simulation.food;

public abstract class Food {

    private String name;
    private double quantity;
    private String unit;

    public Food(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Food(String name, double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
