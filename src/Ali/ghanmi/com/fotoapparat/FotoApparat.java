package Ali.ghanmi.com.fotoapparat;

public class FotoApparat {
    private String bezeichnung; // Pflicht-Parameter
    private float megapixel; // Pflicht-Parameter
    private String herkunftsLand; // Pflicht-Parameter
    private String funktionen; // Pflicht-Parameter
    private String besitzer; // Optional
    private Objektiv currentObjektiv; // Optional
    private SpeicherKarte speicherKarte;

    // Construktor
    FotoApparat(String bezeichnung, float megapixel, String herkunftsLand, String funktionen) {
        this.bezeichnung = bezeichnung;
        this.megapixel = megapixel;
        this.herkunftsLand = herkunftsLand;
        this.funktionen = funktionen;
        this.besitzer = "";
        this.currentObjektiv = null;
        this.speicherKarte = null;

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

    public void setSpeicherKarte(SpeicherKarte speicherKarte) {

        this.speicherKarte = speicherKarte;
    }


    public boolean machFoto() {
        int occupied = 0;
        int free=0;
        if (speicherKarte != null ) {
            occupied = speicherKarte.getOccupied() + 5;
            int currentCapacity = speicherKarte.getCapacity() - occupied;
            if(currentCapacity>=0)
            System.out.println("Der verfügbare Speicherplatz auf der " + speicherKarte.getBrand() +
                    " beträgt " + currentCapacity);;
        } else {

            System.out.println("Es stekt keine Speicherkarte in der Kamera.");
        }
        return speicherKarte.setOccupied(occupied);
    }
}

/*
    public int machFoto() {

        int occupied = 0;
        if (speicherKarte != null) {
            occupied = speicherKarte.getOccupied() + 5;
            int currentCapacity = speicherKarte.getCapacity() - occupied;
            System.out.println("Der verfügbare Speicherplatz auf der " + speicherKarte.getBrand() + " beträgt " + currentCapacity);
        } else {
            System.out.println("Es stekt keine Speicherkarte in der Kamera.");
        }
        return speicherKarte.setOccupied(occupied);
    }
}

    /*
    int belegte =0;
        if (speicherKarte != null) {
            belegte = speicherKarte.getOccupied() + 5;
            int current = speicherKarte.getCapacity() - belegte;
            System.out.println(speicherKarte.getCapacity() - current);
        }else {
            System.out.println("keine beleg");
        }
        return speicherKarte.setOccupied(current);
    }
}

*/