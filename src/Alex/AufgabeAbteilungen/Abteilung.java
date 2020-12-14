package Alex.AufgabeAbteilungen;

import java.util.Vector;

public class Abteilung {

    private String nameLeiter;
    private String nameAbteilung;
    private Abteilung elternAbteilung;
    private Vector<Abteilung> kinderAbteilung;

    public Abteilung(String nameLeiter, String nameAbteilung, Abteilung elternAbteilung) {
        this.nameLeiter = nameLeiter;
        this.nameAbteilung = nameAbteilung;
        this.elternAbteilung = elternAbteilung;
        this.kinderAbteilung = new Vector<>();

        if (elternAbteilung != null) {
            elternAbteilung.kinderAbteilung.add(this);
        }
    }

   /* public Abteilung(String nameLeiter, String nameAbteilung) {
        this(nameLeiter, nameAbteilung, null);
    }

    public void connectToAbteilung(Abteilung eltern) {
        if (elternAbteilung != null) {
            System.out.println(nameAbteilung + " ist eine Unterabeitlung von " + elternAbteilung.nameAbteilung);
        } else {
            elternAbteilung = eltern;
            eltern.kinderAbteilung.add(this);
        }
    }

    */

    @Override
    public String toString() {
        return "-" + nameAbteilung + "," + nameLeiter + "toString";

    }
}
