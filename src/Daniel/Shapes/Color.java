package Daniel.Shapes;

public enum Color {
    BLUE, YELLOW, RED;

    public static String getHexColor(Color color) {
        switch (color) {
            case RED:
                return "#FF0000";
            case BLUE:
                return "#0000FF";
            case YELLOW:
                return "#FFFF00";
        }
        throw new IllegalArgumentException("unknown color: " + color);
    }
}
