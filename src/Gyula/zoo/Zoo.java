package Gyula.zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<Gehege> gehegeList;
    private Vector<Futter> futterList;

    public Zoo(String name){
        this.name = name;
        gehegeList = new Vector<>();
        futterList = new Vector<>();
    }

    public void addGehege(Gehege g){
        if (!gehegeList.contains(g)){
            gehegeList.add(g);
        }
    }

    public void addFutter(Futter f){
        if (!futterList.contains(f)){
            futterList.add(f);
        }
    }

    public void printStruktur(String prefix){
        System.out.println(prefix + name);
        System.out.println(prefix + "  Gehege:");
        for (int i = 0; i < gehegeList.size(); i++) {
            gehegeList.get(i).printStruktur(prefix + "    ");
        }
        System.out.println(prefix + "  Futter Tagesbedarf:");
        for (int i = 0; i < futterList.size(); i++) {
            futterList.get(i).printStruktur(prefix + "    ");
        }
    }
}
