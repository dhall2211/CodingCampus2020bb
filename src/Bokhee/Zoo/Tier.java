package Bokhee.Zoo;

public class Tier {
    private String name;
    private String gattung;
    private Futter cc_lieblingsFutter;
    private int futterBedarf;

    public Tier(Gehege gehege, String name, String gattung,Futter lieblingsFutter, int futterBedarf){
        this.name = name;
        this. gattung = gattung;
        this.futterBedarf = futterBedarf;
        this.cc_lieblingsFutter = lieblingsFutter;
        cc_lieblingsFutter.tagesBedarfzufuegen(futterBedarf);

        gehege.addTier(this);
    }

    public void printStruktur(String prefix){
        System.out.printf("%s%s (%s) braucht %d %s %s%n",
                prefix,
                name,
                gattung,
                futterBedarf,
                cc_lieblingsFutter.getEinheit(),
                cc_lieblingsFutter.getFutterName());

    }

}
