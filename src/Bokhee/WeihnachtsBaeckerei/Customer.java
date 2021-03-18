package Bokhee.WeihnachtsBaeckerei;

import Bokhee.WeihnachtsBaeckerei.Bakery;

public class Customer {
    private String name;
    private String adresse;

    public Customer(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
       }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {

        return  name +"(" +
                adresse +")" ;
    }
}
