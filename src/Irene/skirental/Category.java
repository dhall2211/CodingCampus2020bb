package Irene.skirental;

public enum Category {
    HELMET, SKI, STICKS, SKIBOOTS, GLASSES;

    public double getPrice() {
        switch (this) {
            case SKI -> {
                return 19.99;
            }
            case HELMET -> {
                return 14.99;
            }
            case STICKS -> {
                return 4.99;
            }
            case GLASSES -> {
                return 9.99;
            }
            case SKIBOOTS -> {
                return 24.99;
            }
            default -> {
                return 0;
            }
        }
    }
}
