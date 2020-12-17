package Ali.ghanmi.com.Zoo3;

public class Tier {
    // Member Variablen
    private String name;
    private String gattung;
    private Futter lieblingsFutter;
    private int futterBedarf;



    // Constructor
    public Tier(Zoo zoo, String gehege, String name, String gattung, String lieblingsFutter, int futterBedarf) {
        this.name = name;
        this.gattung = gattung;
        this.lieblingsFutter = zoo.searchAndCreateFutter(lieblingsFutter);



        this.futterBedarf = futterBedarf;
        this.lieblingsFutter.tagesBedarfZufuegen(futterBedarf);

        zoo.searchAndCreateGehege(gehege).addTier(this);
    }


    public void printStruktur(String prefix) {
        System.out.printf("%s%s (%s) braucht %d %s %s%n",
                prefix,
                name,
                gattung,
                futterBedarf,
                lieblingsFutter.getEinheit(),
                lieblingsFutter.getName());
               //  mitarbeiter.getName();

    }

    public String getName() {
        return name;
    }
}