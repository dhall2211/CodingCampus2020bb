package Irene.zoo;

import java.util.Vector;

public class Zoo {
    private String zooName;
    private Vector<Compound> compoundList;
    private Vector<Fodder> fodderList;

    public Zoo(String zooName){
        this.zooName = zooName;
        compoundList = new Vector<>();
        fodderList = new Vector<>();
    }

    public Fodder searchAndCreateFodder(String fodderName, String unit) {
        Fodder f = searchAndCreateFodder(fodderName);
        f.setUnit(unit);
        return f;
    }

    public Fodder searchAndCreateFodder(String fodderName){
        for (int i = 0; i < fodderList.size(); i++) {
            if (fodderList.get(i).getFodderName().equals(fodderName)){
                return fodderList.get(i);
            }
        }
        Fodder f = new Fodder(fodderName, "N.N.");
        fodderList.add(f);
        return f;
    }

    //It is possible to name both search methods searchAndCreate..., as IntelliJ distinguishes them through the given items.



    public Compound searchAndCreateCompound(String compoundName){
        for (int i = 0; i < compoundList.size(); i++) {
            if (compoundList.get(i).getCompoundName().equals(compoundName)){
                return compoundList.get(i);
            }
        }
        Compound c = new Compound(compoundName);
        compoundList.add(c);
        return c;
    }

    public Animal createAnimal(String animalName, String species, String favoriteFodder, int requiredFodder, String compound){
        return new Animal(this, animalName, species, favoriteFodder, requiredFodder, compound);
    }

    public void printStructure(String prefix){
        System.out.println(prefix + zooName);
        System.out.println(prefix + "  Compound:");
        for (int i = 0; i < compoundList.size(); i++) {
            compoundList.get(i).printStructureCompound(prefix + "    ");
        }
        System.out.println(prefix + "  Daily required fodder:");
        for (int i = 0; i < fodderList.size(); i++) {
            fodderList.get(i).printStructureFodder(prefix + "    ");
        }
    }

//    public void addCompound(Compound c){
//        if (!compoundList.contains(c)){
//            compoundList.add(c);
//        }
//    }
//
//    public void addFodder(Fodder f){
//        if (!fodderList.contains(f)){
//            fodderList.add(f);
//        }
//    }
}
