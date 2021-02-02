package Daniel.Shapes;

import java.util.Locale;

public class Circle extends Shape {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.pow(radius, 2.0) * Math.PI;
    }

    @Override
    public String toString() {
        return getColor().toString().toLowerCase(Locale.ROOT) + " (hex color: " + Color.getHexColor(getColor()) + " )"
                + " circle with radius " + radius + " and area of " + getArea();
    }
}
