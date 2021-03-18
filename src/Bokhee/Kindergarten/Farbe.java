package Bokhee.Kindergarten;

public enum Farbe {
    BROWN, WHITE, BLACK, GOLD, GRAY, RED;

    public static String getColor(Farbe farbe) {
        switch (farbe) {
            case BROWN:
                return "brown";
            case WHITE:
                return "white";
            case BLACK:
                return "black";
            case GOLD:
                return "gold";
            case GRAY:
                return "gray";
            case RED:
                return "red";
        }
        throw new IllegalArgumentException("unknown color : " + farbe);

    }


}
