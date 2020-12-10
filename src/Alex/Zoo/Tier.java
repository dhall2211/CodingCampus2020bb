package Alex.Zoo;



public class Tier {

    private String name;
    private String gattung;

    public Tier(Gehege gehege, String name, String gattung){
        this.name = name;
        this.gattung = gattung;

        gehege.addTier(this);
    }

    public void printStruktur(String prefix){
        System.out.printf("%s%s (%s)%n", prefix, name, gattung);
    }

}
