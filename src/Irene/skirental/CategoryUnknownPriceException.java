package Irene.skirental;

public class CategoryUnknownPriceException extends Exception {
    public CategoryUnknownPriceException(Category item) {super(item.name() + " does not have a price yet.");}
}
