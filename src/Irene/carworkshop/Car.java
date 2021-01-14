package Irene.carworkshop;

public class Car {
    private String carName;
    private float fuelLevel;
    private int kmBeforeService;
    private int kmBeforeTyreChange;

    public Car(String carName, float fuelLevel, int kmBeforeService, int kmBeforeTyreChange) {
        this.carName = carName;
        this.fuelLevel = fuelLevel;
        this.kmBeforeService = kmBeforeService;
        this.kmBeforeTyreChange = kmBeforeTyreChange;
    }

    public void driving(int km, Gasstation gasstation, Repairshop repairshop, Driver driverName){
        System.out.println(driverName.getDriverName() + " drives the " + carName + ".");
        for (int i=km; i > 0; --i){
            fuelLevel -= (0.11f * 1);
            kmBeforeService -= 1;
            kmBeforeTyreChange -= 1;
            if (fuelLevel <= 5){
                refueling(35, gasstation, repairshop, driverName);
            }
            if (kmBeforeService <= 0){
                servicing(200, gasstation, repairshop, driverName);
            }
            if (kmBeforeTyreChange <= 0){
                tyrechange(300, gasstation, repairshop, driverName);
            }
        }
        System.out.println(carName + " was driven by " + driverName.getDriverName() + " for " + km + " and the fuel level is currently at "
                + String.format("%.2f", fuelLevel) +
                " litres petrol.");
        System.out.println();
    }

    public void refueling(float litres, Gasstation gasstation, Repairshop repairshop, Driver driverName){
        fuelLevel += litres;
        System.out.println(
                carName +
                " was refueled with " +
                litres +
                " litres petrol. Currently the fuel level is at " +
                String.format("%.2f", fuelLevel) +
                " litres in the tank." +
                driverName.getDriverName() +
                " had to pay " +
                litres*gasstation.getFuelPricePerLitre() +
                "€");
    }

    public void servicing(int tillNextService, Gasstation gasstation, Repairshop repairshop, Driver driverName) {
        kmBeforeService += tillNextService;
        System.out.println(
                carName +
                " was serviced and is now able to drive " +
                tillNextService +
                " km until the next service. " +
                driverName.getDriverName() +
                " had to pay " +
                repairshop.getServicePrice() + "€");
    }

    public void tyrechange(int tillNextTyreChange, Gasstation gasstation, Repairshop repairshop, Driver driverName) {
        kmBeforeTyreChange += tillNextTyreChange;
        System.out.println(
                carName +
                        " wears new tyres now and is able to drive " +
                        tillNextTyreChange +
                        " km with them, before they have to be changed again. " +
                        driverName.getDriverName() +
                        " had to pay " +
                        repairshop.getTyreChangePrice() + "€");
    }
}
