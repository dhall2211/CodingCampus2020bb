package Gyula.werkstatt;

public class Auto {
    private String marke;
    private float benzinStand;
    private int kmServiceRest;
    private int kmReifenRest;

    public Auto(String marke, float benzinStand, int kmServiceRest, int kmReifenRest){
        this.marke = marke;
        this.benzinStand = benzinStand;
        this.kmServiceRest = kmServiceRest;
        this.kmReifenRest = kmReifenRest;
    }

    public void fahren(int km, Tankstelle tankstelle){
        System.out.println(marke + " fährt.");
        for (int i=km; i > 0; --i){
            benzinStand -= (0.05f * 1);
            kmServiceRest -= 1;
            kmReifenRest -= 1;
            if (benzinStand <= 2){
                // System.out.println("Bitte tanken !!!");
                tanken(50, tankstelle);
            }
        }
        System.out.println(marke + " ist " + km + " gefahren und aktuell ist " + String.format("%.2f", benzinStand) +
                " Liter Benzin im Tank.");
        if (kmServiceRest <= 0){
            System.out.println("Bitte service.");
        }
    }

    public void tanken(int liter, Tankstelle tankstelle){
        benzinStand += liter;
        System.out.println(
                marke +
                " hat " +
                liter +
                " getankt. Aktuell ist " +
                String.format("%.2f", benzinStand) +
                " Liter Benzin im Tank. Kosten: " +
                liter*tankstelle.getPreisProLiter() +
                "€");
    }
}
