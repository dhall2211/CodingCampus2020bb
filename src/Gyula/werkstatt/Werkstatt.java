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


}
