package Ali.ghanmi.com.fotoapparat;

public class FotoapparatMain {
    public static void main(String[] args) {
        FotoApparat nikon = new FotoApparat("Nikon D30", 19.3f, "Taiwan", "Alles in Einem");
        FotoApparat sony = new FotoApparat("Sony Alpha A6500", 23.8f, "Japan", "Super Automatik");

        Objektiv nikonFishEye = new Objektiv(8, 20);
        Objektiv nikonStandard = new Objektiv(24, 80);
        nikon.setCurrentObjektiv(nikonStandard);

        SpeicherKarte sdkSony= new SpeicherKarte("sdksony",5000,0);
        SpeicherKarte hmdkarte= new SpeicherKarte("hmdsdk",3000,0);

        System.out.println(nikon);
        System.out.println(sony+"\n");
        nikon.setSpeicherKarte(hmdkarte);
        //nikon.machFoto();
       // nikon.machFoto();
       // nikon.machFoto();

        nikon.setSpeicherKarte(sdkSony);
        int fotoZise=5;
        for (int i = 0; i <sdkSony.getCapacity(); i++) {
            nikon.machFoto();
        }

        }
    }

