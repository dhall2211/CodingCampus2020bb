package Bokhee.Werkstatt;


public class Fahrer {
    private String name;
    private Auto auto;
    private Werkstatt werkstatt;

    public Fahrer(String name, Werkstatt werkstatt, Auto auto){
        this.name = name;
        this.werkstatt = werkstatt;
        this.auto = auto;
    }

    public Fahrer(String name, Werkstatt werkstatt){
        this.name = name;
        this.werkstatt = werkstatt;
        this.auto = null;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void fahren(int km, Tankstelle tankstelle){
        if ((auto != null) && (werkstatt != null) && (tankstelle != null)){
            auto.fahren(km, tankstelle, werkstatt, this);
        } else {
            System.out.println(name + " muss heute mit Bus fahren, weil er/sie kein Auto, keine Tankstelle oder keinen Werkstatt hat.");
        }
    }

    public String getName() {
        return name;
    }
}
