package Ali.sqlDbBANKOMAT;
/*
Bankomat
Es soll ein kleines Konsolen-Programm für einen Bankomaten geschrieben werden. Dabei wird
bei Aufruf die “Kundennummer” (Kontonummer) und die dazugehörige PIN abgefragt. Im
Anschluss wird der aktuelle Kontostand ausgegeben und die Möglichkeit angeboten, Geld einoder auszuzahlen. Diese einzelnen Ein- und Auszahlungen nennen wir Transaktionen und
haben folgende Eigenschaften: wann hat wer wie den Kontostand verändert. Die Summe der
Transaktionen ergibt den aktuellen Kontostand. Zusätzlich wird dem User die Möglichkeit
geboten, alle Transaktionen in ein CSV exportieren zu können (absteigend nach Datum
sortiert).
Rahmenbedingungen:
- Der PIN soll nicht im Klartext, sondern als SHA-Hash gespeichert werden:
https://dev.mysql.com/doc/refman/8.0/en/encryption-functions.html#function_sha2
- Der Kontostand soll über eine View bereitgestellt werden (select sum(..) from … group
by kontonummer)
- Der CSV Export soll die ResultSetMetadata Info verwenden, um die Spalten im CSV
dynamisch (unabhängig von Änderungen) exportieren zu können. Der Spaltenname soll
auch so übernommen werden.
Ablauf:
1. ER Diagramm für die Problemstellung
2. Datenbank erstellen (DDL oder MySQL Workbench)
3. Beispieldaten einfügen (DML oder MySQL Workbench)
4. UML Klassendiagramm erstellen
5. Konsolenanwendung in Java
a. PIN Eingabe - Login am Bankomat
b. Kontostand ausgeben
c. Einzahlung (dann wieder zurück zum Kontostand)
d. Auszahlung (dann wieder zurück zum Kontostand)
e. CSV Export der Transaktione
*/

public class Main {
    public static void main(String[] args) {
        Cash.cash();


    }
}
