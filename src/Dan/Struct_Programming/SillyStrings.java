import org.w3c.dom.ls.LSOutput;

public class SillyStrings {
    public static void main (String [] args) {
        String sent = "Das ist ein Satz. Einmal mehr sage ich eines zu euch. Ein Mensch hat Hande.";
        var result = sent.toCharArray().length;
        StringBuilder stringBuilder =new StringBuilder();


     String text = normalizeText(sent);
     String [] words = text.split(" ");

     int counter = 0;

     for(String word : words) {
         if(word.equals("hand")) {
             counter ++;
         }

     }
        System.out.println("there are " + counter + " in the sentence");

    }

private static String normalizeText (String text) {
       text =  text.replace(".", "");
        text = text.toLowerCase();
        return text;
}
    

}
