package Bokhee.FotoApparat;

public class Main {

    public static void main(String[] args) {

        FotoApparat myFotoApparat = new FotoApparat("EOS 6D MarkII", 26, true, 35, "Japan");
        SpeicherKarte mySpeicherKarte = new SpeicherKarte("Sony", 0, 128);

        myFotoApparat.setCurrentSpeicherarte(mySpeicherKarte);


        int iterations = 0;
        while (myFotoApparat.getCurrentSpeicherkarte().getFreierSpeicherPlatz() >= 5) {
            myFotoApparat.machfoto();
            iterations++;
        }
        System.out.println("wie viel Foto sind gemacht worden : " + iterations + "mal");
        myFotoApparat.machfoto();
        myFotoApparat.loeschenFoto(5);

//        try {
//            myFotoApparat.machfoto();
//        }
//        catch(Exception e){
//
//        }



    }
}


