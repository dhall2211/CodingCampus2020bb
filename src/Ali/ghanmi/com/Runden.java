package Ali.ghanmi.com;

public class Runden {
    public static void runden() {
        float[] values = {1.0f, 1.15f, 1.5f, 1.91f, 11f, 19f, 120f};

        for (float f : values) {
            System.out.print(f + " ");
            System.out.print(Math.round(f) + " "); // Nach .5 Regel
            System.out.print(Math.floor(f) + " "); // Abrunden
            System.out.print(Math.ceil(f));        // Aufrunden
            System.out.println();

            System.out.println("--------------------------");
        }
        float faktor = 0.1f;
        for (float f : values) {
            System.out.print(f + " ");
            System.out.print(faktor * Math.round(f / faktor) + " "); // Nach .5 Regel
            System.out.printf("%.2f ", faktor * Math.floor(f / faktor)); // Abrunden
            System.out.printf("%.2f", faktor * Math.ceil(f / faktor));        // Aufrunden
            System.out.println();
        }


    }
}
