package ghanmi.com;

public class SatzVollerHand {
    public static void wortZählen() {
        //Aufgabe: Wie oft kommt das Satzzeichen '.' vor?
        String text = "Das ist ein Satz. Einmal mehr sage ich eines zu euch. Ein Mensch hat Hände"
                + " Im Winter trage ich Handschuhe.";
        text = normalizzeText(text);
        String[] words = text.split(" ");
        int counter = 0;
        for (String word : words) {
            if (word.equals("ein")) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static String normalizzeText(String text) {

        text = text.replace(".", " ");
        text = text.replace("?", " ");
        text = text.replace("[0-9"," ");
        text = text.replace(")"," ");
        text = text.replace("("," ");
        text = text.replace(","," ");
        text = text.replace("/"," ");//898
        text = text.replace(":"," ");//907
        text = text.replace("  "," ");// 807 doppel space durch 1space ersetzen
        text = text.replace("-"," ");//811
        text = text.replace("_"," ");

       // text = text.toLowerCase();


        return text;
    }
}