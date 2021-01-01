package Alex.FotoApparat2.FotoApparat1;

public class Berechnung {
    public double berchnungProzent(double maxSpeicher, double anzahlFotos, double einFotoGroesse){
        double freierSpeicher=(100/maxSpeicher)*(anzahlFotos*einFotoGroesse);
        return freierSpeicher;
    }


}
