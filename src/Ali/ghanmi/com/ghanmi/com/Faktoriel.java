package ghanmi.com;

public class Faktoriel {
    public static void fac() {
        int parama = 5;
        System.out.println(" " + parama + "! = " + fakt(parama));
        System.out.println(" " + parama + "! = " + fakt2(parama));

    }


    public static long fakt(int n) {
        System.out.println("fakt "+n+" Begin");
        long result = 1;
        if (n > 1) {
            result = n * fakt(n - 1);
        }
        System.out.println("fakt "+n +"  End");
        return result;
    }

    public static long fakt2(int n) {
        long result = 1;
        for (int i = 1; i <= n; ++i) {
            result = result * i;
        }
        return result;
    }
}