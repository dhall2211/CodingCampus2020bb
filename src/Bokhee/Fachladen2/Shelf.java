package Bokhee.Fachladen2;

public class Shelf {
    private int helm;
    private int poles;
    private int skiboots;
    private int googles;
    private int gloves;
    private int sleigh;

    public Shelf(int helm, int poles, int skiboots, int googles, int gloves, int sleigh) {
        int amountInStock = 10;
        this.helm = helm + amountInStock;
        this.poles = poles + amountInStock;
        this.skiboots = skiboots + amountInStock;
        this.googles = googles + amountInStock;
        this.gloves = gloves + amountInStock;
        this.sleigh = sleigh + amountInStock;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "helm=" + helm +
                ", poles=" + poles +
                ", skiboots=" + skiboots +
                ", googles=" + googles +
                ", gloves=" + gloves +
                ", sleigh=" + sleigh +
                '}';
    }
}
