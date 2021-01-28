package Ali.ghanmi.com.KlosterMuseum;

import javax.swing.*;

public class Painting {
    private String typ;
    private String titel;
    private String artist;
    private int yearOfCreation;
    private int price;

    public String getTitel() {
        return titel;
    }

    public Painting(String typ, String titel, String artist, int yearOfCreation, int price) {
        this.typ = typ;
        this.titel = titel;
        this.artist = artist;
        this.yearOfCreation = yearOfCreation;
        this.price = price;
    }


    @Override
    public String toString() {
        return "\n Bilder Titel: "+titel+" ,Typ: "+typ+" ,Artist "+artist+"\n" ;
    }
}
