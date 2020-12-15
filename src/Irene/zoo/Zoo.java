package Irene.zoo;

import java.util.Vector;

public class Zoo {
    private String zooName;
    private Vector<Compound> compoundList;
    private Vector<Fodder> fodderList;
    private Vector<Caretaker> caretakerList;
    private Vector<Veterinarian> veterinarianList;

    public Zoo(String zooName){
        this.zooName = zooName;
        compoundList = new Vector<>();
        fodderList = new Vector<>();
        caretakerList = new Vector<>();
        veterinarianList = new Vector<>();
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

    public Animal createAnimal(String animalName, String species, String favouriteFodder, int requiredFodder, String compound){
        return new Animal(this, animalName, species, favouriteFodder, requiredFodder, compound);
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
        System.out.println(prefix + " Caretaker:");
        for (int i = 0; i < caretakerList.size(); i++) {
            caretakerList.get(i).printCaretakerStructure("    " );
        }
        System.out.println("  Veterinarian:");
        for (var veterinarian : veterinarianList) {
            veterinarian.printStructureVeterinarian("    ");
        }
    }

    public Veterinarian searchAndCreateVeterinarian(String vetName) {
        for (var veterinarian : veterinarianList) {
            if (veterinarian.getVetName().equals(vetName)) {
                return veterinarian;
            }
        }
        var veterinarian = new Veterinarian(vetName);
        veterinarianList.add(veterinarian);
        return veterinarian;
    }

    public Caretaker searchAndCreateCaretaker(String careName, Animal favouriteAnimal, String[] compoundNames) {
        for (int i = 0; i < caretakerList.size(); i++) {
            if (caretakerList.get(i).getCareName().equals(careName)) {
                return caretakerList.get(i);
            }
        }
        Vector<Compound> compounds = new Vector<>();
        for (var compoundName:compoundNames) {
            var compound = searchAndCreateCompound(compoundName);
            compounds.add(compound);
        }
        var caretaker = new Caretaker(careName, favouriteAnimal, compounds);
        caretakerList.add(caretaker);
        return caretaker;
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
