package Ali.ghanmi.com.werkstatt;

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

    public void fahren(int km, Tankstelle tankstelle, Werkstatt werkstatt, Fahrer fahrer){
        System.out.println(marke + " fährt.");
        for (int i=km; i > 0; --i){
            benzinStand -= (0.05f * 1);
            kmServiceRest -= 1;
            kmReifenRest -= 1;
            if (benzinStand <= 2){
                // System.out.println("Bitte tanken !!!");
                tanken(50, tankstelle, fahrer);
            }
        }
        System.out.println(marke + " ist " + km + " gefahren und aktuell ist " + String.format("%.2f", benzinStand) +
                " Liter Benzin im Tank.");
        if (kmServiceRest <= 0){
            // System.out.println("Bitte service.");
            werkstatt.service(this, fahrer);
        }
    }

    public void tanken(int liter, Tankstelle tankstelle, Fahrer fahrer){
        benzinStand += liter;
        System.out.println(
                fahrer.getName() +
                " tankt " +
                marke +
                " mit " +
                liter +
                " Liter Benzin für " +
                liter*tankstelle.getPreisProLiter() +
                "€\n" +
                "   Aktuell sind " +
                String.format("%.2f", benzinStand) +
                " Liter Benzin im Tank.");
    }

    public String getMarke() {
        return marke;
    }

    public int getKmReifenRest() {
        return kmReifenRest;
    }

    public void setKmReifenRest(int kmReifenRest) {
        this.kmReifenRest = kmReifenRest;
    }

    public void setKmServiceRest(int kmServiceRest) {
        this.kmServiceRest = kmServiceRest;
    }
}
