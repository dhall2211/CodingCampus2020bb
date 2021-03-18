package Bokhee.Werkstatt_II;

public class Tankstelle {
    private String name;
    private float preisProLiter ;

    public Tankstelle(String name, float preis) {
        this.name = name;
        this.preisProLiter = preisProLiter;
    }

    public String getName() {
        return name;
    }

    public float getPreis() {
        return preisProLiter;
    }

}
