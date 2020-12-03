package Dan;

import Dan.OOP.CodingCampus.camera.Camera;

public class Main {

    public static void main(String[] args) {
        Camera nikon = new Camera("Nikon is Life", 12, true, 100, "China" );
        Camera sony = new Camera("Sony is life", 50, false, 200, "Japan");


        System.out.printf("%s %d %d %s", nikon.getDescription(), nikon.getMegaPixel(), nikon.getFocalLength(), nikon.getCountry());
        System.out.printf(" %s %d %d %s", sony.getDescription(), sony.getMegaPixel(), sony.getFocalLength(), sony.getCountry());

    }
}
