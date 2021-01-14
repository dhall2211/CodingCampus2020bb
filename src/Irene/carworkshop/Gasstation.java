package Irene.carworkshop;

public class Gasstation {
    private String stationName;
    private float fuelPricePerLitre;


    public Gasstation(String stationName, float fuelPricePerLitre) {
        this.stationName = stationName;
        this.fuelPricePerLitre = fuelPricePerLitre;
    }

    public float getFuelPricePerLitre() {
        return fuelPricePerLitre;
    }
}
