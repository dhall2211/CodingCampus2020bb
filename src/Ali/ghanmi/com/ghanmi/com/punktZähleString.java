package ghanmi.com;

import java.util.Arrays;

public class punktZähleString {
    public static void textAnalyse() {
        String meinSatz = "Das ist ein Satz. Einmal mehr sage ich eines zu euch. Ein Mensch hat Hände.";
        char[] mySatz = meinSatz.toCharArray();
        char punkt = '.';
        int Counter=0;
        System.out.println(Arrays.toString(mySatz));
        for (char meineCharacter : mySatz) {
            System.out.println(meineCharacter);
            if(meineCharacter==punkt){
                Counter++;
            }
        }
        System.out.println(Counter);
    }
}