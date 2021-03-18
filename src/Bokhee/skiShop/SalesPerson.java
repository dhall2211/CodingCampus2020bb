package Bokhee.skiShop;

public class SalesPerson implements IProvider {
    private String firstName;
    private String lastName;

    public SalesPerson(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public void pickUp(Reservation reservation){

    }

    @Override
    public boolean isAvailable(Category category) {
        return false;
    }

    @Override
    public Reservation request(Category category) {
        return null;
    }
}
