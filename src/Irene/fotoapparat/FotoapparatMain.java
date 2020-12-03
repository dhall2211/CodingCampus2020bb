package Irene.fotoapparat;

public class FotoapparatMain {
    public static void main(String[] args) {
        Fotoapparat nikon = new Fotoapparat("Nikon D30", 19.3f, "Taiwan", "Alles in Einem");
        Fotoapparat sony = new Fotoapparat("Sony Alpha A6500", 23.8f, "Japan", "Super Automatik");

        Objektiv nikonFishEye = new Objektiv(8, 20);
        Objektiv nikonStandard = new Objektiv(24, 80);
        nikon.setCurrentObjektiv(nikonStandard);
        Speicherkarte sdkSony = new Speicherkarte("sdkSony", 5000, 0);
        Speicherkarte hmdKarte = new Speicherkarte("hmdsdk", 3000, 250);

        nikon.setSpeicherkarte(hmdKarte);
        nikon.takePicture(hmdKarte);
        nikon.takePicture(hmdKarte);
        nikon.setSpeicherkarte(sdkSony);
        nikon.takePicture(sdkSony);
        nikon.takePicture(sdkSony);

        System.out.println();

        System.out.println(nikon);
        System.out.println(sony);
    }
}
