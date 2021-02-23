package Ali.ghanmi.com.oop.GeldBörse;

public class BankNote implements IMoney {
    private String imageDescription;
    private int value;

    public BankNote(String imageDescription, int value){
        this.imageDescription = imageDescription;
        this.value = value;
    }

    @Override
    public void pay() {
        System.out.println("Banknote has been exchanged in value of " + value);
    }

    @Override
    public String toString() {
        return "BankNote{" +
                "imageDescription='" + imageDescription + '\'' +
                ", value=" + value +
                '}';
    }
}
