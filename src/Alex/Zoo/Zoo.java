package Alex.Zoo;


import java.util.Vector;

public class Zoo {
    private String name;
    Vector<Gehege> gehegeList;

    public Zoo(String name) {
        this.name = name;
        gehegeList = new Vector<>();
    }

    public void addGehege(Gehege g) {
        if (!gehegeList.contains(g)) {
            gehegeList.add(g);
        }
    }

    public void printStruktur(String prefix) {
        System.out.println(prefix + name);
        for (int i = 0; i < gehegeList.size(); i++) {
            gehegeList.get(i).printStruktur(prefix + "  ");
        }
    }
}
