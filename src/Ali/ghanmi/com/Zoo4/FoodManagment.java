package Ali.ghanmi.com.Zoo4;

import java.util.Vector;

public class FoodManagment {
    private Futter futter;
    private  int tagesBedarf=futter.getTagesBedarf();
    private  int lager=futter.getFutterImLager();
    private Vector<Futter> futterList;

    public String futerManagment() {
        String ms1 = "BITTE FUTTER BESTELLEN, lager zustand";
        String ms2 = "genug futter vorhanden,lager zustand";
        if (futter.getFutterImLager() < tagesBedarf * 3) {
            return ms1;
        } else {
            return ms2;
        }
    }

    public  void printStruktur(String prefix) {
        for (int i = 0; i < 10; i++) {
            int actuelStock = lager - tagesBedarf;
            lager=actuelStock;

            System.out.printf("%s %s:   %d%s Tagesbedarf, %d%s im Lager, %s %d%s  %n", prefix, futter.getName(), tagesBedarf,
                    futter.getEinheit(), futter.getFutterImLager(),futter.getEinheit(), futerManagment(), actuelStock, futter.getEinheit()+"\n");
        }
    }
}
