package Marcella.FotoApparat;

public class Speicherkarte {

    private String name;
    private int size;
    private int usedSize;

    public Speicherkarte(String name, int size) {
        this.name = name;
        this.size = size;
        this.usedSize = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getSize () {
        return this.size;
    }

    public int getUsedSize () {
        return this.usedSize;
    }

    public void save (int fotoSize) {
        this.usedSize += fotoSize;
    }

    public int getFreeSize() {
        int freeSize = this.size - this.usedSize;
        return freeSize;
    }

    public int getFotosLeft (int fotoSize) {
        int fotosLeft = getFreeSize() / fotoSize;
        return fotosLeft;
    }

}
