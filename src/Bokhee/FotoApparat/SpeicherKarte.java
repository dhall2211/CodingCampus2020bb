package Bokhee.FotoApparat;

public class SpeicherKarte {
    private String marke;
    private int benutzteSpeicherPlatz;
    private int speicherPlatz;


    SpeicherKarte(String marke, int benutzteSpeicherPlatz, int speicherPlatz) {
        this.marke = marke;
        this.benutzteSpeicherPlatz = benutzteSpeicherPlatz;
        this.speicherPlatz = speicherPlatz;
    }

    public int getFreierSpeicherPlatz() {
        return speicherPlatz - benutzteSpeicherPlatz;
    }

    public int getBenutzteSpeicherPlatz() {
        return benutzteSpeicherPlatz;
    }

    public void setBenutzteSpeicherPlatz(int benutzteSpeicherPlatz) {
        this.benutzteSpeicherPlatz = benutzteSpeicherPlatz;
    }

    public void speichereFoto() {
        this.benutzteSpeicherPlatz += 5;
    }
}


