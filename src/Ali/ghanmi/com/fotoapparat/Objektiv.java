package Ali.ghanmi.com.fotoapparat;

public class Objektiv {
    private int minBrennweite; // Pflicht-Parameter
    private int maxBrennweite; // Pflicht-Parameter
    private int currentBrennweite; // Default: minBrennweite

    Objektiv(int minBrennweite, int maxBrennweite){
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
