package Ali.ghanmi.com;

public class Arrays2D {
    /*
    public static void main(String[] args) {
        char[][] arr2D = new char[10][10];
        printarr2d(arr2D);
        printSelectedfield(arr2D);

    }

    private static void printarr2d(char[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]);
            }
            System.out.println();
        }


        private static void printSelectedfield(char[][] arr2D){
            char c = 'x';
            for (int i = 0; i < arr2D.length; i++) {
                for (int j = 0; j < arr2D[i].length; j++) {
                    i = c;

                    System.out.println(c);

                }
            }
        }
    }
}
*/

    public static void main(String[] args) {
        char[][] myField = initArray(80, 80);

        //drawSquare(myField, 10);
        drawCircle(myField,1,48,30);
        //drawLine(myField, 0, 10, 10,0);
        // drawLine(myField, 0, 10, 10,10);
        //drawLine(myField, 7, 3, 7,10);
        //drawLine(myField, 10, 10, 0,20);
        //drawLine(myField, 7, 7, 10,13);
        printField(myField);
        ;

    }

    // intialisierung eine leere 2d arrays
    public static char[][] initArray(int rows, int columns) {
        char[][] retVal = new char[rows][columns];
        for (int row = 0; row < retVal.length; row++) {
            for (int column = 0; column < retVal[row].length; column++) {
                retVal[row][column] = '.';
            }
        }
        return retVal;
    }

    // print von feld
    public static void printField(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                System.out.print(field[row][column]);
            }
            System.out.println();
        }
    }

    public static void drawSquare(char[][] field, int size) {
        for (int i = 0; i < size ; i++) {
            field[0][i] = 'o';//startet oben link i0 bis i4 row XXXXX
            field[i][0] = 'o';///startet oben link i0  richtung unten i4 column
            //X
            //X
            //X
            //X
            //X
            field[size - 1][i] = 'h';//startet unten i4 bis i4 row XXXXX
            field[i][size - 1] = 'h';
            //startet oben rechts i4 bis richtung unten i4 column
            //X
            //X
            //Xint startrow
            //X
            //X
        }
    }


    public static void drawCircle(char[][] field, int centerRow, int centerColumn, int radius){
        for (int i = 0; i < (10*radius); i++) {
            double angle = 2*i*Math.PI/(10*radius);
            int posY = centerRow + (int)Math.round(radius*Math.sin(angle));
            int posX = centerColumn + (int)Math.round(radius*Math.cos(angle));
            field[posY][posX] = '$';
        }
    }







    public static void drawLine(char[][] field, int startRow, int startColumn, int endRow, int endColumn) {
        char charToFill = 'o';
        int vectorRow = endRow - startRow;
        int vectorColumn = endColumn - startColumn;
        float ratio = (vectorColumn != 0) ? (float) vectorRow / (float) vectorColumn : (float) vectorRow*1000;//?= if, : = else

        if (Math.abs(ratio) <= 1) {
            int stepColumn = (vectorColumn != 0) ? vectorColumn / Math.abs(vectorColumn) : 0;
            for (int posColumn = startColumn; posColumn != endColumn; posColumn += stepColumn) {
                int posRow = Math.round(startRow + (posColumn - startColumn)*ratio);
                field[posRow][posColumn] = charToFill;
            }
        } else {
            int stepRow = (vectorRow != 0) ? vectorRow / Math.abs(vectorRow) : 0;
            for (int posRow = startRow; posRow != endRow; posRow += stepRow) {
                int posColumn = Math.round(startColumn + (posRow - startRow) / ratio);
                field[posRow][posColumn] = charToFill;
            }
        }
        field[endRow][endColumn] = charToFill;
    }
}