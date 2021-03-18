package Bokhee.Fachladen2;

public class Customer implements IAgent{


    @Override
    public Enum askProductFor(Enum category) {
        return category;
    }

    @Override
    public void reserveProduct(IProduct product, Customer customer) {

    }
}
