package Bokhee.Zoo_II;

public class Arzt{
    private String name;
    private Tier tierName;

    public Arzt(Zoo zoo, String name){
        this.name = name;
    }

    public void behandelnTier(String tier){
        System.out.println( name + "ist behandelt wegen Probleme");
    }

    public String getName() {
        return name;
    }
}
