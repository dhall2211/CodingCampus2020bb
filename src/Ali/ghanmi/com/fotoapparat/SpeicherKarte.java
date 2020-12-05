package Ali.ghanmi.com.fotoapparat;

public class SpeicherKarte {
    private String brand;
    private int capacity;
    private int occupied;

    public void setFotoapparat(FotoApparat fotoapparat) {
        this.fotoapparat = fotoapparat;
    }

    private FotoApparat fotoapparat;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public FotoApparat getFotoapparat() {
        return fotoapparat;
    }

    public int getCapacity() {
        return capacity;
    }


    public void setCapacity(int capacity) {
        if ((capacity > 0) && (capacity < 5000)) {
            this.capacity = capacity;
        }
    }
    public int getOccupied() {
        return occupied;
    }

    public SpeicherKarte(String brand, int capacity, int occupied) {
        this.capacity = capacity;
        this.brand = brand;
        this.occupied = occupied;
    }

    public boolean setOccupied(int occupied) {
        this.occupied = occupied;
        return false;
    }


    public void seipcherPlatz() {

       if ( fotoapparat.machFoto() && getCapacity()>0) setOccupied(+5);
        System.out.println(occupied);
    }
}
