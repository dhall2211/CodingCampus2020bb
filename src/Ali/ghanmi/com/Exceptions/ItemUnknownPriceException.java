package Ali.ghanmi.com.Exceptions;

public class ItemUnknownPriceException extends Exception {
    public ItemUnknownPriceException(Items item) {
        super(item.name() + " hat keinen Preis hinterlegt!");
    }
}
