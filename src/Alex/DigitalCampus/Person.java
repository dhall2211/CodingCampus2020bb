package Alex.DigitalCampus;

public class Person {
    private String vornahme;
    private String nachnahme;
    private String straße;
    private String hausnummer;
    private String postleitzahl;
    private String wohnort;
    private String land;

    public Person(String vornahme, String nachnahme, String straße, String hausnummer, String postleitzahl, String wohnort, String land) {
        this.vornahme = vornahme;
        this.nachnahme = nachnahme;
        this.straße = straße;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.wohnort = wohnort;
        this.land = land;
    }

    @Override
    public String toString() {
        return "\n" + this.vornahme + " ," + this.nachnahme + " ," +
                this.straße + " ," + this.hausnummer + " ," +
                this.postleitzahl + " ," + this.wohnort + " ," + this.land;
    }


}
