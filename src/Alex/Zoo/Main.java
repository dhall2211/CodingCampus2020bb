package Alex.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("->Fabelhafte Welt der Tiere<-");
        Gehege gehegePrimaten = new Gehege(zoo, "Gehege Primaten");
        Futter banane = new Futter(zoo, "Banane(n)", "Stück");
        Tier Affe1 = new Tier(gehegePrimaten, "Chitta", "Affe", banane, 5);
        Tier Affe2 = new Tier(gehegePrimaten, "King Kong", "Affe", banane, 115);
        Tier Affe3 = new Tier(gehegePrimaten, "Koko", "Affe", banane, 2);

        zoo.printStruktur("");
    }

}
