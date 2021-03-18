package Bokhee.Zoo_Gyula;

public class Futter {
    private String name;
    private String einheit;
    private int tagesBedarf;

    public Futter(String name, String einheit){
        this.name = name;
        this.einheit = einheit;
        tagesBedarf = 0;
    }

    public void tagesBedarfZufuegen(int bedarf){
        tagesBedarf += bedarf;
    }

    public void printStruktur(String prefix){
        System.out.printf("%s%s %d %s%n", prefix, name, tagesBedarf, einheit);
    }

    public String getEinheit() {
        return einheit;
    }

    public String getName() {
        return name;
    }

    public void setEinheit(String einheit) {
        this.einheit = einheit;
    }
}