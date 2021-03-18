package Bokhee.Werkstatt_II;

public class Auto {
    private String marke;
    private float benzinZustand;
    private int kmServiceRest;
    private int kmReifenRest;

    public Auto(String marke, float benzinZustand, int kmServiceRest, int kmReifenRest){
        this.marke = marke;
        this.benzinZustand = benzinZustand;
        this.kmServiceRest = kmServiceRest;
        this.kmReifenRest = kmReifenRest;
    }

    public void fahren (int km,  Fahrer fahrer, Tankstelle tankstelle, Werkstatt werkstatt) {
        System.out.println(fahrer.getName() + " fährt");
        for (int i = km; i > 0; i--){
            benzinZustand -= (0.05f) * 1;
            kmServiceRest -= 1;
            kmReifenRest -= 1;

            if(benzinZustand <=2){
                System.out.println(" Benzin ist bald leer, bitte tanken");
                tanken(45, fahrer,tankstelle);

            }
        }

        if(kmServiceRest < 2){
            System.out.println(marke + "   muss in die Garage zum Service  ");
            werkstatt.service(this,fahrer);
        }
    }

    public void tanken(int liter,Fahrer fahrer, Tankstelle tankstelle){
        benzinZustand += liter;
        System.out.println(fahrer.getName() +" hat " + liter + "Liter Benzin" +
                " bei " + tankstelle.getName()+ "getankt und " + tankstelle.getPreis()*liter + "bezahlt" +
                String.format("%.2f",benzinZustand) + "ist im Tank");

    }
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getKmServiceRest() {
        return kmServiceRest;
    }

    public int getKmReifenRest() {
        return kmReifenRest;
    }

    public void setBenzinZustand(int benzinZustand) {
        this.benzinZustand = benzinZustand;
    }

    public void setKmReifenRest(int kmReifenRest) {
        this.kmReifenRest = kmReifenRest;
    }

    public void setKmServiceRest(int kmServiceRest) {
        this.kmServiceRest = kmServiceRest;
    }
}
