package Bokhee.Zoo_II;

public class Futter {
    private String futterName;
    private String einheit;
    private int tagesBedarf;

    public Futter(String futterName, String einheit){
        this.futterName = futterName;
        this.einheit = einheit;
        tagesBedarf = 0;

        //zoo.addFutter(this);
    }

    public void tagesBedarfzufuegen(int bedarf){
        tagesBedarf += bedarf;
    }

    public void setEinheit(String einheit) {
        this.einheit = einheit;
    }
//
//    public String getEinheit(String einheit) {
//        return einheit;
//    }


    public int getTagesBedarf() {
        return tagesBedarf;
    }

    public void printStruktur(String prefix){
        System.out.printf("%s%s %d %s%n", prefix, futterName, tagesBedarf, einheit);
    }
    public String getEinheit(){
        return einheit;
    }

    public String getFutterName(){
        return futterName;
    }

      }

