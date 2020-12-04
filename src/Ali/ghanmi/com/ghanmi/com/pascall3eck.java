package ghanmi.com;

public class pascall3eck {

    public static void pDreiEck() {
        int maxRow = 10;
        int[][] cache = new int[maxRow][maxRow];
        for (int r = 1; r <= maxRow; r++) {
            System.out.println();
            for (int c = 1; c <= r; c++) {
                int result = pascall(r, c, cache);
                System.out.print(result + " ");
            }
        }
    }

    private static int pascall(int r, int c, int[][] cache) {
        if (cache[r - 1][c - 1] != 0) {
            return cache[r - 1][c - 1];
        }
        if (r == c || c == 1) {
            // return cache[r-1][c-1]=1;
            return 1;
        }
        int result = pascall(r - 1, c - 1, cache) + pascall(r - 1, c, cache);
        cache[r - 1][c - 1] = result;
        return result;
    }
}



