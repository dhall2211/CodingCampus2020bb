package ghanmi.com.foto;

public class FotoApparat {
    private String Brand;
    private String Model;
    private int SerieNumber;
    private String Artikelbezeichnung;
    private String Herkunftsland;
    private String color;
    private int Megapixel;
    private int ISO_Lichtempfindlichkeit;
    private String Videoauflösung;
    private double Bildschirmgrösse;
    private int Brennweite;
    private int Gewicht;
    private double Höhe;
    private double Breite;
    private double Tiefe;


    public FotoApparat(String brand, String model, int serieNumber, String artikelbezeichnung, String herkunftsland, String color, int megapixel, int iso_lichtempfindlichkeit, String videoauflösung, double bildschirmgrösse, int brennweite, int gewicht, double höhe, double breite, double tiefe) {
        this.Brand = brand;
        this.Model = model;
        this.SerieNumber = serieNumber;
        this.Artikelbezeichnung = artikelbezeichnung;
        this.Herkunftsland = herkunftsland;
        this.color = color;
        this.Megapixel = megapixel;
        this.ISO_Lichtempfindlichkeit = iso_lichtempfindlichkeit;
        this.Videoauflösung = videoauflösung;
        this.Bildschirmgrösse = bildschirmgrösse;
        this.Brennweite = brennweite;
        this.Gewicht = gewicht;
        this.Höhe = höhe;
        this.Breite = breite;
        this.Tiefe = tiefe;
    }

    public String getBrand() {
        return Brand;
    }

    public String getArtikelbezeichnung() {
        return Artikelbezeichnung;
    }

    public int getMegapixel() {
        return Megapixel;
    }

    public String getVideoauflösung() {
        return Videoauflösung;
    }

    @Override
    public String toString() {
        return "fotoApparat" + Brand + '\'' +
                ", Model:" + Model + '\''
                + Artikelbezeichnung + '\'' +
                ", Megapixel=" + Megapixel +
                ", Videoauflösung:'" + Videoauflösung + '\'' +
                ", Bildschirmgrösse:" + Bildschirmgrösse +
                '}';
    }
}

/*
    public void setMegapixel(int megapixelMIn, int megapixelMax) {
        if (megapixelMIn < megapixelMax) {
            this.megapixelMIn = megapixelMIn;
            this.megapixelMax = megapixelMax;

        } else {
            throw new IllegalArgumentException();
            System.out.println("Minimalpixel soll nicht grösser als maximale wert");
        }
    }
}

/*

    public void setBrennweite(int brennweiteMin, int brennweiteMax) {
        int brennweite = 0;

        if (brennweite < brennweiteMin || brennweite > brennweiteMax) {
            System.out.println("brennweite Not Within Rang, Min: " + brennweiteMin + " Max:" + brennweiteMax);
        } else {
            this.Brennweite = brennweite;
        }
    }
}
*/