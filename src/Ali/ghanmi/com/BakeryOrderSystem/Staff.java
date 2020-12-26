package Ali.ghanmi.com.BakeryOrderSystem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

public class Staff {
    private String name;
    private int bakingCapacity;
    private String favoriteCokie;
   // private Vector<Cokie> bakingSpecialty;
    private Vector<Cokie> cokies;

    public Staff(String name, int bakingCapacity, String favoriteCokie, Vector<Cokie> bakingSpecialty, Bakery bakery) {
        this.name = name;
        this.bakingCapacity = bakingCapacity;
      //  this.bakingSpecialty = bakingSpecialty;
        this.cokies = new Vector<>();
        this.favoriteCokie = favoriteCokie; //setFavoriteCokie(favoriteCokie);


    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Vector<Cokie> getCokies() {
        return cokies;
    }

    public void addStaffspeciality(Cokie cokie) {
        cokies.add(cokie);
    }

//diese funktion sollte kontrolieren ob favoriteCokie ist schon in cokie Vector vorhanden ist
    // funktioniere allerding nicht
    public String setFavoriteCokie(String favoriteCokie) {
        for (int i = 0; i < cokies.size(); i++) {
            if (!(cokies.get(i).getName().equals(favoriteCokie))) {
                this.favoriteCokie = cokies.get(i).getName();
            }
        }
        return "Not Valid name";
    }



    public void printStructure(String prefix){
      System.out.println(prefix+"Mitarbeiter: "+name+"\n  Tages vorgesehen Produktion: "+bakingCapacity+"Kg\n"+"  Spezialität: " +favoriteCokie);
        for (Cokie cokie: cokies) {
            System.out.println("     *Weiter Spezialität: "+cokie.getName());
        }
        System.out.println();
    }

}
