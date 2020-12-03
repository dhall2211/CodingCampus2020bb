package Sabrina.fotoapparat;

public class Speicherkarte {
    private int speicherPlatz;
    private int foto;

    public Speicherkarte(int speicherPlatz, int foto) {
        this.speicherPlatz = speicherPlatz;
        this.foto = foto;
    }

    public int getSpeicherPlatz() {
        return speicherPlatz;
    }

    public int getFoto() {
        return foto;
    }

    public void setSpeicherPlatz(int speicherPlatz) {
        this.speicherPlatz = speicherPlatz;
    }
}

