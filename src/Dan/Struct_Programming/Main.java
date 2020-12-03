package com.company;

import java.lang.reflect.Array;
import java.util.List;
import java.util.*;
import java.util.Arrays;
import java.io.File;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
//        try {
//            List<Integer> numbers = List.of(6, 23, 78, 34, 89, 2, 56, 78, 6, 30, 27, 81, 7, 7, 84, 20);
//            sorting(numbers);
//            System.out.println(sorting(numbers));
//        } catch (Exception e) {
//            System.out.println("what the fuck!");
//        }
        int[] arr = {1, 2, 3, 5, 66, 7, 34, 6};
        // System.out.println(Arrays.toString(arr));
        //printArray(arr);
        int[] businessResult = {1, 2, -5, 3, 10, -2, -1, -3, 0, 3, 6, 7};
        // findTheSum(businessResult);
//        int bestResult = findBestMonth(businessResult);
//        bestMonth(bestResult, businessResult);
//        int lowestResult = lowestMonth(businessResult);
//        lowestMonthIndex(lowestResult, businessResult);

        /**
         * the customer has a list of contacts. this list of contacts are save on a global DB.
         * each contact has an id based on the first letter of the lastname and the order from which it was save.
         * build a sorting algorythme to based on this number to show the the contact alphabetically and by the order it was saved.
         */

        String[] contactIds = {"a1", "g88", "h55", "z44", "j334", "l6", "s9444", "n99", "p2"};

//         ArrayList value = SortAlg.bucketSort(contactIds);
//        System.out.println(value);

        int startYear = 1990;
        int endYear = 2040;
        while (startYear <= endYear) {


            if ((startYear % 4 == 0) && (startYear % 100 == 0 || (startYear % 100 != 0)) || (startYear % 400 == 0)) {


                System.out.println("number of leap years from 1990-2040 are: " + startYear);
            } else {
                System.out.println(startYear);
            }

            startYear++;
        }
        int stuff[] = {1, 4, 6, 87, 9, 7, 66, 444, 33, 45};
        for (int j = 0; j < stuff.length; j++) {
            for (int i = 0; i < stuff.length - 1 - j; i++) {
                if (stuff[i] < stuff[i + 1]) {
                    int temp = stuff[i];
                    stuff[i] = stuff[i + 1];
                    stuff[i + 1] = temp;

                }

                System.out.println(Arrays.toString(stuff));

            }

        }

        String[] theBeatles = {"John", "Paul", "George", "Ringo"};
        int count = 0;
        int longestName = 0;
        String sName= "";
        String lName= "";
        int lP = 0;
        int sP = 0;
        int shortestName= 0;
        for (int i = 0; i < theBeatles.length-1; i++ ) {
            count +=1;
            int first = theBeatles[i].length();
            int second = theBeatles[i+1].length();

            if( first < second){
                 longestName = second;
                  lName = theBeatles[i+1];
                  lP = i+1;

            }
            if (first < second) {
                shortestName = first;
                sName = theBeatles[i-1];
                sP= i-1;
            }


           // int currentCount = theBeatles[i].length();
            //System.out.println(test);
        }
        System.out.println("There are " + count + " Students");
        System.out.println("The longest name is " + lName + " it has " + longestName + " characters " + "on position " + lP);
        System.out.println("The shortest name is " + sName + " it has " + shortestName + " characters " + "on position " + sP);

int index= 0;

        for (int i = 0; i < theBeatles.length; i++) {
            for(int j =0; j < theBeatles.length; j++) {
                int temp= 0;
                int result = 0;
                String first = theBeatles[i];
                String second = theBeatles[j];
                 result = first.compareTo(second);
                if(temp < result) {
                    String lastName = theBeatles[i];
                    //
                    // System.out.println(firstName);

                }

                System.out.println("fffffuck " + result + first + second);
            }

        }

    }
}
//    public static List sorting(List<Integer> numbers) {
//    //   numbers.sort(Integer::compareTo);
//      //  System.out.println(numbers);
//       // return numbers;
//
//      for (int i = 0; i < numbers.length; i++) {
//           int num1 = numbers.get(i);
//           int num2 = numbers.get(i + 1);
//           if (num1 < num2) {
//
//
//           } else {
//               num1
//           }
//       }
//
//    }

//    public static void printArray(int[] data) {
//
//        System.out.print("[");
//        for (int i = 0; i < data.length; i++) {
//
//            //int [] numb = data[i];
//
//            //System.out.print("[" + data + ", " + [data.length-1] + "]");
//            System.out.print(data[i]);
//
//            if (i < data.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//
//    }

//    public static void findTheSum(int[] data) {
//        int sum = 0;
//        for (int i = 0; i < data.length; i++) {
//            sum += data[i];
//            System.out.println("Gesamtergebnis: " + sum);
//        }
//
//    }

//    public static int findBestMonth(int[] data) {
//        int highNumber = data[0];
//        int newNumber = -10000;
//        for (int i = 0; i < data.length; i++) {
//
//            int testNumber = data[i];
//            if (highNumber >= testNumber) {
//                newNumber = highNumber;
//            } else {
//                newNumber = testNumber;
//                highNumber = newNumber;
//            }
//        }
//        System.out.println(newNumber);
//        return newNumber;
//
//    }

//    public static void bestMonth(int highNumber, int[] results) {
//        for (int i = 0; i < results.length; i++) {
//            if (highNumber == results[i]) {
//                System.out.println(i);
//            }
//        }
//
//    }

//    public static int lowestMonth(int[] bResults) {
//        int lowNumber = bResults[0];
//        int newNumber = 10000;
//        for (int i = 0; i < bResults.length; i++) {
//            int testNumber = bResults[i];
//            if (lowNumber <= testNumber) {
//                newNumber = lowNumber;
//            } else {
//                newNumber = testNumber;
//                lowNumber = newNumber;
//            }
//
//        }
//        System.out.println(newNumber);
//        return newNumber;
//    }
//
//    public static void lowestMonthIndex(int lowNumber, int[] results) {
//        for (int i = 0; i < results.length; i++) {
//            if (lowNumber == results[i]) {
//                System.out.println(i);
//            }
//        }
//
//    }


