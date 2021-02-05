package Ali.ghanmi.com.SeeLife;

public class MainSeeLife {
    public static void main(String[] args) {
        SeeLifeSimulation i = new SeeLifeSimulation("Konstaz");
        Visitor V1 = new Visitor("Peer");

        System.out.println(i);
        System.out.println(V1);
    }
}
