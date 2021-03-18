package Bokhee.Zoo_II;

public class Tier {
    private String name;
    private String gattung;
    private Futter cc_lieblingsFutter;
    private int futterBedarfAmTag;

    public Tier(Zoo zoo, String gehege, String name,String gattung, String lieblingsFutter,int futterBedarf ){
        this.name = name;
        this. gattung = gattung;
        this.cc_lieblingsFutter = zoo.searchAndCreateFutter(lieblingsFutter);
        this.futterBedarfAmTag = futterBedarf;
        this.cc_lieblingsFutter.tagesBedarfzufuegen(futterBedarf);

        //gehege.addTier(this);
        zoo.searchAndCreateGehege(gehege).addTier(this);
    }

    public void printStruktur(String prefix){
        System.out.printf("%s%s (%s) braucht %d %s %s%n",
                prefix,
                name,
                gattung,
                futterBedarfAmTag,
                cc_lieblingsFutter.getEinheit(),
                cc_lieblingsFutter.getFutterName());

    }

    public String getName() {
        return name;
    }
}
