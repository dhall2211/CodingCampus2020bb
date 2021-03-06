package Bokhee.Menschen;

import java.util.Objects;

public class Mensch {
    private String vorname;
    private String nachname;
    private int geburtsjahr;
    private String geburtsort;
    private char geschlecht;


    public Mensch(String vorname, String nachname, int geburtsjahr, String geburtsort, char geschlecht ) {
    this.vorname = vorname;
    this.nachname = nachname;
    this.geburtsjahr = geburtsjahr;
    this.geburtsort = geburtsort;
    this.geschlecht = geschlecht;

    }
    public String getVorname(){
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public int getGeburtsjahr() {
        return geburtsjahr;
    }
    public String getGeburtsort() {
        return geburtsort;
    }
    public char getGeschlecht() {
        return geschlecht;
    }

   @Override
   public String toString() {
        String anrede = "";
        if (geschlecht == 'F') anrede = "Frau ";
        if (geschlecht == 'M') anrede = "Herr ";
        return anrede +vorname+" " + nachname + " aus " + geburtsort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensch mensch = (Mensch) o;
        return geburtsjahr == mensch.geburtsjahr &&
                geschlecht == mensch.geschlecht &&
                Objects.equals(vorname, mensch.vorname) &&
                Objects.equals(nachname, mensch.nachname) &&
                Objects.equals(geburtsort, mensch.geburtsort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname, geburtsjahr, geburtsort, geschlecht);
    }
}