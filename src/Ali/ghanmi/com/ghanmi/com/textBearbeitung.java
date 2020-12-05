package ghanmi.com;

import com.sun.jdi.Value;

import javax.print.DocFlavor;
import java.util.Arrays;

public class textBearbeitung {
    public static void textAnalyse() {


        String text = "ImWinter;trage_ich Handschue.";

       // String richtigtext = (text.replace(";", " ").replace("_", " "));
       // text.SplitWort(text);

         /*
        char[] ch = richtigtext.toCharArray();
        boolean isMatch = false;
        for (int i = 0; i < richtigtext.length() - 1; i++) {
            if ((ch[i] >= 'a') &&
                    (ch[i] <= 'z') &&
                    (ch[i + 1] >= 'A') &&
                    (ch[i + 1] <= 'Z')) {
                isMatch = true;
                ch[i]= (char)ch[i];


            } else {
                isMatch = false;
            }

        }




               // ch[i] = (char) (ch[i]);
                System.out.println(text);
                System.out.println(richtigtext);
               // System.out.println((ch[i]));
                System.out.println((richtigtext.indexOf("m")));
               // System.out.println(text.split("[A-Z]"));



            }

      */
    }


    public static String SplitWort(String word) {
        char[] chars = word.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                return word.substring(0, i) + " " + word.substring(i);
            }
        }
        return word;
    }

}