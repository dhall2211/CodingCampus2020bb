package Ali.ghanmi.com.oop.MultiInterfaces;

public class Zahl implements IPrintStructure, ISimulate {
    private int value;

    public Zahl(int value){
        this.value = value;
    }

    @Override
    public void doDailySimulation() {
        System.out.println("Simulation:");
        for (int i = value; i >= 0; i--) {
            System.out.println("  " + i);
        }
    }

    @Override
    public void printStructure() {
        System.out.println("Anzahl Ziffern sind: " + String.format("%d", value).length());
    }
}
