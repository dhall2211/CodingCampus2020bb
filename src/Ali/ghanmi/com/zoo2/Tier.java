package Ali.ghanmi.com.zoo2;

public class Tier {
    // Member Variablen
    private String name;
    private String gattung;
    private Futter lieblingsFutter;
    private int futterBedarf;

    // Constructor
    public Tier(Gehege gehege, String name, String gattung, Futter lieblingsFutter, int futterBedarf){
        this.name = name;
        this.gattung = gattung;
        this.lieblingsFutter = lieblingsFutter;
        this.futterBedarf = futterBedarf;
        lieblingsFutter.tagesBedarfZufuegen(futterBedarf);

        gehege.addTier(this);
    }

    public void printStruktur(String prefix){
        System.out.printf("%s%s (%s) braucht %d %s %s%n",
                prefix,
                name,
                gattung,
                futterBedarf,
                lieblingsFutter.getEinheit(),
                lieblingsFutter.getName());
    }
}
