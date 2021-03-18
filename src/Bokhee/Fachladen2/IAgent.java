package Bokhee.Fachladen2;

public interface IAgent {
    Enum askProductFor(Enum category);

    void reserveProduct(IProduct product, Customer customer);
}
