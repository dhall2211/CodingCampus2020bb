package Ali.ghanmi.com.werkstatt;
/*
Auto und Werkstatt
Es soll ein Auto abgebildet werden, welches fahren kann und dabei Ressourcen verbraucht
(Treibstoff und Reifenabrieb). Um den Tank wieder auffüllen zu können, benötigen wir eine
Tankstelle. Die Tankstelle verrechnet dem Fahrer bei einer Tankung den Tankpreis, abhängig
vom getankten Treibstoff. Ist der km-Stand für den nächsten Service erreicht, muss das Auto
in die Werkstatt. Während dem Service wird überprüft, ob auch die Reifen gewechselt werden
müssen. Die Rechnung wird vom Fahrer beglichen.

Auto und Fahrer
Tankstelle
Werkstatt
Auto betanken
Service durchführen
 */
public class Tankstelle {
    private String name;
    private float preisProLiter;

    public Tankstelle(String name, float preisProLiter){
        this.name = name;
        this.preisProLiter = preisProLiter;
    }

    public float getPreisProLiter() {
        return preisProLiter;
    }
}
