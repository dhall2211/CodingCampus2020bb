package Alex.Zoo;

public class Futter {
    private final String name;
    private final String einheit;
    private int tagesBedarf;

    public Futter(Zoo zoo, String name, String einheit){
        this.name = name;
        this.einheit = einheit;
        tagesBedarf = 0;

        zoo.addFutter(this);
    }

    public void tagesBedarfZufuegen(int bedarf){
        tagesBedarf += bedarf;
    }

    public void printStruktur(String prefix){ System.out.printf("%s%s %d %s%n", prefix, name, tagesBedarf, einheit); }

    public String getEinheit() {
        return einheit;
    }

    public String getName() {
        return name;
    }

}
