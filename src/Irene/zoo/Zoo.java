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

    public void addCompound(Compound c){
        if (!compoundList.contains(c)){
            compoundList.add(c);
        }
    }

    public void addFodder(Fodder f){
        if (!fodderList.contains(f)){
            fodderList.add(f);
        }
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
}
