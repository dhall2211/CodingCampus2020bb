package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class SortAlg {

    public static ArrayList bucketSort(String[] contactIds) {


        ArrayList<String> aG = new ArrayList<String>();
        ArrayList<String> hN = new ArrayList<String>();
        ArrayList<String> oU = new ArrayList<String>();
        ArrayList<String> vZ = new ArrayList<String>();
        List<String> aToG = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
        List<String> hToN = Arrays.asList("h", "i", "j", "k", "l", "m", "n");
        List<String> oToU = Arrays.asList("o", "p", "q", "r", "s", "t", "u");
        //List<String> vToZ = Arrays.asList("v", "w", "x", "y", "z");


        // sort all contactIds by the first letter into the different containers
        for (int i = 0; i < contactIds.length; i++) {
            char contactLetter = contactIds[i].charAt(0);
            String letter = Character.toString(contactLetter);
            System.out.println(contactLetter);
            String test = "test";
            // grab the abc character that matches the contact letter

//TODO: changes this to a switch
            if (aToG.contains(letter)) {
                // if true the contactid has aTog
                String id = "";
                id = contactIds[i];
                aG.add(id);
            } else if (hToN.contains(letter)) {
                // if true the contactid has hToN
                String id = "";
                id =contactIds[i];
                hN.add(id);

            } else if (oToU.contains(letter)) {
                // if true the contactid has oToU
                String id = "";
                id = contactIds[i];
                oU.add(id);
            } else {
                // if true the contactid has vToZ
                String id = "";
                id = contactIds[i];
                vZ.add(id);
            }
            String[] result = new String[aG.size()];
            aG.toArray(result);
          //  return result;

        }
        return vZ;

    }

     //String [] sortedAG = sortAToG(aToG);
    // String [] sortedHT = sortHToN(hToN);
    // String [] sortedOU = sortOToU(oToU);
    //String [] sortedVZ =  sortVToZ(vToZ);


}


// then for every container sort the arrays how you prefer


// then add the arrays together and return one big array


//    public static String[] sortAToG(String[] data) {
//
//        // sort the number parts of the id
//
//
//
//    }
//
//    public static String[] sortHToN(String[] data) {
//        // sort the number parts of the id
//
//    }
//
//    public static String[] sortOToU(String[] data) {
//        // sort the number parts of the id
//
//    }
//
//    public static String[] sortVToZ(String[] data) {
//        // sort the number parts of the id
//
//    }


