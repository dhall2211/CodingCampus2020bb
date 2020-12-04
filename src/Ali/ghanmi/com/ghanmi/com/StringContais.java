package ghanmi.com;

public class StringContais {
    public static void string3() {
        String meinSatz1 = "Das  ist ein Satz Einmal mehr sage ich eines zu euch. Ein mensch hat ";
        int anzahl1 = 0;
        String[] Wort1 = meinSatz1.split(" ");
        for (int i = 0; i < Wort1.length; i++) {
            if (Wort1[i].contains("ein")) {
                anzahl1++;
            }

            System.out.println(anzahl1);


        }
    }

}