package Bokhee.Zoo;

public class Futter {
    private final String futterName;
    private final String einheit;
    private int tagesBedarf;

    public Futter(Zoo zoo, String futterName, String einheit){
        this.futterName = futterName;
        this.einheit = einheit;
        tagesBedarf = 0;

        zoo.addFutter(this);
    }

    public void tagesBedarfzufuegen(int bedarf){
        tagesBedarf += bedarf;
    }

    public void printStruktur(String prefix){
        System.out.printf("%s%s %d %s%n",prefix, futterName, tagesBedarf, einheit);
    }
    public String getEinheit(){
        return einheit;
    }

    public String getFutterName(){
        return futterName;
    }
}
