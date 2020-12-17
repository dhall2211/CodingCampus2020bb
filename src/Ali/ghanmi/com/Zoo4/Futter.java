package Ali.ghanmi.com.Zoo4;

public class Futter {
    private String name;
    private String einheit;
    private int futterImLager;
    private int tagesBedarf;

    public Futter(String name,String einheit,int futterImLager){//
        this.name = name;
        this.einheit = einheit;
        this.futterImLager = futterImLager;
        tagesBedarf = 0;


        }

            public void tagesBedarfZufuegen(int bedarf){
        tagesBedarf += bedarf;
    }

    public String futerManagment() {
        String ms1 = "BITTE FUTTER BESTELLEN, lager zustand";
        String ms2 = "genug futter vorhanden,lager zustand";
        if (futterImLager < tagesBedarf * 3) {
            return ms1;
        } else {
            return ms2;
        }
    }

    public int getFutterImLager() {
        return futterImLager;
    }

    public int getTagesBedarf() {
        return tagesBedarf;
    }

    public void printStruktur(String prefix) {
        for (int i = 0; i < 10; i++) {
            int actuelStock = futterImLager - tagesBedarf;
            futterImLager =actuelStock;
            System.out.printf("%s %s:   %d%s Tagesbedarf, %d%s im Lager, %s %d%s  %n", prefix, name, tagesBedarf,
                    einheit, futterImLager, einheit, futerManagment(), actuelStock, einheit+"\n");
        }
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

    public void setFutterImLager(int futterImLager) {
        this.futterImLager = futterImLager;
    }

}


