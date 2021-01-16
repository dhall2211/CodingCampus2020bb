package Irene.carworkshop;

public class Main {
    public static void main(String[] args) {
        Car carSuzuki = new Car("Suzuki Jimny", 40, 200, 130);
        Car carVW = new Car("VW Golf", 20, 75, 100);

        Driver driverMihael = new Driver("Mihael", carSuzuki);
        Driver driverIrene = new Driver("Irene", carVW);

        Gasstation shell = new Gasstation("Shell", 0.99f);

        Repairshop gerster = new Repairshop("Gerster", "Service", 50, 75);

        carSuzuki.driving(555, shell, gerster, driverMihael);
        carVW.driving(277, shell, gerster, driverIrene);
    }
}
