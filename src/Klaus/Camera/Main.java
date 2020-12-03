package Klaus.Camera;

public class Main {


    public static void main(String[] args) {

        Camera myNikon = new Camera("Nikon", 12.3f, 10, 50,
                )

        Camera mySony = new Camera();
        mySony.setExactName("Sony ALPHA 6400");
        mySony.setMegaPixel(24);
        mySony.setFocalLengthMin(16);
        mySony.setFocalLengthMax(50);
        mySony.setCountryOfOrigin("Japan");
        mySony.setFunctions("WLAN, LCD, Spiegellos");
        mySony.setOwner("Klaus");

        System.out.println(mySony.getDataSheet());



    }

}
