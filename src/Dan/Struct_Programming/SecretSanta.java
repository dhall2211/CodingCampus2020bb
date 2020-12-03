import java.util.Arrays;
import java.util.Random;

public class SecretSanta {
    static Random random = new Random();
    public static void main(String[] args) {
        String[] names = {"Alex", "Dan", "Klaus", "Eric", "Bokhee", "Irene", "Lukas", "Sabrina", "Marcella", "Ali", "Samet", "Mihael", "Gyula"};
        String[] secretSanta =Arrays.copyOf(names, names.length);
        while(!isSecretSantaValid(names, secretSanta)) {
            mixNames(secretSanta);
        }
        printSanta(names, secretSanta);

    }
    public static boolean isSecretSantaValid (String[] names, String[] secretSanta) {
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(secretSanta[i])){
            return false;
            }
        }
        return true;
    }
    public static void mixNames (String[] secretSanta) {
        int positionA = random.nextInt(secretSanta.length);
        int positionB = random.nextInt(secretSanta.length);
        String temp = secretSanta[positionA];
        secretSanta[positionA] = secretSanta[positionB];
        secretSanta[positionB]= temp;
    }

    public static void printSanta(String[] names, String[] secretSanta) {
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i] + "->" + secretSanta[i]);

        }

    }
}


