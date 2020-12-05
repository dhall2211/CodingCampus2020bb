package Alex.FotoApparat;
/***
 * Aufgabe
 * Erstellt nun ähnlich wie das “Objektiv” eine Klasse welche die Speicherkarte abbildet. Der
 * “FotoApparat” hat eine Eigenschaft die die Speicherkarte darstellt.
 * Die Speicherkarte sollte eine Marke, eine Speichergröße und einen belegten Speicherplatz
 * beinhalten.
 * Sollte mit der Methode “machFoto” auf dem “FotoApparat” ein Foto geschossen werden, so
 * verlieren wir 5 MB an Speicherplatz. Daher wäre es fein, wenn ich über einen getter
 * herausfinden kann, wie viel Speicherplatz noch frei ist (Prozent) und über einen separaten
 * getter wieviel Fotos ich noch schießen kann.
 * Tauscht die Speicherkarten aus und schießt Fotos auf beide Karten, am Ende gebt ihr aus
 * wie viel bei beiden Karten noch verfügbar ist.
 * Zusatz: Sollte der Speicherplatz eng werden, wäre eine Option zum löschen von einer
 * Anzahl x an Fotos noch praktisch.
 */
public class FotoApparatMain {
    public static void main(String[] args) {
        FotoApparat nikon = new FotoApparat("Nikon D30", 19.3f, "Taiwan", "Alles in Einem");
        FotoApparat sony = new FotoApparat("Sony Alpha A6500", 23.8f, "Japan", "Super Automatik");

        Objektiv nikonFishEye = new Objektiv(8, 20);
        Objektiv nikonStandard = new Objektiv(24, 80);
        nikon.setCurrentObjektiv(nikonStandard);

        Speicherkarte speicherkarte=new Speicherkarte("SanDisk Ultra R100",128000,0);


        System.out.println(nikon);
        System.out.println(sony);
        System.out.println(speicherkarte);

    }
}
