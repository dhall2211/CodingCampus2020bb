package Bokhee.Werkstatt_II;


public class Fahrer {
    private String name;
    private Auto auto;
    private Werkstatt werkstatt;

    public Fahrer(String name, Auto auto, Werkstatt werkstatt){
        this.name = name;
        this.auto = auto;
        this.werkstatt = werkstatt;
    }

    public Fahrer(String name){
        this.name = name;
        this.auto = auto;
        this.werkstatt = werkstatt;
    }


    public void fahren(int km, Tankstelle tankstelle){
        if ((auto != null) && (werkstatt != null) && (tankstelle != null)){
            auto.fahren(km,this,tankstelle,werkstatt);
        } else {
            System.out.println(this.name + " muss heute mit Bus fahren, weil er/sie kein Auto, keine Tankstelle oder keinen Werkstatt hat.");
        }
    }
    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Auto getAuto() {
        return auto;
    }

    public Werkstatt getWerkstatt() {
        return werkstatt;
    }

    public String getName() {
        return name;
    }
}

