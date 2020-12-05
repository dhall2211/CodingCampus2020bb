package ghanmi.com;

public class StringWelt {
    public static void string() {
        String helloWorld ="hello World";
        System.out.println(" " +helloWorld+ "\".charAt(1) returne "+helloWorld.charAt(1));

        System.out.println(" " +helloWorld+ "\".comperTo(Apfelsaft) returne "+helloWorld.compareTo("Apfelsaft"));
        System.out.println(" " +helloWorld+ "\".comperTo(Zugführer) returne "+helloWorld.compareTo("Zugfürer"));
        System.out.println(" " +helloWorld+ "\".comperTo(hello World) returne "+helloWorld.compareTo("hello World"));

        System.out.println(" " +helloWorld+ "\".equals(hello World) returne "+helloWorld.compareToIgnoreCase("hello World"));

        System.out.println(" " +helloWorld+ "\".equals(Zugführer) returne "+helloWorld.equals("Zugfürer"));
        System.out.println(" " +helloWorld+ "\".equals(hello World) returne "+helloWorld.equals("hello World"));

        System.out.println(" " +helloWorld+ "\".contact(\""+helloWorld+"\") returne "+helloWorld.contains(helloWorld));
        System.out.println(" " +helloWorld+ "\".contact(\""+"Apfelsaft"+"\") returne "+helloWorld.contains("Apfelsaft"));
        System.out.println(" " +helloWorld+ "\".contact(\""+"Worl"+"\") returne "+helloWorld.contains("Worl"));

        System.out.println(" " +helloWorld+ "\".toLowerCase() returne "+helloWorld.toLowerCase());
        System.out.println(" " +helloWorld+ "\".toUpperCase() returne "+helloWorld.toUpperCase());

        System.out.println(" " +helloWorld+ "\".startsWith(hell) returne "+helloWorld.startsWith("hello"));
        System.out.println(" " +helloWorld+ "\".startsWith(ld) returne "+helloWorld.startsWith("ld"));

        System.out.println(" " +helloWorld+ "\".endsWith(hell) returne "+helloWorld.endsWith("hello"));
        System.out.println(" " +helloWorld+ "\".endsWith(ld) returne "+helloWorld.endsWith("ld"));



        System.out.printf("%5d%n", 100);//fünf decimal zeigen(ohne die null vor dem 1)
        System.out.printf("%05d%n", 100);//fünf decimal zeigen(mit die leere "null" vor dem 1)

        // formatieren um statt in console zu zeigen, dass Strimg in eine andere ort zupeichern

        String myFormateString = String.format("%5d%n", 100);
        System.out.println(myFormateString);
        System.out.println(" " +helloWorld+ "\".indexOf(\"e\") returne "+helloWorld.indexOf("e"));


        //suche nach index"o"
        System.out.println(" " +helloWorld+ "\".indexOf(\"o\") returne "+helloWorld.indexOf("o"));
        ////suche nach index"o" ab index 6
        System.out.println(" " +helloWorld+ "\".indexOf(\"o\",6) returne "+helloWorld.indexOf("o",6));
        //suche nach index"e" starte von hinten
        System.out.println(" " +helloWorld+ "\".lastIndexOf(\"e\") returne "+helloWorld.lastIndexOf("e"));

        String blanks="           ";
        System.out.println("\" "+blanks+ "\"isBlank()"+ blanks.isBlank());//ist leer
        System.out.println("\" "+blanks+ "\"isEmpty()"+ blanks.isEmpty());//das feld exisatiert aber ist leere
        System.out.println("\"\"isEmpty()"+"".isEmpty()); //

        System.out.println(" " +helloWorld+ "\".repeat(5) returne "+helloWorld.repeat(5));//wiederholen

        System.out.println(helloWorld.replaceAll("World", "Ali"));//ersetzen

        String textForReplace ="ImWinter;trage_ich Handschue.";
        System.out.println(textForReplace.replaceAll(";"," ").replace("_"," "));
        System.out.println(textForReplace.replaceAll("[A-Z]+","[() A-Z]"));//buchstaben mit zeichne ersetzen

        System.out.println(textForReplace.replaceAll("regular ","standart "));//ein wort ändern

        String deutschsprache ="ÄÜÖäöü";
        System.out.println(deutschsprache + "==>" + deutschsprache
                .replaceAll("[Ä]","Ae")
                .replaceAll("[ä]","ae")
                .replaceAll("[Ü]","Ue")
                .replaceAll("[ü]","ue")
                .replaceAll("[Ö]","Oe")
                .replaceAll("[ö]","oe"));


        //bsp. PLZ muss 4 zahle lang sein, der erste zahl muss zwische 1 und 9
        //die andere 3 zahle zwischen 0 und 9>>>>>> sonst ist falsch
        //man kann diese Methoden für passwörter nützen.


        String testPLZ1 = "1235";
        String testPLZ2 = "235";
        String testPLZ3 = "12355";
        String testPLZ4 = "1aaa";
        System.out.println(testPLZ1 +" is Valid:  " + testPLZ1.matches("[1-9][0-9]{3}"));
        System.out.println(testPLZ2 +" is Valid:  " + testPLZ2.matches("[1-9][0-9]{3}"));
        System.out.println(testPLZ3 +" is Valid:  " + testPLZ3.matches("[1-9][0-9]{3}"));
        System.out.println(testPLZ4 +" is Valid:  " + testPLZ4.matches("[1-9][0-9]{3}"));










    }
}
