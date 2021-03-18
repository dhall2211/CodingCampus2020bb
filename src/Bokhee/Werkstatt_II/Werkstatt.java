package Bokhee.Werkstatt_II;

public class Werkstatt {
    private String name;
    private int kostenReifenWechseln;
    private int kostenService;

    public Werkstatt(String name, int kostenReifenWechseln, int kostenService) {
        this.name = name;
        this.kostenReifenWechseln = kostenReifenWechseln;
        this.kostenService = kostenService;
    }

    public Werkstatt(String name) {
        this.name = name;
        this.kostenReifenWechseln = 100;
        this.kostenService = 20;
    }


    public void service(Auto auto, Fahrer fahrer) {
        System.out.println(fahrer.getName() + " brauchte" + auto.getMarke() + "zum Service");
        if (auto.getKmReifenRest() < 20) {
            System.out.println(" Reifen werden gewechselt");
            auto.setKmReifenRest(50000);
            System.out.println(fahrer.getName() + " hat für Service inkl. Reifen Wechsel "
                    + kostenReifenWechseln + kostenService + "€ bezahlt.");
        } else {
            System.out.println(fahrer.getName() + " hat nur für Service" + kostenService + "€ bezahlt.");
            auto.setKmServiceRest(20000);
        }
    }

    public String getName() {
        return name;
    }

    public int getKostenReifenWechseln() {
        return kostenReifenWechseln;
    }

    public int getKostenService() {
        return kostenService;
    }
}
