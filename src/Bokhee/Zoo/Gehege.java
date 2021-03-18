package Bokhee.Zoo;

import java.util.Vector;

public class Gehege {
    // Member Variable
    private String name;
    private Vector<Tier> tierList;

    //Contructor+ classe Verbindung Zoo zoo...
    public Gehege(Zoo zoo,String name){
        this.name = name;
        tierList = new Vector<>();
        // Zoo에 만들어 놓은 Vector에 자료를 집어 넣는 것 두 클라스 verbindung
        zoo.addGehege(this);
       // Gehege
    }

    public void addTier(Tier t) {
        if (!tierList.contains(t)) {
            tierList.add(t);
        }
    }

    public void printStruktur(String prefix){
            System.out.println(prefix + name);
            for (int i = 0; i < tierList.size(); i++) {
                tierList.get(i).printStruktur(prefix + "   ");
            }
        }



}
