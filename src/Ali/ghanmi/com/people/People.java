package ghanmi.com.people;

import java.util.Objects;

public class People {
    private String Vorname;
    private String Nachname;
    private int Geburtsjahr;
    private String Geburtsort;
    private char Geschlecht;

    People(String Vorname, String Nachname, int Geburtsjahr, String Geburtsort, char Geschlecht) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Geburtsjahr = Geburtsjahr;
        this.Geburtsort = Geburtsort;
        this.Geschlecht = Geschlecht;
    }

    public String getVorname()
    {
        return Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public int getGeburtsjahr() {
        return Geburtsjahr;
    }


    public String getGeburtsort() {
        return Geburtsort;
    }

    public char getGeschlecht() {
        return Geschlecht;
    }

    @Override
    public String toString() {
        return "Person: ist am " + Geburtsjahr + " in " + Geburtsort + " geboren und ist " + Geschlecht;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Geburtsjahr == people.Geburtsjahr &&
                Objects.equals(Vorname, people.Vorname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Vorname, Geburtsjahr);
    }
}

