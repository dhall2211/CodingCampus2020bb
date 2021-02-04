package Gyula.oop.MultiInterfaces;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Zahl fuenf = new Zahl(5);
        fuenf.doDailySimulation();

        Vector<IPrintStructure> sachen = new Vector<>();
        sachen.add(fuenf);
        sachen.add(new Buchstabe('Q'));

        for (IPrintStructure p: sachen) {
            p.printStructure();
        }

    }
}
