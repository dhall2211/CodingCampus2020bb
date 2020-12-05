package ghanmi.com;

import com.sun.jdi.Value;

public class Journal {

    public static void journalTex() {
            String str = "JournalDev";

            //string to char array
            char[] chars = str.toCharArray();
            System.out.println(chars.length);

            //char at specific index
            char c = str.charAt(2);
            System.out.println(c);

            //Copy string characters to char array
            char[] chars1 = new char[7];
            str.getChars(0, 7, chars1, 0);
            for (int i=0;i<chars.length-1;i++){
                if (chars[i] == 0 ){
                    int char1=i;
                    int  char2=i+1;

                    //int buchstabe=chars[i];
                //  System.out.println(char1+ " "+char2);
                }
            }

        }

    }


