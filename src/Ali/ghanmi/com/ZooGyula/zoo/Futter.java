package Ali.ghanmi.com.ZooGyula.zoo;

public class Futter {
    private String name;
    private String einheit;
    private int minimalStock;
    private int tagesBedarf;
    private int actuelStock;//

    public Futter(String name,String einheit,int minimalStock){//
        this.name = name;
        this.einheit = einheit;
        this.minimalStock=minimalStock;
        tagesBedarf = 0;


        }

            public void tagesBedarfZufuegen(int bedarf){
        tagesBedarf += bedarf;
    }

    public String futerManagment() {
        String ms1 = "BITTE FUTTER BESTELLEN, lager zustand";
        String ms2 = "genug futter vorhanden,lager zustand";
        if (minimalStock < tagesBedarf * 3) {
            return ms1;
        } else {
            return ms2;
        }
    }

    public void printStruktur(String prefix){
        int actuelStock= minimalStock-tagesBedarf;
        System.out.printf("%s %s:   %d%s Tagesbedarf, %d%s im Lager, %s %d%s  %n", prefix, name, tagesBedarf,
                einheit, minimalStock,einheit, futerManagment(),actuelStock,einheit);
    }

    public String getEinheit() {
        return einheit;
    }

    public String getName() {
        return name;
    }

    public void setEinheit(String einheit) {
        this.einheit = einheit;
    }

    public int getMinimalStock() {
        return minimalStock;
    }

    public void setMinimalStock(int minimalStock) {
        this.minimalStock = minimalStock;
    }
}

