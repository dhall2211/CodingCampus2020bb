package Gyula.werkstatt;

public class Werkstatt {
    private String name;
    private int kostenReifenwechseln;
    private int kostenService;

    public Werkstatt(String name, int kostenReifenwechseln, int kostenService){
        this.name = name;
        this.kostenReifenwechseln = kostenReifenwechseln;
        this.kostenService = kostenService;
    }

    public Werkstatt(String name){
        this.name = name;
        kostenReifenwechseln = 100;
        kostenService = 20;
    }

    public void service(Auto auto, Fahrer fahrer){
        System.out.println(auto.getMarke() + " braucht Service.");
        if (auto.getKmReifenRest() < 0) {
            System.out.println("  Reifen werden gewechselt.");
            auto.setKmReifenRest(40000);
            System.out.println("  " + fahrer.getName() + " bezahlt für Service inkl. Reifenwechsel: " + (kostenService+kostenReifenwechseln)+"€");
        } else {
            System.out.println("  " + fahrer.getName() + " bezahlt für Service: "+kostenService+"€");
        }
        auto.setKmServiceRest(18500);
    }

}
