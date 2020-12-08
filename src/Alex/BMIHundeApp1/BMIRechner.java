package Alex.BMIHundeApp1;

public class BMIRechner {
    public static int zaehler;//mit dem schlüsselwort static wird hier eine Klassenvariabele erzeugt
    public static final double BMI_MAX=70;//Konstanten
    public static final double BMI_MIN=60;

   public static double rechne(Lebewesen lebewesen) {//mit dem schlüsselwort static wird hier eine Klassenmethode erzeugt
        double bmi= lebewesen.getGewicht()/(lebewesen.getGroesse()*lebewesen.getGroesse());
        zaehler++;
        return bmi;
    }
}
