package Alex.BMIHundeApp1;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Lebewesen[] lebewesen = new Lebewesen[3];
        lebewesen[0] = new Hund("Leroy",15.4,0.49);
        lebewesen[0].isst();
        lebewesen[0].isst();
        lebewesen[0].isst();
        System.out.println("Name: "+lebewesen[0].getName());
        System.out.println("Gewicht: "+lebewesen[0].getGewicht());
        System.out.println("Grösse: "+lebewesen[0].getGroesse());
        double bmi0 = BMIRechner.rechne(lebewesen[0]);//Kassenmethoden
        double b0= Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", bmi0));
        System.out.println("BMI: "+b0);
        System.out.println(b0>=BMIRechner.BMI_MAX?"Übergewichtig":
                (b0<BMIRechner.BMI_MIN?"Untergewichtig":
                        "Normalgewichtig"));
        System.out.println();

        lebewesen[1] = new Hund("Terry",12.4,0.49);
        lebewesen[1].isst();
        ((Hund)lebewesen[1]).spielt();//lebewesen spielt muss man weil es sich in der Klasse Hund befindet casting
        lebewesen[1].isst();
        ((Hund)lebewesen[1]).spielt();
        System.out.println("Name: "+lebewesen[1].getName());
        System.out.println("Gewicht: "+lebewesen[1].getGewicht());
        System.out.println("Grösse: "+lebewesen[1].getGroesse());
        double bmi1 = BMIRechner.rechne(lebewesen[1]);
        double b1 = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", bmi1));
        System.out.println("BMI: "+b1);
        System.out.println(b1>=BMIRechner.BMI_MAX?"Übergewichtig":
                (b1<BMIRechner.BMI_MIN?"Untergewichtig":
                        "Normalgewichtig"));
        System.out.println();


        lebewesen[2] = new Fisch();
        lebewesen[2].setName("Peter");
        lebewesen[2].setGewicht(0.005);
        lebewesen[2].setGroesse(0.01);
        lebewesen[2].isst();
        lebewesen[2].isst();
        System.out.println("Name: "+lebewesen[2].getName());
        System.out.println("Gewicht: "+lebewesen[2].getGewicht());
        System.out.println("Grösse: "+lebewesen[2].getGroesse());
        double bmi2 = BMIRechner.rechne(lebewesen[2]);
        double b2= Double.parseDouble(String.format(Locale.ENGLISH, "%1.3f", bmi2));
        System.out.println("BMI: "+b2);
        System.out.println(b2>=BMIRechner.BMI_MAX?"Übergewichtig":
                (b2<BMIRechner.BMI_MIN?"Untergewichtig":
                        "Normalgewichtig"));
        System.out.println();

        System.out.println("Anzahl der berechnungen sind: "+BMIRechner.zaehler);
    }
}
