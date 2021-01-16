package Irene.carworkshop;

public class Repairshop {
    private String shopName;
    private int servicePrice;
    private int tyreChangePrice;


    public Repairshop(String shopName, String serviceType, int servicePrice, int tyreChangePrice) {
        this.shopName = shopName;
        this.servicePrice = servicePrice;
        this.tyreChangePrice = tyreChangePrice;
    }

    public int getServicePrice() {
        return servicePrice;
    }


    public int getTyreChangePrice() {
        return tyreChangePrice;
    }
}
