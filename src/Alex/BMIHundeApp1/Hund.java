package Alex.BMIHundeApp1;

public class Hund extends Lebewesen {//Vererbung
    private Hundespielzeug hundespielzeug;

    public Hund(String name, double gewicht, double groesse) {//Konstruktor mit übergabe Parameter
        super();
        System.out.println("Hier wird der Hund erstellt.");
        super.setName(name);//setter methode der Vaterklasse
        super.setGewicht(gewicht);
        super.setGroesse(groesse);
    }


    protected double gewicht = 100;//wird ignoriert

    public Hundespielzeug getHundespielzeug() {
        return hundespielzeug;
    }

    public void setHundespielzeug(Hundespielzeug hundespielzeug) {
        this.hundespielzeug = hundespielzeug;
    }

    public void isst() {
        super.gewicht += 0.1;//super bezieht sich auf die Oberklasse(Vaterklasse-Lebewesen)
    }

    public void isst(double menge) {
        super.gewicht += menge;
    }

    public void spielt() {
        super.gewicht -= 0.1;
    }

}

