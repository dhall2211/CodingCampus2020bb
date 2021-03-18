package Bokhee.Fachladen2;

public interface IProduct {
    void getName();

    int getCostPerDay();
    boolean reserve();
    boolean isReserved();

    enum Category {
        HELM, POLES, SKIBOOTS, GOGGLES, GLOVES, SLEIGH
    }

    public static int getCategory(Category category) {

        switch (category) {

            case HELM:
                return 5;
            case POLES:
                return 3;
            case GLOVES:
                return 6;
            case SKIBOOTS:
                return 10;
            case GOGGLES:
                return 4;
            case SLEIGH:
                return 7;
        }
        throw new IllegalArgumentException("Unknown Category :  " + category);

    }

}