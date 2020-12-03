package com.company;

import java.util.Arrays;

public class Random2D {
    public static void main (String[] args) {
        char[][] myField = initArray(80, 80);
        //drawFilledRect(myField, 5, 10, 'x');

        //drawLine(myField);
        drawRect(myField, 4, 5);


        printArea(myField);
    }

    public static char[][] initArray(int rows, int columns){
        char[][] gArr = new char[rows][columns];
        for (int row = 0; row < gArr.length; row++) {
            for (int column = 0; column < gArr[row].length; column++) {
                gArr[row][column]= '.';

            }
        }
        return gArr;
    }

    public static void drawFilledRect(char[][] gArr, int lng, int wdth, char charToUse){
        for(int row = 0; row < gArr.length; row++){
            for(int column = 0; column < gArr[row].length; column++) {
                if(row < wdth && lng > column) {
                    gArr[row][column] = 'x';
                }
            }

        }


    }

    public static void drawRect(char[][] gArr, int lng, int wdth) {
        for(int row = 0; row < gArr.length; row++){
            for(int column = 0; column < gArr[row].length; column++) {
                if ( column < 5) {
                    gArr[wdth][column] = 'j';

                }
                   if (row < 5) {
                       gArr[row][lng] = 'j';
                   }
                   if (row == 0 && column < 4) {
                       gArr[row][column] = 'j';
                   }
                   if (row < 5 && column == 0) {
                       gArr[row][column] = 'j';
                }



            }

        }


    }
//    public static void twoloopsRect(char[][] gArr) {
//        for (int column = 0; column < gArr.length;  column++) {
//            if(startPoint = column || endpoint = column)
//        }
//    }
    public static void drawLine(char[][] gArr) {
        for(int column =0; column < gArr.length; column++) {
            for (int row = 0; row < gArr[column].length; row++ ) {
                if (column =='0' && row < 11) {
                    gArr[row][column] = 'y';

                }

            }
        }


    }

    public static void printArea(char[][] field) {
        for(int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++){
                System.out.print(field[row][column]);
                System.out.print(' ');
            }
            System.out.println();
        }

    }
}
