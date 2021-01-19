package Ali.ghanmi.com.Restaurant;

import java.util.Comparator;

public class SortTabelsByCapacity implements Comparator<Tabel> {

    @Override
    public int compare(Tabel o1, Tabel o2) {


        return o1.getCapacity() - o2.getCapacity();
    }
}
