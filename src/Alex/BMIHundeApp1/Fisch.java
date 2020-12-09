package Alex.BMIHundeApp1;

public class Fisch extends Lebewesen{
    public void isst() {
        super.gewicht += 0.001;//super bezieht sich auf die Oberklasse(Vaterklasse-Lebewesen)
    }

    public void isst(double menge) {
        super.gewicht += menge;
    }

}

