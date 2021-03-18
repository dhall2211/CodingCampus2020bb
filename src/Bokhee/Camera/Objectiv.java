package Bokhee.Camera;

public class Objectiv {
    private int minBrennweite; // Pflicht-Parameter
    private int maxBrennweite; // Pflicht-Parameter
    private int currentBrennweite; // Default: minBrennweite

    Objectiv(int minBrennweite, int maxBrennweite){
        this.minBrennweite = minBrennweite;
        this.maxBrennweite = maxBrennweite;
        this.currentBrennweite = minBrennweite;
    }

    public int getMinBrennweite() {
        return minBrennweite;
    }

    public int getMaxBrennweite() {
        return maxBrennweite;
    }
}
