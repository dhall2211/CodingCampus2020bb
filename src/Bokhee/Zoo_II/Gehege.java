package Bokhee.Zoo_II;

import java.util.Vector;

public class Gehege {
    // Member Variable
    private String name;
    private Vector<Tier> tierList;

    //Contructor+ classe Verbindung Zoo zoo...
    public Gehege(String name){
        this.name = name;
        tierList = new Vector<>();
       // Zoo에 만들어 놓은 Vector에 자료를 집어 넣는 것 두 클라스 verbindung
       // Gehege

    }

    public void addTier(Tier t) {
        if (!tierList.contains(t)) {
            tierList.add(t);
        }
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void printStruktur(String prefix){
            System.out.println(prefix + name);
            for (int i = 0; i < tierList.size(); i++) {
                tierList.get(i).printStruktur(prefix + "   ");
            }
        }
}
