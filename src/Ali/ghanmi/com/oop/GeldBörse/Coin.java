package Ali.ghanmi.com.oop.GeldBörse;

public class Coin implements IMoney {
    public enum Metal{
        GOLD,
        SILBER,
        KUPFER
    };

    int value;
    Metal metal;

    public Coin(Metal metal, int value){
        this.metal = metal;
        this.value = value;
    }

    @Override
    public void pay() {
        System.out.println("Coin has exchanged in value " + value);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                ", metal=" + metal +
                '}';
    }
}
