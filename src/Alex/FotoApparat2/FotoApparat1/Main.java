package Alex.FotoApparat2.FotoApparat1;

/***
 * To do
 * loeschen von vielen fotos!!
 * array index variable einfügen damit nicht so viel doppelter code
 */

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
public class Main {
    public static void main(String[] args) {

        FotoApparat fotoApparat = new FotoApparat("Canon");
        Speicherkarte speicherkarte[] = new Speicherkarte[2];
        speicherkarte[0] = new Speicherkarte("Sony", 5, 100);
        speicherkarte[1] = new Speicherkarte("SanDisk", 5, 555);
        Berechnung berechnung = new Berechnung();


        System.out.println(fotoApparat);

        speicherkarte[0].machFoto();
        speicherkarte[0].machFoto();
        speicherkarte[0].machFoto();
        System.out.print(speicherkarte[0]);
        double berechnung0 = berechnung.berchnungProzent(speicherkarte[0].getMaxSpeicher(),
                speicherkarte[0].getAnzahlFotos(), speicherkarte[0].getEinFotoGroesse());
        System.out.printf("%.2f", berechnung0);
        System.out.print(" % ");
        System.out.println();
        speicherkarte[0].loeschFoto();
        speicherkarte[0].loeschFoto();
        System.out.print(speicherkarte[0]);
        berechnung0 = berechnung.berchnungProzent(speicherkarte[0].getMaxSpeicher(),
                speicherkarte[0].getAnzahlFotos(), speicherkarte[0].getEinFotoGroesse());
        System.out.printf("%.2f", berechnung0);
        System.out.print(" % ");
        System.out.println();

        speicherkarte[1].machFoto();
        speicherkarte[1].machFoto();
        speicherkarte[1].machFoto();
        System.out.print(speicherkarte[1]);
        double berechnung1 = berechnung.berchnungProzent(speicherkarte[1].getMaxSpeicher(),
                speicherkarte[1].getAnzahlFotos(), speicherkarte[1].getEinFotoGroesse());
        System.out.printf("%.2f", berechnung1);
        System.out.print(" % ");
        System.out.println();
        speicherkarte[1].loeschFoto();
        speicherkarte[1].loeschFoto();
        System.out.print(speicherkarte[1]);
        berechnung1 = berechnung.berchnungProzent(speicherkarte[1].getMaxSpeicher(),
                speicherkarte[1].getAnzahlFotos(), speicherkarte[1].getEinFotoGroesse());
        System.out.printf("%.2f", berechnung1);
        System.out.print(" % ");
        System.out.println();

    }
}
