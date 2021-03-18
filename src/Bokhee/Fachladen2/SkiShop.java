package Bokhee.Fachladen2;

import java.util.*;

public class SkiShop {

    public static Random random = new Random();

    private static SkiShop currentShop;
    private Vector<SalesPerson> salesPersons;


    public SkiShop getInstance() {
        if (currentShop == null) {
            currentShop = new SkiShop();
        }
        return currentShop;
    }

    public SkiShop getCurrentShop() {
        return currentShop;
    }

    public SalesPerson searchNextPerson(String name) {

        for (SalesPerson s : salesPersons) {
            if (s.getName().equals(name)) {
                System.out.println(s + " is occupied.");
                salesPersons.remove(name);
            }
        }
        SalesPerson[] nextCouncellors = (SalesPerson[]) salesPersons.toArray();
        SalesPerson nextCouncellor = nextCouncellors[random.nextInt(nextCouncellors.length)];
        return nextCouncellor;
    }
}