package Gyula.fotoapparat;

public class FotoapparatMain {
    public static void main(String[] args) {
        FotoApparat nikon = new FotoApparat("Nikon D30", 19.3f, "Taiwan", "Alles in Einem");
        FotoApparat sony = new FotoApparat("Sony Alpha A6500", 23.8f, "Japan", "Super Automatik");

        Objektiv nikonFishEye = new Objektiv(8, 20);
        Objektiv nikonStandard = new Objektiv(24, 80);
        nikon.setCurrentObjektiv(nikonStandard);

        System.out.println(nikon);
        System.out.println(sony);
    }
}
