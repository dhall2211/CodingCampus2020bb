package Sabrina.Zoo2;


public class Main {
    public static void main(String[] args) {
        Zoo wildpark = new Zoo("Wildpark");

        Enclosure wildKatzenGehege = new Enclosure ("Wildkatzengehege", wildpark);
        Enclosure flusspferdGehege = new Enclosure("Flusspferdgehege", wildpark);

        Animal wildKatze = new Animal("Leo", "Wildkatze", wildKatzenGehege);
        Animal leopard = new Animal ("Leonardo", "Raubkatzen", wildKatzenGehege);
        Animal luchs = new Animal ("Susi", "Luchs", wildKatzenGehege);

        Zookeeper franz = new Zookeeper("franz", "Wildkatze", wildpark);

        Veterinary dottore = new Veterinary("Dr. Müller", wildpark);

        franz.assignEnclosure(wildKatzenGehege);
        franz.assignEnclosure(flusspferdGehege);
        wildpark.printStructure("----");

    }
   }


