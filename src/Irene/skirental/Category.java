package Irene.skirental;

public enum Category {
    HELMET, SKI, STICKS, SKIBOOTS, GLASSES;

    public double getPrice() throws CategoryUnknownPriceException, TestException {
        switch (this) {
            case SKI -> {
                return 19.99;
            }
            case HELMET -> {
                return 14.99;
            }
//            case STICKS -> {
//                return 4.99;
//            }
            case GLASSES -> {
                return 9.99;
            }
            case SKIBOOTS -> {
//                return 24.99;
                throw new TestException(this);
            }
            default -> {
                throw new CategoryUnknownPriceException(this);
//                throw new TestException(this); //Es können keine zwei Exceptions gleichzeitig geworfen werden.
            }
        }
    }
}
