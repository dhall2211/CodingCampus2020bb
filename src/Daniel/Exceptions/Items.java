package Daniel.Exceptions;

public enum Items {
    SKI, HELMET, BOOTS, STICKS;

    public double getPrice() throws ItemUnknownPriceException {
        switch (this) {
            case SKI -> {
                return 19.9;
            }
            case BOOTS -> {
                return 9.9;
            }
            case HELMET -> {
                return 4.9;
            }
            default -> {
                throw new ItemUnknownPriceException(this);
            }
        }
    }
}
