package Gyula.oop.GeldBörse;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<IMoney> pocket = new Vector<>();

        pocket.add(new BankNote("Blau Orchidea", 100));
        pocket.add(new Coin(Coin.Metal.GOLD, 1540));
        pocket.add(new Coin(Coin.Metal.SILBER, 1));


        pocket.remove(0).pay();
        System.out.println(pocket);
    }
}
