package Bokhee.Camera;


public class Camera_Main {
    public static void main(String[] args) {
        Camera nikon = new Camera("Nikon D30", 19.3f, "Taiwan", "Alles in Einem");
        Camera sony = new Camera("Sony Alpha A6500", 23.8f, "Japan", "Super Automatik");

        Objectiv nikonFishEye = new Objectiv(8, 20);
        Objectiv nikonStandard = new Objectiv(24, 80);
        nikon.setCurrentObjectiv(nikonStandard);

        System.out.println(nikon);
        System.out.println(sony);
    }
}
