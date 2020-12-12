package Ali.ghanmi.com.ZooGyula.zoo;

public class Tier {
    // Member Variablen
    private String name;
    private String gattung;
    private Futter lieblingsFutter;
    private int futterBedarf;
    private EmployeeZoo mitarbeiter;


    // Constructor
    public Tier(Zoo zoo, String gehege, String name, String gattung, String lieblingsFutter, int futterBedarf, String mitarbeiter) {
        this.name = name;
        this.gattung = gattung;
        this.lieblingsFutter = zoo.searchAndCreateFutter(lieblingsFutter);

        this.mitarbeiter = zoo.searchAndCreateMitarbeiter(mitarbeiter);

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