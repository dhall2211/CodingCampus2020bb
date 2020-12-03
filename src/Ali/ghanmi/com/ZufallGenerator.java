package Ali.ghanmi.com;

import java.util.Random;

public class ZufallGenerator {
    private static Random random = new Random();
    public static void zufallgenerator(){
        int a =10;
        for (int i = 0; i < 100; i++) {
            System.out.println("zufall("+i+"):  "+ random.nextInt(2));

        }
    }
}
