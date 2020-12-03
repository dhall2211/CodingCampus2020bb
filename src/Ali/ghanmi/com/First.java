package Ali.ghanmi.com;

public class First {
    public static void textAnalyse() {
        String text = "ImWinter;trage_ich Handschue.";
        char leere = ',';
        String richtigtext = (text.replace(";", " ").replace("_", " "));

        char[] ch = richtigtext.toCharArray();
        for (int i = 0; i < richtigtext.length() - 1; i++) {
            if ((ch[i] >= 'a') &&
                    (ch[i] <= 'z') &&
                    (ch[i + 1] >= 'A') &&
                    (ch[i + 1] <= 'Z')) {


                ch[i] = (char) (ch[i]);
                System.out.println(text);
                System.out.println(richtigtext);
                //System.out.print((ch[i - 1]));


            }


        }
        System.out.println();

    }
}




