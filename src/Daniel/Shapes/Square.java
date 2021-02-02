package Daniel.Shapes;

import java.util.Locale;

public class Square extends Shape implements IVertex {
    private final double sideLength;

    public Square(Color color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    double getArea() {
        return Math.pow(sideLength, 2.0);
    }

    @Override
    public int getVertexCount() {
        return 4;
    }

    @Override
    public String toString() {
        return getColor().toString().toLowerCase(Locale.ROOT) + " (hex color: " + Color.getHexColor(getColor())
                + " )" + " square with side length " + sideLength + ", area of " + getArea() + " and "
                + getVertexCount() + " vertex";
    }
}
