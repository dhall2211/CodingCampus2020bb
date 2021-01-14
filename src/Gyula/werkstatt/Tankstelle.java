package Gyula.werkstatt;

public class Tankstelle {
    private String name;
    private float preisProLiter;

    public Tankstelle(String name, float preisProLiter){
        this.name = name;
        this.preisProLiter = preisProLiter;
    }

    public float getPreisProLiter() {
        return preisProLiter;
    }
}
