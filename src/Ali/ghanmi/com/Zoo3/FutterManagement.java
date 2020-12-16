package Ali.ghanmi.com.Zoo3;

import java.util.Vector;

public class FutterManagement{

private int minFood;
    private Vector<Gehege> gehegeList;
    private Vector<Futter> futterList;

    public FutterManagement(int minFood) {
        this.minFood= minFood;
    }


    public void foodMangment() {
        int bedarf = 0;
        for (int i = 0; i < gehegeList.size(); i++) {
            for (int j = 0; j <futterList.size(); j++) {
                bedarf += futterList.get(j).getTagesBedarf();
                System.out.println(gehegeList.get(i).getName()+" "+futterList.get(j).getTagesBedarf());
            }
        }
    }

}