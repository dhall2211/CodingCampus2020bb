package Bokhee.KlosterMuseum;

import java.util.Vector;

public class Curator {
    private String name;
    private Vector<Art> specialties;

    public Curator(String name) {
        this.name = name;
        this.specialties = new Vector<>();

    }

//    public void sellArt(){
//     if(spende >= price){
//         sellArt();
//         System.out.println("");
//     }
//    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Curator{" +
                "name='" + name + '\'' +
                ", specialties=" + specialties +
                '}';
    }
}
