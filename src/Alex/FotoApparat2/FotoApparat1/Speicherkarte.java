package Alex.FotoApparat2.FotoApparat1;

public class Speicherkarte {

    private String marke;
    private double anzahlFotos;
    private  double einFotoGroesse;
    private  double maxSpeicher;

    public Speicherkarte(String marke, double einFotoGrosse, double maxSpeicher) {
        this.marke = marke;
        this.einFotoGroesse = einFotoGrosse;
        this.maxSpeicher = maxSpeicher;
    }

    public double machFoto() {
        anzahlFotos++;
        return anzahlFotos;
    }

    public double loeschFoto() {
        anzahlFotos--;
        return anzahlFotos;
    }

    public double getAnzahlFotos() {
        return anzahlFotos;
    }

    public double getEinFotoGroesse() {
        return einFotoGroesse;
    }

    public double getMaxSpeicher() {
        return maxSpeicher;
    }


    @Override
    public String toString() {
        return "  -Speicherkarte der Marke: " + marke + " max Speicherplatz: " + maxSpeicher + " MB." +
                "\n     Fotos: " + anzahlFotos + "/ " + (maxSpeicher - (anzahlFotos * einFotoGroesse)) + " MB frei=";
    }
}
