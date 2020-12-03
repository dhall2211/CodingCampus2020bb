package com.company;

public class Scan {
    public static void main(String[] args) {
        String first = "Danny";
        String last = "Hall";
        String fullname = "Danny Hall";
       // nameBuilder(first, last);
        // nameBuilder2<String> fullName = (n) -> {System.out.println(fullname); };

    }
    public static String nameBuilder( String first, String last) {
        String fullName = first + last;
        return fullName;
    }


}


