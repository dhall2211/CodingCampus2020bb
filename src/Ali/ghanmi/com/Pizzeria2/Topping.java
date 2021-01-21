package Ali.ghanmi.com.Pizzeria2;

public class Topping {

    private int idNumberTopping;
    private String name;
    private double price;

    public Topping(int idNumberTopping, String name, double price) {
        this.idNumberTopping = idNumberTopping;
        this.name = name;
        this.price = price;
    }

    public int getIdNumberTopping() {
        return idNumberTopping;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Topping: " + idNumberTopping + ", name: " + name + '\'' + ", price: " + price ;
    }
}
