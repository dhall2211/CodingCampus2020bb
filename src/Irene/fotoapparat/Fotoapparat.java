package Irene.fotoapparat;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Fotoapparat {
    private String bezeichnung; // Pflicht-Parameter
    private float megapixel; // Pflicht-Parameter
    private String herkunftsLand; // Pflicht-Parameter
    private String funktionen; // Pflicht-Parameter
    private String besitzer; // Optional
    private Objektiv currentObjektiv; // Optional
    private Speicherkarte speicherkarte;

    // Construktor
    Fotoapparat(String bezeichnung, float megapixel, String herkunftsLand, String funktionen){
        this.bezeichnung = bezeichnung;
        this.megapixel = megapixel;
        this.herkunftsLand = herkunftsLand;
        this.funktionen = funktionen;
        this.besitzer = "";
        this.currentObjektiv = null;
        this.speicherkarte = null;
    }

    public void setSpeicherkarte(Speicherkarte speicherkarte) {
        this.speicherkarte = speicherkarte;
    }

    public int takePicture(Speicherkarte speicherkarte){
        int occupied = 0;
        if(speicherkarte != null) {
            occupied = speicherkarte.getOccupiedCapacity() + 5;
            int currentCapacity = speicherkarte.getCapacity() - occupied;
            System.out.println("Der verfügbare Speicherplatz auf der " + speicherkarte.getBrand() + " beträgt " + currentCapacity);
        } else {
            System.out.println("Es stekt keine Speicherkarte in der Kamera.");
        }
        return speicherkarte.setOccupiedCapacity(occupied);
    }

    public void setCurrentObjektiv(Objektiv currentObjektiv) {
        this.currentObjektiv = currentObjektiv;
    }

    @Override
    public String toString() {
        if (currentObjektiv != null) {
            return String.format("%s %d-%dmm Objektiv",
                    bezeichnung,
                    currentObjektiv.getMinBrennweite(),
                    currentObjektiv.getMaxBrennweite());
        } else {
            return bezeichnung + " ohne Objektiv";
        }
    }
}
