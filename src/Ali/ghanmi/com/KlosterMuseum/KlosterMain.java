package Ali.ghanmi.com.KlosterMuseum;

public class KlosterMain {
    /*Aufgabe: Kloster-Museum
Es gibt ein Kloster-Museum, das aus Ausstellungsräume besteht. In den Ausstellungsräumen können
Kunststücke ausgestellt werden. Ein Kunststück ist identifiziert mit dem Typ, Titel, Künstlername,
Entstehungsjahr und Preis.
In dem Kloster-Museum sind verschiedene Leute Unterwegs:
 Kurator
 Museum-Wächter (Nonne)
 Besucher
 Kunstdieb
Das Kloster-Museum ist ab Dienstag bis Sonntag zwischen 09.00 und 17.00 Uhr offen. Montag ist
Ruhetag.
Über die Simulation
Die Simulation basiert auf die Menschen (plus ein Extra für das Kloster-Museum) und hat einen Takt
von 15 Minuten:
 Kloster-Museum
o Wenn der Museum offen ist (bis 16.00) generiert neu Besuchern oder Kunstdiebe.
Besucher kann mit einem Besuchergenerator erstellt werden (Name, Alter, Wohnort
zufällig generieren.
 Besucher
o Der Besucher kann ein zufälliges Kunstobjekt im Ausstellungsraum betrachten
o Der Besucher kann in den nächsten (zufälligen) Raum gehen.
o Der Besucher kann das Kloster-Museum verlassen und nach Hause gehen, wenn er
müde ist.
o Beim Schließen des Museums muss er das Museum verlassen.
 Kurator
o Sammelt Spenden (zufällige Summe)
o Sucht neue Kunststücke zu kaufen. Kunststücke sind mit Kunststückgenerator zu
erstellen (Typ, Title, Künstler, Entstehungsjahr, Preis). Wenn der Kurator
ausreichenden Spenden gesammelt hat, kann das Kunststück kaufen und in einen
zufälligen Ausstellungsraum bringen.
 Museum-Wächter (Nonne)
o Die Nonnen verlassen das Museum nicht
o Sie gehen Raum zu Raum, um die Sicherheit zu garantieren
 Kunstdieb
o Der Kunstdieb kann ein zufälliges Kunstobjekt im Ausstellungsraum betrachten
o Wenn ein Kunstdieb allein in einem Raum ist (weder andere Besucher noch Wächter)
dann, wird er das betrachteten Kunststück in die Tasche stecken. Nach dem
erfolgreichen Raub, verlässt er das Kloster-Museum.
o Der Kunstdieb kann in den nächsten (zufälligen) Raum gehen.
o Der Kunstdieb kann das Kloster-Museum verlassen und nach Hause gehen, wenn er
müde ist.
o Beim Schließen des Museums muss er das Museum verlassen.
Schritte zu implementieren:
1. UML Klassendiagram(Optional)
2. Statische Aufbau von Kloster-Museum, Ausstellungsraum, Kunststücke
3. Kunststück-Generator
4. Besucher Klasse
5. Besucher Generator
6. Simulation Kloster-Museum
7. Simulation Besucher
a. Raum zu Raum gehen
b. Kunststück betrachten
c. Museum Verlassen
8. Museum-Wächter Klasse und die Simulation
9. Kunstdieb Klasse und die Simulation
10. Kurator Klasse und die Simulation

     */
    public static void main(String[] args) {
        Museum museum = new Museum("Kloster Art");
        Room room100 =new Room(100);
        Room room200 =new Room(200);
        Room room300 =new Room(300);
        Room room400 =new Room(400);


        Painting ciel = new Painting("Gemälde","Ciel","Marco",2019,300);
        Painting laCote = new Painting("Gemälde","Uffer ","Marco",2019,500);
        Painting theMountain = new Painting("Gemälde","The Mountain","Marco",2019,700);


        Painting provence = new Painting("Gemälde","Provence","Marco",2020,500);
        Painting alres = new Painting("Gemälde","arles","Marco",2020,1500);
        Painting azur = new Painting("Gemälde","Azur","Marco",2020,2500);
        Painting marina= new Painting("Gemälde","Marina","Marco",2020,3500);

        Painting port = new Painting("Gemälde","port","Marco",2018,5000);
        Painting estrel = new Painting("Gemälde","estrel","Marco",2018,5000);
        Painting petanque = new Painting("Gemälde","Petanque","Marco",2018,5000);

        Painting aix = new Painting("Gemälde","Aix","Marco",2020,500);
        Painting notreDame = new Painting("Gemälde","Notre Dame","Marco",2020,500);
        Painting navire = new Painting("Gemälde","Navire","Marco",2020,500);

        Visitor Fritz =new Visitor("fritz","Au",95);


        museum.addRomm(room100);
        museum.addRomm(room200);
        museum.addRomm(room300);
        museum.addRomm(room100);

        room100.addPainting(aix);
        room100.addPainting(notreDame);
        room100.addPainting(navire);

        room200.addPainting(petanque);
        room200.addPainting(port);
        room200.addPainting(provence);

        room300.addPainting(petanque);
        room300.addPainting(azur);
        room300.addPainting(alres);
        room300.addPainting(ciel);


        room400.addPainting(laCote);
        room400.addPainting(theMountain);
        room100.addVisitorToRoom(Fritz);
       //System.out.println(museum);
        museum.dailyRoutine();
    }
}
