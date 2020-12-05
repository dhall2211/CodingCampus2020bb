package ghanmi.com;

public class StripInString {
    public static void string2() {
        String tooMuchWhiteSpasse = "     Apfelsaft     ";

        System.out.println("\"" + tooMuchWhiteSpasse + "\".Strip() returns *" + tooMuchWhiteSpasse.strip() + "+");
        System.out.println("\"" + tooMuchWhiteSpasse + "\".stripLeading() returns *" + tooMuchWhiteSpasse.stripLeading() + "+");
        System.out.println("\"" + tooMuchWhiteSpasse + "\".stripTrailing() returns *" + tooMuchWhiteSpasse.stripTrailing() + "+");
        System.out.println("Hello".charAt(1));
        System.out.println("Hello".substring(3));//ohne die erste zwei zeichnen
        System.out.println("Hello".substring(1,4));

        System.out.println("Hello".contains("LL"));
        System.out.println("Hello".contains("ll"));

        System.out.println((int) 'l');
        System.out.println((int) 'L');

        //wie oft kommt eine wort kommt
        String meinSatz ="Das  ist ein Satz Einmal mehr sage ich ein es zu euch. Ein mensch hat ";
int anzahl = 0;
        String[] Wort=meinSatz.split(" ");
        for (int i =0 ; i< Wort.length; i++) {
            if (Wort[i].equalsIgnoreCase("ein")) {
                anzahl++;
            }
        }
            System.out.println(anzahl);

        int anzahl2 = 0;
        String[] Wort2=meinSatz.split(" ");
        for (int i =0 ; i< Wort2.length; i++) {
            if (Wort2[i].equalsIgnoreCase("ein")) {
                anzahl2++;
            }
        }
        System.out.println(anzahl);


        }


    }
