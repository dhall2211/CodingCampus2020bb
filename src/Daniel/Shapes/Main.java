package Daniel.Shapes;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(Color.RED, 7.9);
        Square square = new Square(Color.BLUE, 5.7);
        Shape shape = new Circle(Color.YELLOW, 9.6);

        var shapes = new LinkedList<Shape>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(shape);

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
