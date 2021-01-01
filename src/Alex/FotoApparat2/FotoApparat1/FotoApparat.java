package Alex.FotoApparat2.FotoApparat1;

public class FotoApparat {

    private String marke;

    public FotoApparat(String marke) {
        this.marke = marke;
    }

    @Override
    public String toString() {
        return "FotoApparat der Marke: " + marke;
    }


}