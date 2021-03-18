package Bokhee.Abteilung;

import java.util.Vector;

public class Mitarbeiter {
    private String mitArbeiterName;
    private Abteilung aktuelleAbteilung;
    private Vector<Mitarbeiter> mitArbeiterListe;


    public Mitarbeiter(String mitArbeiterName, Abteilung aktuelleAbteilung) {
        this.mitArbeiterName = mitArbeiterName;
        this.aktuelleAbteilung = aktuelleAbteilung;
        this.mitArbeiterListe = new Vector<>();

        if (aktuelleAbteilung != null) {
            mitArbeiterListe.add(this);
        }

        // remove employee from Department
    }
    // add employee to Department

    public void connectToDepartment(Abteilung abteilung) {
        if (aktuelleAbteilung != null) {
            if (aktuelleAbteilung != abteilung) {
                System.out.println(mitArbeiterName + " arbeitet neu in " + abteilung);
                aktuelleAbteilung.connectToDepartment(abteilung);
            }
            aktuelleAbteilung = abteilung;
        }
    }
        public void setAktuelleAbteilung (Abteilung aktuelleAbteilung){
            this.aktuelleAbteilung = aktuelleAbteilung;
        }

        @Override
        public String toString(){
            return "mitArbeiterName='" + mitArbeiterName + "\n" +
                    ", aktuelleAbteilung=" + aktuelleAbteilung;
        }
    }

