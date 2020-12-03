package com.company;

import java.util.Arrays;

public class G {
    static int konto = 1000;
    public static void main(String[] args) {
        addHundert();
        System.out.println(konto);

        int kontoArray[] = {1000};
        addHundert(kontoArray);
        System.out.println(Arrays.toString(kontoArray));
    }


    public static void addHundert(){
        konto += 100;
    }

    public static void addHundert(int[] kontoList){
        kontoList[0] += 100;
    }
}
